package com.formation.parc_materiel;

import java.util.Date;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Telephone extends Equipement {

	private String numeroAppel;

	public Telephone() {
		super();
	}

	public Telephone(String numeroAppel) {
		super();
		this.setNumeroAppel(numeroAppel);
	}

	public Telephone(int identifiant, String numeroSerie, String marque, String modele, Date dateAchat, float prixAchat,
			int garantie, TypeEquipement type, String numeroAppel) {
		super(identifiant, numeroSerie, marque, modele, dateAchat, prixAchat, garantie, type);
		this.setNumeroAppel(numeroAppel);
	}

	@Override
	public int compareTo(Equipement o) {
		return this.getNumeroSerie().compareTo(o.getNumeroSerie());
	}

	public String getNumeroAppel() {
		return numeroAppel;
	}

	public void setNumeroAppel(String numeroAppel) {
		this.numeroAppel = numeroAppel;
	}

	@Override
	public String toString() {
		return "Telephone [numeroAppel=" + numeroAppel + ", afficheDetailGarantie()=" + afficheDetailGarantie()
				+ ", isGarantieExpiree()=" + isGarantieExpiree() + ", getIdentifiant()=" + getIdentifiant()
				+ ", getNumeroSerie()=" + getNumeroSerie() + ", getMarque()=" + getMarque() + ", getModele()="
				+ getModele() + ", getDateAchat()=" + getDateAchat() + ", getPrixAchat()=" + getPrixAchat()
				+ ", getGarantie()=" + getGarantie() + ", getType()=" + getType() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
