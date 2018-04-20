package com.formation.parc_materiel;

public interface IComptabilisable {

	public default double calculMontantTVA(double prix) {
		final double TAUX=0.2;
		return prix + prix*TAUX;
	}

//	public double calculMontantTTC();

}
