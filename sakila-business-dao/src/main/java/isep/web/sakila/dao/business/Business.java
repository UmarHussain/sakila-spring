package isep.web.sakila.dao.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import isep.web.sakila.dao.repositories.ActorRepository;
import isep.web.sakila.dao.repositories.AddressRepository;
import isep.web.sakila.dao.repositories.CityRepository;
import isep.web.sakila.dao.repositories.CustomerRepository;
import isep.web.sakila.dao.repositories.FilmRepository;
import isep.web.sakila.dao.repositories.StaffRepository;
import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Address;
import isep.web.sakila.jpa.entities.City;
import isep.web.sakila.jpa.entities.Customer;
import isep.web.sakila.jpa.entities.Film;
import isep.web.sakila.jpa.entities.Staff;


@Service("business")
public class Business implements IBusiness {

	@Autowired
	private ActorRepository actorRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CityRepository cityRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private FilmRepository filmRepository;
	
	@Autowired
	private StaffRepository staffRepository;
	
	@Override
	public List<Actor> getAllActors() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(actorRepository.findAll());
	}

	@Override
	public Actor getByID(int actorId) {
		// TODO Auto-generated method stub
		return actorRepository.findOne(actorId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(customerRepository.findAll());
	}

	@Override
	public Customer getByCustomerID(int customerId) {
		// TODO Auto-generated method stub
		return customerRepository.findOne(customerId);
	}

	@Override
	public List<Address> getAllAddresses() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(addressRepository.findAll());
	}

	@Override
	public Address getByAddressID(int addressId) {
		// TODO Auto-generated method stub
		return addressRepository.findOne(addressId);
	}

	@Override
	public List<City> getAllCities() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(cityRepository.findAll());
	}

	@Override
	public City getByCityID(int cityId) {
		// TODO Auto-generated method stub
		return cityRepository.findOne(cityId);
	}

	@Override
	public List<Film> getAllFilms() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(filmRepository.findAll());
	}

	@Override
	public Film getByFilmID(int filmId) {
		// TODO Auto-generated method stub
		return filmRepository.findOne(filmId);
	}

	@Override
	public List<Staff> getAllStaffs() {
		// TODO Auto-generated method stub
		return Lists.newArrayList(staffRepository.findAll());
	}

	@Override
	public Staff getByStaffID(int staffId) {
		// TODO Auto-generated method stub
		return staffRepository.findOne(staffId);
	}

}
