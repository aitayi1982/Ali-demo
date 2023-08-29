package smart.demo.pojo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = -8267038338509259007L;
	private Integer id;
	private String username;
	//private Date birthday;
	private String sex;
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//public Date getBirthday() {
	//	return birthday;
	//}

	//public void setBirthday(Date birthday) {
	//	this.birthday = birthday;
	//}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/* getter and setter */
}