package com.formation.parc_materiel;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class FlotteMobile extends Parc {

//	public void ajoutEquipement(Telephone t) {
//		super.ajoutEquipement(t);
//	}
	
	public void ajoutEquipement(Equipement eq) throws EquipementIncompatibleException {
		if (eq instanceof Telephone) {
			equipements.add(eq);
			System.out.println("--Equipement added");
		} else {
			throw new EquipementIncompatibleException();
		}
	}

	@Override
	public String toString() {
		return "FlotteMobile [equipements=" + equipements + ", getGarantieMoyenne()=" + getGarantieMoyenne()
				+ ", getPrixMoyen()=" + getPrixMoyen() + ", getValeurParc()=" + getValeurParc() + ", getPrixMoyenFmt()="
				+ getPrixMoyenFmt() + ", getValeurParcFmt()=" + getValeurParcFmt() + ", getIdentifiant()="
				+ getIdentifiant() + ", getLibelle()=" + getLibelle() + ", getGestionnaire()=" + getGestionnaire()
				+ ", getEquipements()=" + getEquipements() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
