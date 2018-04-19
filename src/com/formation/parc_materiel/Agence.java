package com.formation.parc_materiel;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * <b>Class description</b>
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Agence {
	private int identifiant;
	private Entreprise entreprise;
	private String libelle;
	// private Collaborateur[] collaborateurs;
	HashSet<Collaborateur> hs;
	List<Parc> p;

	// HashMap<Integer, Equipement> hash = new HashMap<Integer, Equipement>();
	// private Parc[] parcs;

	public Agence() {
		super();
		hs = new HashSet<>();
		p = new ArrayList<>();
		// collaborateurs = new Collaborateur[300];
		// parcs = new Parc[2];
	}

	/**
	 * <b>Constructor description</b>
	 * 
	 * @param identifiant
	 * @param entreprise
	 * @param libelle
	 * @param collaborateurs
	 * @param parcs
	 * @return
	 * @see Collaborateur
	 * @see Parc
	 */

	public int getIdentifiant() {
		return identifiant;
	}

	public Agence(int identifiant, Entreprise entreprise, String libelle,
			HashSet<Collaborateur> hs, List<Parc> p) {
		super();
		this.identifiant = identifiant;
		this.entreprise = entreprise;
		this.libelle = libelle;
		this.hs = hs;
		this.p = p;
	}

	public void ajoutCollaborateur(Collaborateur c) {
		hs.add(c);
	}

	public Collaborateur rechercheCollaborateur(String nom) {
		for (Collaborateur collaborateur : hs) {
			if (collaborateur.getNom().equals(nom)) {
				System.out.println("--Search Collaborator");
				return collaborateur;
			}
		}
		return null;
	}

	public void afficheCollaborateurs() {
		System.out.println("--Collaborators list");
		// for (Collaborateur collaborateur : hs) {
		// System.out.println(collaborateur);
		// }
		Iterator<Collaborateur> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public HashSet<Collaborateur> getHs() {
		return hs;
	}

	public void setHs(HashSet<Collaborateur> hs) {
		this.hs = hs;
	}

	public List<Parc> getP() {
		return p;
	}

	public void setP(List<Parc> p) {
		this.p = p;
	}

}
