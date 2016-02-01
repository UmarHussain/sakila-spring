package isep.web.sakila.webapi.model;

import java.sql.Timestamp;
import java.util.Date;

import isep.web.sakila.jpa.entities.Address;
import isep.web.sakila.jpa.entities.Customer;
import isep.web.sakila.jpa.entities.Store;

public class CustomerWO extends WebObject{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3940626561941477764L;

	protected int customerId;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected Address address;
	protected Store store;
	protected Timestamp lastUpdate;
	protected Date createDate;
	
	public CustomerWO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerWO(int customerId, String firstName, String lastName, String email, Address address, Store store,
			Timestamp lastUpdate, Date createDate) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.store = store;
		this.lastUpdate = lastUpdate;
		this.createDate = createDate;
	}
	
	public CustomerWO(final Customer customer){
		super();
		this.customerId = customer.getCustomerId();
		this.firstName = customer.getFirstName();
		this.lastName = customer.getLastName();
		this.address = customer.getAddress();
		this.email = customer.getEmail();
		this.store = customer.getStore();
		this.lastUpdate = customer.getLastUpdate();
		this.createDate = customer.getCreateDate();
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
	}

	public Timestamp getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Timestamp lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "CustomerWO [customerId=" + customerId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", address=" + address + ", store=" + store + ", lastUpdate=" + lastUpdate
				+ ", createDate=" + createDate + "]";
	}
	
	
	
}
