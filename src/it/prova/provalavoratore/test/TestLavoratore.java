package it.prova.provalavoratore.test;

import it.prova.provalavoratore.model.Lavoratore;
import it.prova.provalavoratore.model.Operaio;
import it.prova.provalavoratore.model.Volontario;

public class TestLavoratore {

	public static void main(String[] args) {
		
		Lavoratore oper1 = new Operaio("Jim", "Wilson", 12000);
		Lavoratore oper2 = new Operaio("Mark", "Smith", 14000); 
		Lavoratore oper3 = new Operaio("qwe", "zxc", 14000);
		Lavoratore oper4 = new Operaio("asd", "Smith", 14000); 
		Lavoratore oper5 = new Operaio("zxc", "zxc", 14000); 
		Lavoratore oper6 = new Operaio("rty", "Smith", 14000); 
		
		Lavoratore vol1 = new Volontario("Sarah", "Anderson", "Medici"); 
		Lavoratore vol2 = new Volontario("Andrew", "Tomson", "WWF"); 
		Lavoratore vol3 = new Volontario("poi", "hgf", "WWF"); 
		Lavoratore vol4 = new Volontario("uyt", "vcx", "WWF"); 
		Lavoratore vol5 = new Volontario("lkj", "hgf", "WWF"); 
		Lavoratore vol6 = new Volontario("mnb", "vcx", "WWF"); 
		
		Lavoratore[] formiche = {oper1, oper2, oper3, oper4, oper5, oper6}; 
		
		Lavoratore[] tuttiOccupati = {oper1, oper2, oper3, oper4, oper5, oper6, vol1, vol2, vol3, vol4, vol5, vol6}; 
		
//		System.out.println(oper1.Percepisco());
//		System.out.println(oper2.Percepisco());
//		System.out.println(vol1.Percepisco());
//		System.out.println(vol2.Percepisco());
//		
//		System.out.println(oper6.contaLavoratoriConCognome(formiche, "zxc"));
		
		System.out.println(oper6.contaLavoratoriVolontari(tuttiOccupati));
		
	}

}
