package com.formation.parc_materiel;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DatabaseHelper {
	
	private static String url = "jdbc:mysql://192.168.1.64:3306/formJava";
	
	public static Connection getDBConnexion() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver introuvable");
			e.printStackTrace();
		}

		//System.out.println("Driver enregistré !");
		Connection connection = null;

		try {
			connection = DriverManager.getConnection(url, "userJava", "passJava");
		} catch (SQLException e) {
			System.out.println("Connexion impossible : "+e.getMessage());
			
		}
		
		return connection;
	}
}
