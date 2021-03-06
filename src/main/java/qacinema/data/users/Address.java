/**
 * Created by Mark Lester
 */
package qacinema.data.users;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "address")
public class Address {

	@Id
	private String addressID;

	@NotNull
	@Column(name = "line1")
	private String line1;

	@Column(name = "line2")
	private String line2;

	@NotNull
	@Column(name = "town")
	private String town;

	@NotNull
	@Column(name = "county")
	private String county;

	@NotNull
	@Column(name = "postcode")
	private String postcode;

	public Address() {
		super();
	}

	public Address(String addressID, String line1, String line2, String town, String county, String postcode) {
		super();
		this.addressID = addressID;
		this.line1 = line1;
		this.line2 = line2;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
	}

	public String getAddressID() {
		return addressID;
	}

	public void setAddressID(String addressID) {
		this.addressID = addressID;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

}
