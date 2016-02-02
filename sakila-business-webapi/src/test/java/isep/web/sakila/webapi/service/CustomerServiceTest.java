package isep.web.sakila.webapi.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import isep.web.sakila.jpa.config.PersistenceConfig;
import isep.web.sakila.webapi.model.CustomerWO;


@SpringApplicationConfiguration(classes = PersistenceConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class CustomerServiceTest {

	@Autowired
	private CustomerService service;
	
	@Test
	public void testFindAllCustomers() {
		Assert.assertEquals(599, service.findAllCustomers().size());
	}

	@Test
	public void testFindById() {
		Assert.assertEquals("MARY", service.findById(1).getFirstName());
	}

	@Test
	public void testSaveCustomer() {
		CustomerWO customerWO = new CustomerWO(600, "zpeng", "zpeng", null, 200, 1);
		service.saveCustomer(customerWO);
		Assert.assertEquals("zpeng", service.findById(600).getFirstName());
	}

	@Test
	public void testUpdateCustomer() {
		CustomerWO updateWO = service.findById(600);
		updateWO.setFirstName("test");
		service.updateCustomer(updateWO);
		Assert.assertEquals("test", service.findById(600).getFirstName());
	}

	@Test
	public void testDeleteCustomerById() {
		service.deleteCustomerById(600);
		Assert.assertEquals(599, service.findAllCustomers().size());
	}

}
