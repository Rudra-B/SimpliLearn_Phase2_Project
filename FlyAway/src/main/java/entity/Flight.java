package entity;


 
import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="flight")
public class Flight  {
	
	public Flight()
	{
		
	}
	
	
    @Id
    @Column(name="flight_id")
	private String flightId;
    @Column(name="source1")
	private String source;
    @Column(name="destination")
	private String destination;
    @Column(name="date1")
	private Date date;
    @Column(name="arrival")
    private Time arrival;
    @Column(name="departure")
    private Time departure;
    @Column(name="price")
  	private long price;
    @Column(name="airline")
	private String airline;
    
    
    
    
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Time getArrival() {
		return arrival;
	}
	public void setArrival(Time arrival) {
		this.arrival = arrival;
	}
	public Time getDeparture() {
		return departure;
	}
	public void setDeparture(Time departure) {
		this.departure = departure;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", source=" + source + ", destination=" + destination + ", date=" + date
				+ ", arrival=" + arrival + ", departure=" + departure + ", price=" + price + ", airline=" + airline
				+ "]";
	}

    
	
	
}
