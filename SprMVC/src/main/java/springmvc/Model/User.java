package springmvc.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.transaction.annotation.Transactional;

@Entity
public class User {
	
	// adding this when integrating this mvc with orm.
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	// Form's fields name should be same as field name written here.
	private String UserName;
    private String UserEmail;
    private String UserPassword;
    
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", UserEmail=" + UserEmail + ", UserPassword=" + UserPassword + "]";
	}
    
	// Added Entity annotation , id variable with @Id and @GeneratedValue annotation .

}
