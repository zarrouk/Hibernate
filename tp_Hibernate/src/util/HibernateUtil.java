package util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	public static final SessionFactory sessionFactory;//responsable d'une base de donn� particuliere

	static{
		try{
			sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
		}catch(Throwable ex){
			System.out.println("Creation du Session Factory a echou� "+ex );
			throw new ExceptionInInitializerError();
		}
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}
