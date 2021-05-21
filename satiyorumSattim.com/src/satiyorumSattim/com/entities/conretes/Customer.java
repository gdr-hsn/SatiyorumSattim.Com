package satiyorumSattim.com.entities.conretes;

import satiyorumSattim.com.entities.abstracts.IEntity;

public class Customer implements IEntity{
private String firstName;
private String lastName;
private String mail;
private String password;
public Customer(String firstName, String lastName, String mail, String password) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.mail = mail;
	this.password = password;
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
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

}
