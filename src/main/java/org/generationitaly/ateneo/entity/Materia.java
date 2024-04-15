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
 * CREATE TABLE materia (
	id INT NOT NULL AUTO_INCREMENT,
    codice CHAR(5) NOT NULL,
    nome VARCHAR(45) NOT NULL,
    cfu INT NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(codice),
    CHECK(cfu > 0)
);
 */

@Entity
@Table(name = "materia")
public class Materia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	
	@Column(name = "codice", length = 5, unique = true, nullable = false)
	private String codice;

	@Column(name = "nome", length = 45, nullable = false)
	private String nome;

	@Column(name = "cfu", nullable = false)
	private int cfu;

	@OneToMany(mappedBy = "materia")
	private List<Esame> esami = new ArrayList<Esame>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCfu() {
		return cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;
	}

	public List<Esame> getEsami() {
		return esami;
	}

	public void setEsami(List<Esame> esami) {
		this.esami = esami;
	}

	@Override
	public String toString() {
		return "Materia [id=" + id + ", codice=" + codice + ", nome=" + nome + ", cfu=" + cfu + "]";
	}

}
