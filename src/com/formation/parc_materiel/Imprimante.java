package com.formation.parc_materiel;

import java.util.Date;

enum TypeImprimante {
	JET_ENCRE, LASER_NB, JET_ENCRE_COULEUR, LASER_COULEUR, THERMIQUE
}

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Imprimante extends Equipement {
	private TypeImprimante technologie;

	public Imprimante() {
		super();
	}

	public Imprimante(TypeImprimante technologie) {
		super();
		this.setTechnologie(technologie);
	}

	public Imprimante(int identifiant, String numeroSerie, String marque, String modele, Date dateAchat,
			float prixAchat, int garantie, TypeEquipement type, TypeImprimante technologie) {
		super(identifiant, numeroSerie, marque, modele, dateAchat, prixAchat, garantie, type);
		this.setTechnologie(technologie);
	}

	@Override
	public int compareTo(Equipement o) {
		return this.getNumeroSerie().compareTo(o.getNumeroSerie());
	}

	public TypeImprimante getTechnologie() {
		return technologie;
	}

	public void setTechnologie(TypeImprimante technologie) {
		this.technologie = technologie;
	}

}
