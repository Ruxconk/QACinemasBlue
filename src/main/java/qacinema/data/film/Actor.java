/*Author: Sam Jackson
 * 
 */

package qacinema.data.film;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "actors")
public class Actor {

	@NotNull
	@Column(name = "FirstName", length = 225, nullable = false)
	private String firstName;
	
	@Column(name = "LastName", length = 225, nullable = true)
	private String lastName;
	
	@Id
	@NotNull
	@Column(name = "ActorID", length = 225, nullable = false)
	private String actorId;
	

	public Actor(){}
	
	public Actor(String firstName){
		this.firstName = firstName;
	}
	
	public Actor(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getActorId() {
		return actorId;
	}

	public void setActorId(String actorId) {
		this.actorId = actorId;
	}
	
	

}
