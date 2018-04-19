package com.formation.parc_materiel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Collaborateur {
	private int identifiant;
	private String nom;
	private String prenom;
	private Date dateEmbauche;
	private int age;
	List<Equipement> dotation;

	public Collaborateur() {
		super();
		dotation = new ArrayList<>();
	}

	public Collaborateur(int identifiant, String nom, String prenom, Date dateEmbauche, int age,
			List<Equipement> dotation) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateEmbauche = dateEmbauche;
		this.age = age;
		this.dotation = dotation;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Equipement> getDotation() {
		return dotation;
	}

	public void setDotation(List<Equipement> dotation) {
		this.dotation = dotation;
	}

	@Override
	public String toString() {
		return "Collaborateur [identifiant=" + identifiant + ", nom=" + nom + ", prenom=" + prenom + ", dateEmbauche="
				+ dateEmbauche + ", age=" + age + ", dotation=" + dotation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Collaborateur other = (Collaborateur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}

}
