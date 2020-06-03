package Tema7;

public class studenti {
	private String nume, prenume;
	private double noteromana;
	private double notematematica;

	public studenti(String nume, String prenume, double noteromana, double notematematica) {
		this.nume = nume;
		this.prenume = prenume;
		this.notematematica = notematematica;
		this.noteromana = noteromana;

	}

	public void setNoteromana(double noteromana) {
		this.noteromana = noteromana;
	}

	public void setNotematematica(double notematematica) {
		this.notematematica = notematematica;
	}

	@Override
	public String toString() {
		return "Nume:" + nume + ", Prenume: " + prenume + ", noteromana:[" + noteromana + "] ,notematematica:[" + notematematica + "]";
	}

	public String getNume() {
		return nume;
	}

	public String getPrenume() {
		return prenume;
	}

	public double getNoteromana() {
		return noteromana;
	}

	public double getNotematematica() {
		return notematematica;

	}

}