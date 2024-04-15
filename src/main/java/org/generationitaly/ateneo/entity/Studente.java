package org.generationitaly.ateneo.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

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
	
	@Column(name = "codice_fiscale", nullable = false, length = 16)
	private String codiceFiscale;
	
	@Column(name = "nome", nullable = false, length = 45)
	private String nome;
	
	@Column(name = "cognome", nullable = false, length = 45)
	private String cognome;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "sesso", nullable = false, length = 1)
	private String sesso;

	@Column(name = "data_nascita", nullable = false)
	private Date dataNascita;

	@OneToMany(mappedBy = "studente", fetch = FetchType.EAGER)
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


	public String getCodiceFiscale() {
		return codiceFiscale;
	}


	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
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


	public Date getDataNascita() {
		return dataNascita;
	}


	public void setDataNascita(Date dataNascita) {
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
		return "Studente [id=" + id + ", matricola=" + matricola + ", codiceFiscale=" + codiceFiscale + ", nome=" + nome
				+ ", cognome=" + cognome + ", sesso=" + sesso + ", dataNascita=" + dataNascita + "]";
	}

	
	
}
