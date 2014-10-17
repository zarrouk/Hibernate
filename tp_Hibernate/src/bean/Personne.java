package bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name="Personne2")
public class Personne {
	@Id @GeneratedValue(strategy =GenerationType.AUTO )
	private int id;
	private String name;
	private String prenom;
	private String tel;
	private String email;
	@Temporal(TemporalType.DATE)
	private Date birthDate;


	public Personne() {
	}

	public Personne(int id, String name, String prenom, String tel, String email) {
		super();
		this.id = id;
		this.name = name;
		this.prenom = prenom;
		this.tel = tel;
		this.email = email;
		this.birthDate = new Date();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", name=" + name + ", prenom=" + prenom
				+ ", tel=" + tel + ", email=" + email + "]";
	}



}
