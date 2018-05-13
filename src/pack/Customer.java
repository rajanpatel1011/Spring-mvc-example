package pack;

import org.springframework.stereotype.Component;

@Component
public class Customer {
private Integer id;
private String name;
private String password;
private Integer age;



public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(Integer id, String name, String password, Integer age) {
	super();
	this.id = id;
	this.name = name;
	this.password = password;
	this.age = age;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}


}
