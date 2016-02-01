package isep.web.sakila.webapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import isep.web.sakila.webapi.model.CityWO;
import isep.web.sakila.webapi.service.CityService;

@RestController
public class CityRestController {

	@Autowired
	CityService cityService;

	// List all cities
	@RequestMapping(value = "/city/", method = RequestMethod.GET)
	public ResponseEntity<List<CityWO>> listAllCities() {

		List<CityWO> citys = cityService.findAllCities();
		if (citys.isEmpty()) {
			return new ResponseEntity<List<CityWO>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<CityWO>>(citys, HttpStatus.OK);
	}

	// Get City By Id
	@RequestMapping(value = "/city/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CityWO> getCity(@PathVariable("id") int id) {

		System.out.println("Fetching City with id " + id);

		CityWO staffWO = cityService.findById(id);
		if (staffWO == null) {
			System.out.println("City with id " + id + " not found");
			return new ResponseEntity<CityWO>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<CityWO>(staffWO, HttpStatus.OK);
	}
}
