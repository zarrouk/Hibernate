package test;

import util.HibernateUtil;
import manager.PersonneManager;

public class Test_Main {

	public static void main(String[] args) {
		System.out.println("Start");
		PersonneManager pm = new PersonneManager();
		pm.ajoutPersonne("Godhben", "Marouen", "062458798", "rou@rou.com");
		pm.ajoutPersonne("Godhben2", "Marouen2", "062458798", "rou@rou.com2");
		//pm.supprimePersonne(5);
		//pm.supprimePersonne(6);
		HibernateUtil.sessionFactory.close();

	}

}
