package org.generationitaly.ateneo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/*
id INT NOT NULL AUTO_INCREMENT,
matricola CHAR(5) NOT NULL,
codice_fiscale CHAR(16) NOT NULL,
nome VARCHAR(45) NOT NULL,
cognome VARCHAR(45) NOT NULL,
sesso CHAR(1) NOT NULL,
data_nascita DATE NOT NULL,
PRIMARY KEY(id),
UNIQUE(matricola),
UNIQUE(codice_fiscale),
CHECK(sesso IN('M', 'F'))
*/

@Entity 
@Table(name = "studente")
public class Studente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "matricola", nullable = false, length = 6)
	private String matricola;
	
	@Column(name = "nome", nullable = false, length = 45)
	private String nome;
	
	@Column(name = "cognome", nullable = false, length = 45)
	private String cognome;
	
	@Column(name = "sesso", nullable = false, length = 1)
	private String sesso;

	@Column(name = "data_nascita", nullable = false)
	private String dataNascita;

	@OneToMany(mappedBy = "studente")
	private List<Esame> esami = new ArrayList<Esame>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
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

	public String getSesso() {
		return sesso;
	}

	public void setSesso(String sesso) {
		this.sesso = sesso;
	}

	public String getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(String dataNascita) {
		this.dataNascita = dataNascita;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	@Override
	public String toString() {
		return "Studente [id=" + id + ", matricola=" + matricola + ", nome=" + nome + ", cognome=" + cognome
				+ ", sesso=" + sesso + ", dataNascita=" + dataNascita + "]";
	}
	
	
}
