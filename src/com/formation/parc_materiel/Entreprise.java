package com.formation.parc_materiel;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Entreprise {
	private int identifiant;
	private String raisonSociale;

	public Entreprise() {
		super();
	}

	public Entreprise(int identifiant, String raisonSociale) {
		this.identifiant = identifiant;
		this.raisonSociale = raisonSociale;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

}
