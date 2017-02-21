package BS.QACinema.dataLayer.booking;
<<<<<<< HEAD
=======

import javax.validation.constraints.NotNull;
>>>>>>> e6dbf9aff0dc37e93ee2f1df944ab080a00b7dcb

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="bookings")
public class Booking {

	
	@NotNull
	@Id
	@Column(nullable = false, unique = true)
	private int bookingid;
	
	@NotNull
	private String time_booked;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "users_email", nullable = false)
	private String users_email;
	
	@NotNull
	@OneToMany
	@JoinColumn(name = "payments_idpayments", nullable = false)
	private int paymentsid;
		
	public Booking () {}
	public Booking(int bookingid, String time_booked, String users_email, int paymentsid) {
		super();
		this.bookingid = bookingid;
		this.time_booked = time_booked;
		this.users_email = users_email;
		this.paymentsid = paymentsid;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getTime_booked() {
		return time_booked;
	}
	public void setTime_booked(String time_booked) {
		this.time_booked = time_booked;
	}
	public String getUsers_email() {
		return users_email;
	}
	public void setUsers_email(String users_email) {
		this.users_email = users_email;
	}
	public int getPaymentsid() {
		return paymentsid;
	}
	public void setPaymentsid(int paymentsid) {
		this.paymentsid = paymentsid;
	}
	
	
	
	
	
}
