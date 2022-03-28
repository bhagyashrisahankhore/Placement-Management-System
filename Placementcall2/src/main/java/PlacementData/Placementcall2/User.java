package PlacementData.Placementcall2;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 long id;
	 
	 @Size(min=4,max=20)
	String username;
	 
	 @NotBlank
	 @Size(min=6,max=10)
	String password;
	String address;
	
	 @NotBlank
	 String gender;
	 String phone_no;
	 @NotBlank
	 @Email(message=" Enter your email address")
	 String email;
	 
	 @DateTimeFormat(pattern="yyyy-mm-dd")
	 Date birthday;
	 String HSC;
	 String SSC;
	 
	 String graduation_marks;
	 
	 int passout_year;
	 int age;
	
	 
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	


	public String getPhone_no() {
		return phone_no;
	}



	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public Date getBirthday() {
		return birthday;
	}



	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	public String getHSC() {
		return HSC;
	}



	public void setHSC(String hSC) {
		HSC = hSC;
	}



	public String getSSC() {
		return SSC;
	}



	public void setSSC(String sSC) {
		SSC = sSC;
	}



	public String getGraduation_marks() {
		return graduation_marks;
	}



	public void setGraduation_marks(String graduation_marks) {
		this.graduation_marks = graduation_marks;
	}



	public int getPassout_year() {
		return passout_year;
	}



	public void setPassout_year(int passout_year) {
		this.passout_year = passout_year;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", address=" + address
				+ ", gender=" + gender + ", phone_no=" + phone_no + ", email=" + email + ", birthday=" + birthday
				+ ", HSC=" + HSC + ", SSC=" + SSC + ", gradution_marks=" + graduation_marks + ", passout_year="
				+ passout_year + ", age=" + age + "]";
	}
	 
}
