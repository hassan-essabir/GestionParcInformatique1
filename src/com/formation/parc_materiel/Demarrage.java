package com.formation.parc_materiel;

import java.io.File;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * <b>Classe Demarrage</b>
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Demarrage {

	public static void main(String[] args) throws Exception {

		//DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		ParcMateriel pm = new ParcMateriel();

		Ordinateur ord = new Ordinateur();
		
		
		
		ord = new Ordinateur(1, "E001", "DELL", "Précision", LocalDate.of(2010, 07, 07), 1500, 3, null,
				"10.51.2.0");
		pm.ajoutEquipement(ord);

		ord = new Ordinateur(4, "E004", "DELL", "Laitude", LocalDate.of(2010, 07, 07), 2000, 5, null,
				"10.51.2.0");
		pm.ajoutEquipement(ord);

		ord = new Ordinateur(2, "E002", "DELL", "Laitude", LocalDate.of(2010, 07, 07), 2000, 5, null,
				"10.51.2.0");
		pm.ajoutEquipement(ord);

		ord = new Ordinateur(5, "E005", "DELL", "Inspiron", LocalDate.of(2010, 07, 07), 2500, 3, null,
				"10.51.2.0");
		pm.ajoutEquipement(ord);

		GenerateurEquipement ge = new GenerateurEquipement();
		ge.setType(pm);
		ge.start();

		Thread.sleep(5000);
		pm.listeEquipement();

		System.out.println("--Recherche ordinateur ");
		System.out.println(pm.rechercheEquipement(ord.getNumeroSerie()));

		FlotteMobile fm = new FlotteMobile();
		Telephone tel = new Telephone();
		tel.setIdentifiant(3);
		tel.setNumeroSerie("E003");
		tel.setMarque("Nokia");
		tel.setModele("5510");
		tel.setGarantie(1);
		tel.setDateAchat(LocalDate.of(2005, 07, 07));
		tel.setPrixAchat(200);
		fm.ajoutEquipement(tel);

		fm.listeEquipement();

		Agence ag = new Agence();
		Collaborateur col = new Collaborateur(1, "hassan", "hassan", LocalDate.of(2010, 07, 07), 26, null);
		Collaborateur col1 = new Collaborateur(2, "jean", "jean", LocalDate.of(2010, 07, 07), 26, null);
		Collaborateur col2 = new Collaborateur(3, "christophe", "christophe", LocalDate.of(2010, 07, 07), 26,
				null);
		Collaborateur col3 = new Collaborateur(4, "hassan", "hassan", LocalDate.of(2010, 07, 07), 26, null);
		ag.ajoutCollaborateur(col);
		ag.ajoutCollaborateur(col1);
		ag.ajoutCollaborateur(col2);
		ag.ajoutCollaborateur(col3);
		ag.afficheCollaborateurs();
		System.out.println(ag.rechercheCollaborateur("hassan"));

		Outils.exportEquipementsCSV("C:\\Users\\stagiaire001\\Desktop" + File.separator, pm.equipements);

//		EquipementDAO edao = new EquipementDAO();
//		edao.sauveEquipemement(ord);
//		System.out.println(edao.chargeTousEquipements());

	}
}
