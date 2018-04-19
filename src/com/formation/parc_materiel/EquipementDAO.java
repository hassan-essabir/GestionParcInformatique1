package com.formation.parc_materiel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EquipementDAO {

	public void sauveEquipemement(Equipement eq) {
		Connection connection = null;
		PreparedStatement statement = null;

		String insertTable = "INSERT INTO equipement(numeroSerie, marque, modele, dateAchat, prixAchat, garantie) "
				+ "VALUES (?,?,?,?,?,?)";

		try {
			connection = DatabaseHelper.getDBConnexion();
			statement = connection.prepareStatement(insertTable);

			statement.setString(1, eq.getNumeroSerie());
			statement.setString(2, eq.getMarque());
			statement.setString(3, eq.getModele());
			statement.setDate(4, new java.sql.Date(eq.getDateAchat().getTime()));
			statement.setFloat(5, eq.getPrixAchat());
			statement.setInt(6, eq.getGarantie());
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public Equipement chargeEquipement(String numeroSerie) {
		Connection connection = null;
		PreparedStatement statement = null;
		Equipement eq = null;

		String selectTable = "SELECT id, numeroSerie, marque, modele, dateAchat, prixAchat, garantie FROM equipement WHERE numeroSerie=?";

		try {
			connection = DatabaseHelper.getDBConnexion();
			statement = connection.prepareStatement(selectTable);
			statement.setString(1, numeroSerie);
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				eq = new Ordinateur(rs.getString("marque"), rs.getString("modele")) ;
				eq.setIdentifiant(rs.getInt("id"));
				eq.setNumeroSerie(rs.getString("numeroSerie"));
				eq.setDateAchat(new Date(rs.getDate("dateAchat").getTime()));
				eq.setPrixAchat(rs.getFloat("prixAchat"));
				eq.setGarantie(rs.getInt("garantie"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return eq;
	}

	public List<Equipement> chargeTousEquipements() {
		List<Equipement> equipements = new ArrayList<Equipement>();
		Connection connection = null;
		Statement statement = null;

		String selectTableSQL = "SELECT id, numeroSerie, marque, modele, dateAchat, prixAchat, garantie FROM equipement";

		try {
			connection = DatabaseHelper.getDBConnexion();
			statement = connection.createStatement();
			System.out.println(selectTableSQL);
			ResultSet rs = statement.executeQuery(selectTableSQL);
			while (rs.next()) {
				Equipement eq = new Ordinateur(rs.getString("marque"), rs.getString("modele"));
				eq.setIdentifiant(rs.getInt("id"));
				eq.setNumeroSerie(rs.getString("numeroSerie"));
				eq.setDateAchat(new Date(rs.getDate("dateAchat").getTime()));
				eq.setPrixAchat(rs.getFloat("prixAchat"));
				eq.setGarantie(rs.getInt("garantie"));
				equipements.add(eq);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return equipements;
	}

}
