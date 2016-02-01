package isep.web.sakila.webapi.service;

import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import isep.web.sakila.dao.repositories.CityRepository;
import isep.web.sakila.jpa.entities.City;
import isep.web.sakila.webapi.model.CityWO;

@Service("cityService")
@Transactional
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	// log
	private static final Log log = LogFactory.getLog(CityServiceImpl.class);

	
	// find all cities
	@Override
	public List<CityWO> findAllCities() {
		List<CityWO> cities = new LinkedList<CityWO>();

		for (City city : cityRepository.findAll()) {
			cities.add(new CityWO(city));
			log.debug("Adding " + city);
		}

		return cities;
	}

	
	// find by id
	@Override
	public CityWO findById(int id) {

		log.debug(String.format("Looking for city by Id %s", id));

		City city = cityRepository.findOne(id);

		if (city == null) {
			return new CityWO(city);
		}
		return null;
	}
}
