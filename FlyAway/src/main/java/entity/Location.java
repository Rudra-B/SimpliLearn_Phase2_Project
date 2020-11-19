package entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String lid;
	private String source1;
	private String destination;
	
	public Location()
	{
		
	}

	public Location(String lid, String source1, String destination) {
		super();
		this.lid = lid;
		this.source1 = source1;
		this.destination = destination;
	}

	public String getLid() {
		return lid;
	}

	public void setLid(String lid) {
		this.lid = lid;
	}

	public String getSource1() {
		return source1;
	}

	public void setSource1(String source1) {
		this.source1 = source1;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
	
	
	

}
