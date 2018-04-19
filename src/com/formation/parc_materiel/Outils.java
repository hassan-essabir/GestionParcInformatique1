package com.formation.parc_materiel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Outils implements Serializable {

	public static String getDateFmt(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(d);
	}

	public static String getPrixFmt(double f) {
		return NumberFormat.getInstance().format(f);
	}

	public static String composeUniqueID(Equipement e) {
		Random r = new Random();
		return e.getMarque().substring(0, 1).toUpperCase()
				+ e.getMarque().substring(e.getMarque().length() - 1).toUpperCase() + r.nextInt() * 100000;
	}

	public static void exportEquipementsCSV(String chemin, List<Equipement> equipements) {

		try (BufferedWriter writer = new BufferedWriter(
				new FileWriter(chemin + File.separator + "equipements.csv"))) {

			for (Equipement equipement : equipements) {
				writer.write(equipement.toCSV());
			}

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}

}
