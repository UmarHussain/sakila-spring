package isep.web.sakila.dao.business;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import isep.web.sakila.jpa.config.PersistenceConfig;

@SpringApplicationConfiguration(classes = PersistenceConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class BusinessTest {

	@Autowired
	private IBusiness business;
	
	@Test
	public void testGetAllActors() {
		Assert.assertEquals(200, business.getAllActors().size());
	}

	@Test
	public void testGetByID() {
		Assert.assertEquals("GUINESS", business.getByID(1).getLastName());
	}

	@Test
	public void testGetAllCustomers(){
		Assert.assertEquals(599, business.getAllCustomers().size());
	};
	
	@Test
	public void testGetByCustomerID(){
		Assert.assertEquals("MARY", business.getByCustomerID(1).getFirstName());
	};
	
	@Test
	public void testGetAllAddresses(){
		Assert.assertEquals(603, business.getAllAddresses().size());
	};
	
	@Test
	public void testGetByAddressID(){
		Assert.assertEquals("47 MySakila Drive", business.getByAddressID(1).getAddress());
	};
	
	@Test
	public void testGetAllCities(){
		Assert.assertEquals(600, business.getAllCities().size());
	};
	
	@Test
	public void  testGetByCityID(){
		Assert.assertEquals("Abha", business.getByCityID(2).getCity());
	};
	
	@Test
	public void testGetAllFilms(){
		Assert.assertEquals(1000, business.getAllFilms().size());
	};
	
	@Test
	public void testGetByFilmID(){
		Assert.assertEquals("ACADEMY DINOSAUR", business.getByFilmID(1).getTitle());
	};
	
	@Test
	public void testGetAllStaffs(){
		Assert.assertEquals(2, business.getAllStaffs().size());
	};
	
	@Test
	public void testGetByStaffID(){
		Assert.assertEquals("Hillyer", business.getByStaffID(1).getLastName());
	};
}
