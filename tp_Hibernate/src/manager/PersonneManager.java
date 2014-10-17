package manager;

import java.util.Date;

import org.hibernate.Session;

import util.HibernateUtil;
import bean.Personne;

public class PersonneManager {
	public void ajoutPersonne(String name, String prenom, String tel, String email){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Personne p = new Personne();
		p.setName(name);
		p.setPrenom(prenom);
		p.setTel(tel);
		p.setEmail(email);
		p.setBirthDate(new Date());
		session.save(p);
		session.getTransaction().commit();
	}
	
	public void supprimePersonne(int id){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Personne p = (Personne) session.load(Personne.class, id);
		session.delete(p);
		session.getTransaction().commit();

	}

}
