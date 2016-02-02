package isep.web.sakila.webapi.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import isep.web.sakila.jpa.config.PersistenceConfig;
import isep.web.sakila.webapi.model.AddressWO;


@SpringApplicationConfiguration(classes = PersistenceConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class AddressServiceTest {

	@Autowired
	private AddressService service;
	
	@Test
	public void testFindAllAddresss() {
		Assert.assertEquals(603, service.findAllAddresss().size());
	}

	@Test
	public void testFindById() {
		Assert.assertEquals("47 MySakila Drive", service.findById(1).getAddress());
	}

	@Test
	public void testSaveAddress() {
		AddressWO addressWO = new AddressWO(604, "test address", "test address", null, null, 0);
		service.saveAddress(addressWO);
		Assert.assertEquals("test address", service.findById(604).getAddress());
		
	}

	@Test
	public void testUpdateAddress() {
		AddressWO updateWO = service.findById(604);
		updateWO.setAddress("address test");
		service.updateAddress(updateWO);
		Assert.assertEquals("address test", service.findById(604).getAddress());
	}

	@Test
	public void testDeleteAddressById() {
		service.deleteAddressById(604);
		Assert.assertEquals(603, service.findAllAddresss().size());
	}

}
