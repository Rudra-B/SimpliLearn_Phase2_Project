package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Traveller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;	
	private String fname;
	private String lname;
	private String mobile;
	private String email;
    private String flight_id;
	
	public Traveller()
	{
		
	}

	public Traveller(String fname, String lname, String mobile, String email, String flight_id) {
		super();
		
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.email = email;
		this.flight_id = flight_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(String flight_id) {
		this.flight_id = flight_id;
	}

	@Override
	public String toString() {
		return "Traveller [id=" + id + ", fname=" + fname + ", lname=" + lname + ", mobile=" + mobile + ", email="
				+ email + ", flight_id=" + flight_id + "]";
	}
	
	

}
