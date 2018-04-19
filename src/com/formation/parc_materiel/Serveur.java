package com.formation.parc_materiel;

import java.util.Date;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Serveur extends Ordinateur {

	private String role;

	public Serveur() {
		super();
	}

	public Serveur(String role) {
		super();
		this.setRole(role);
	}

	public Serveur(int identifiant, String numeroSerie, String marque,
			String modele, Date dateAchat, float prixAchat, int garantie,
			TypeEquipement type, String adresseIP, String role) {
		super(identifiant, numeroSerie, marque, modele, dateAchat, prixAchat,
				garantie, type, adresseIP);
		this.setRole(role);
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
