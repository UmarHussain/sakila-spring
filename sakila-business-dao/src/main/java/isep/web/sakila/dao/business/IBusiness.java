package isep.web.sakila.dao.business;

import java.util.List;

import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.jpa.entities.Address;
import isep.web.sakila.jpa.entities.City;
import isep.web.sakila.jpa.entities.Customer;
import isep.web.sakila.jpa.entities.Film;
import isep.web.sakila.jpa.entities.Staff;

public interface IBusiness {
	
	public List<Actor> getAllActors();
	
	public Actor getByID(int actorId);
	
	public List<Customer> getAllCustomers();
	
	public Customer getByCustomerID(int customerId);
	
	public List<Address> getAllAddresses();
	
	public Address getByAddressID(int addressId);
	
	public List<City> getAllCities();
	
	public City getByCityID(int cityId);
	
	public List<Film> getAllFilms();
	
	public Film getByFilmID(int filmId);
	
	public List<Staff> getAllStaffs();
	
	public Staff getByStaffID(int staffId);
}
