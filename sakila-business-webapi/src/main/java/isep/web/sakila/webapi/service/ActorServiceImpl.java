package isep.web.sakila.webapi.service;

import java.sql.Timestamp;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import isep.web.sakila.dao.repositories.ActorRepository;
import isep.web.sakila.jpa.entities.Actor;
import isep.web.sakila.webapi.model.ActorWO;


@Service("actorService")
@Transactional
public class ActorServiceImpl implements ActorService {

	
	@Autowired
	private ActorRepository actorRepository;
	
	private static final Log log = LogFactory.getLog(ActorServiceImpl.class);
	
	
	
	@Override
	public ActorWO findById(int id) {
		
		log.debug(String.format("Looking for user by Id %s", id));
		Actor actor = actorRepository.findOne(id);
		
		if(actor != null){
			return new ActorWO(actor);
		}
		return null;
	}

	@Override
	public void saveActor(ActorWO userWO) {

		Actor actor = new Actor();
		actor.setLastName(userWO.getLastName());
		actor.setFirstName(userWO.getFirstName());
		actor.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		actorRepository.save(actor);
	}

	@Override
	public void updateActor(ActorWO userWO) {

		Actor actor2update = actorRepository.findOne(userWO.getActorId());
		actor2update.setLastName(userWO.getLastName());
		actor2update.setFirstName(userWO.getFirstName());
		actor2update.setLastUpdate(new Timestamp(System.currentTimeMillis()));
		actorRepository.save(actor2update);
	}

	@Override
	public void deleteActorById(int id) {
		actorRepository.delete(id);
	}

	@Override
	public List<ActorWO> findAllActors() {

		List<ActorWO> actors = new LinkedList<ActorWO>();
		
		for (Actor actor : actorRepository.findAll()) {
			actors.add(new ActorWO(actor));
			log.debug("Adding " + actor);
		}
		
		return actors;
	}

}
