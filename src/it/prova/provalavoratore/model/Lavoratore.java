package it.prova.provalavoratore.model;

public class Lavoratore {

	protected String nome; 
	protected String cognome; 
	
	public Lavoratore() {
		
	}
	
	public Lavoratore(String nome, String cognome) {
		
		this.nome = nome; 
		this.cognome = cognome;
	}
	
	public String getNome() {
		return nome; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getCognome() {
		return cognome; 
	}
	
	public void setCognome(String cognome) {
		this.cognome = cognome; 
	}
	
	public String Percepisco() {
		return null; 
	}
	
	public int contaLavoratoriConCognome(Lavoratore[] lavoratori, String cognome) {
	
		int quantiSiChiamanoCosi = 0; 
		for (int i = 0; i < lavoratori.length; i ++) {
			if (lavoratori[i].getCognome().equals(cognome)) {
				quantiSiChiamanoCosi ++; 
			}
		}
		return quantiSiChiamanoCosi; 
	}
	
	public int contaLavoratoriVolontari(Lavoratore[] lavoratori) {
		
		int quantiSonoVolontari = 0; 
		for (int i = 0; i < lavoratori.length; i++) {
			if (lavoratori[i] instanceof Volontario) {
				quantiSonoVolontari++; 
			}
		}
		return quantiSonoVolontari; 
	}
	
	
}







