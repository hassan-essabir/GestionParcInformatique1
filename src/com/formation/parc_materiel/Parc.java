package com.formation.parc_materiel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public abstract class Parc {
	private int identifiant;
	private String libelle;
	private Collaborateur gestionnaire;
	List<Equipement> equipements;

	public Parc() {
		super();
		equipements = new ArrayList<>();
	}

	public Parc(int identifiant, String libelle, Collaborateur gestionnaire, ArrayList<Equipement> equipements) {
		super();
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.gestionnaire = gestionnaire;
		this.equipements = equipements;
	}

	public abstract void ajoutEquipement(Equipement eq) throws EquipementIncompatibleException;

	public Equipement rechercheEquipement(String numSerie) {
		for (Equipement equipement : equipements) {
			if (equipement.getNumeroSerie().equals(numSerie)) {
				return equipement;
			}
		}
		return null;
	}

	public synchronized void listeEquipement() {
		System.out.println("--Equipment list");
		Collections.sort(this.equipements);
		this.equipements.forEach(System.out::println);
		//this.equipements.forEach(equipements -> System.out.println(equipements));

//		for (Equipement equipement : equipements) {
//			System.out.println(equipement);
//		}
	}

	public void supprEquipement(Equipement eq) {

		boolean eqRem = equipements.remove(eq);
		if (eqRem == true) {
			System.out.println("--Equipement removed " + eq.getIdentifiant());
		}
	}

	public float getGarantieMoyenne() {
		float dureeGarantieMoyenne = 0;
		int compteur = 0;
		System.out.println("--Warranty average");
		for (Equipement equipement : equipements) {
			dureeGarantieMoyenne = dureeGarantieMoyenne + equipement.getGarantie();
			compteur++;
		}
		return dureeGarantieMoyenne / compteur;
	}

	public float getPrixMoyen() {
		float PrixMoyen = 0;
		int compteur = 0;
		System.out.println("--Price average");
		for (Equipement equipement : equipements) {
			PrixMoyen = PrixMoyen + equipement.getPrixAchat();
			compteur++;
		}
		return PrixMoyen / compteur;
	}

	public double getValeurParc() {
		double valeurParc = 0;
		System.out.println("--Parc value");
		for (Equipement equipement : equipements) {
			valeurParc = valeurParc + equipement.getPrixAchat();
		}
		return valeurParc;
	}

	public String getPrixMoyenFmt() {
		return Outils.getPrixFmt(getPrixMoyen());
	}

	public String getValeurParcFmt() {
		return Outils.getPrixFmt(getValeurParc());
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collaborateur getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Collaborateur gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public List<Equipement> getEquipements() {
		return equipements;
	}

	public void setEquipements(List<Equipement> equipements) {
		this.equipements = equipements;
	}

}
