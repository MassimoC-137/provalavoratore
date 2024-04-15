package it.prova.provalavoratore.model;

public class Operaio extends Lavoratore{

	private int salario; 
	
	public Operaio () {
		
	}
	
	public Operaio(String nome, String cognome, int salario) {
		
		super(nome, cognome); 
		this.salario = salario; 
	}
	
	public int getSalario() {
		return salario; 
	}
	
	public void setSalario(int salario) {
		this.salario = salario; 
	} 
	
	public String Percepisco() {
		
		return "L'operaio " + super.nome + " " + super.cognome + " percepisce " + this.salario; 
	}
	
	
}
