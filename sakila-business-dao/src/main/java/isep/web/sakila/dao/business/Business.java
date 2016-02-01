package isep.web.sakila.dao.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import isep.web.sakila.dao.repositories.ActorRepository;
import isep.web.sakila.jpa.entities.Actor;


@Service("business")
public class Business implements IBusiness {

	@Autowired
	private ActorRepository actorRepository;
	
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

}
