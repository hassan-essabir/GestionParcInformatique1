package com.formation.parc_materiel;

import java.util.Date;

public class GenerateurEquipement extends Thread {
	private ParcMateriel type;

	public GenerateurEquipement() {
		super();
	}

	public GenerateurEquipement(ParcMateriel type) {
		super();
		this.type = type;
	}

	@Override
	public void run() {
		int i = 6;
		while (i <= 10) {
			Ordinateur ord = new Ordinateur(6, "E00" + i, "DELL", "Inspiron", new Date(), 2500, 3, null, "10.51.2.0");
			try {
				type.ajoutEquipement(ord);
				this.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			i++;
		}
	}

	public Parc getType() {
		return type;
	}

	public void setType(ParcMateriel type) {
		this.type = type;
	}

}
