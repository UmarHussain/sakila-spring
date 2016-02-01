package isep.web.sakila.webapi.service;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import isep.web.sakila.dao.repositories.CustomerRepository;
import isep.web.sakila.jpa.entities.Customer;
import isep.web.sakila.webapi.model.CustomerWO;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	private static final Log log = LogFactory.getLog(CustomerServiceImpl.class);

	@Override
	public CustomerWO findById(int id) {
		
		log.debug(String.format("Looking for customer by Id %s", id));
		Customer customer = customerRepository.findOne(id);
		
		if(customer != null){
			return new CustomerWO(customer);
		}
		return null;
	}

	@Override
	public void saveCustomer(CustomerWO customerWO) {
		
		Customer customer = new Customer();
		customer.setFirstName(customerWO.getFirstName());
		customer.setLastName(customerWO.getLastName());
		customer.setEmail(customerWO.getEmail());
		customer.setAddress(customerWO.getAddress());
		customer.setStore(customerWO.getStore());
		customer.setCreateDate(customerWO.getCreateDate());
		customer.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		
		customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(CustomerWO customerWO) {

		Customer customer = customerRepository.findOne(customerWO.getCustomerId());
		
		customer.setFirstName(customerWO.getFirstName());
		customer.setLastName(customerWO.getLastName());
		customer.setEmail(customerWO.getEmail());
		customer.setAddress(customerWO.getAddress());
		customer.setStore(customerWO.getStore());
		customer.setCreateDate(customerWO.getCreateDate());
		customer.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		
		customerRepository.save(customer);
	}

	@Override
	public void deleteCustomerById(int id) {
		
		customerRepository.delete(id);
		
	}

	@Override
	public List<CustomerWO> findAllCustomers() {

		List<CustomerWO> customers = new LinkedList<CustomerWO>();
		
		for (Customer customer : customerRepository.findAll()) {
			customers.add(new CustomerWO(customer));
			log.debug("Adding " + customer);
		}
		return customers;
	}
	
	
}
