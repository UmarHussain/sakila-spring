package isep.web.sakila.webapi.model;

import isep.web.sakila.jpa.entities.Actor;

public class ActorWO extends WebObject {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4042292267310704934L;

	protected int actorId;
	protected String lastName;
	protected String firstName;

	public ActorWO() {
		super();
	}

	public ActorWO(int actorId, String lastName, String firstName) {
		super();
		this.actorId = actorId;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	public ActorWO(final Actor actor) {
		super();
		this.actorId = actor.getActorId();
		this.lastName = actor.getLastName();
		this.firstName = actor.getFirstName();
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		return "ActorWO [actorId=" + actorId + ", lastName=" + lastName + ", firstName=" + firstName + "]";
	}

}
