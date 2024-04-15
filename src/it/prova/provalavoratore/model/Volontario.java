package it.prova.provalavoratore.model;

public class Volontario extends Lavoratore {

	private String nomeAssociazione;

	public Volontario() {

	}

	public Volontario(String nome, String cognome, String nomeAssociazione) {

		super(nome, cognome);
		this.nomeAssociazione = nomeAssociazione;
	}

	public String getNomeAssociazion() {
		return nomeAssociazione;
	}

	public void SetNomeAssociazion(String nomeAssociazione) {
		this.nomeAssociazione = nomeAssociazione;
	}

	public String Percepisco() {

		return  super.nome + " " + super.cognome + " è volontario per l'associazione " + this.nomeAssociazione;
	}
}
