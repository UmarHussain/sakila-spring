package isep.web.sakila.webapi.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import isep.web.sakila.jpa.config.PersistenceConfig;


@SpringApplicationConfiguration(classes = PersistenceConfig.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class StoreServiceTest {

	
	@Autowired
	private StoreService service;
	
	@Test
	public void testFindById() {
		Assert.assertEquals(2, service.findById(2).getAdress());
	}

	@Test
	public void testFindAllStores() {
		Assert.assertEquals(2, service.findAllStores().size());
	}



}
