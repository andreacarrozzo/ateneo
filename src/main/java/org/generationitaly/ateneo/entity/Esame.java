package org.generationitaly.ateneo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

/*CREATE TABLE esame (
	    id INT NOT NULL AUTO_INCREMENT,
	    studente_id INT NOT NULL,
	    materia_id INT NOT NULL,
	    data_esame DATE NOT NULL,
	    voto INT NOT NULL,
	    lode BOOLEAN NOT NULL,
	    PRIMARY KEY (id),
	    UNIQUE (studente_id , materia_id),
	    FOREIGN KEY (studente_id)
	        REFERENCES studente (id),
	    FOREIGN KEY (materia_id)
	        REFERENCES materia (id),
	    CHECK (voto >= 18)
	);
*/
@Entity
@Table(name = "esame")
public class Esame {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;

	@ManyToOne
	@JoinColumn(name = "studente_id", nullable = false)
	private Studente studente;

	@ManyToOne
	@JoinColumn(name = "materia_id", nullable = false)
	private Materia materia;

	@Temporal(TemporalType.DATE)
	@Column(name = "data_esame", nullable = false)
	private Date dataEsame;

	@Column(name = "voto", length = 5, nullable = false)
	private int voto;

	@Column(name = "lode", nullable = false)
	private boolean lode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Studente getStudente() {
		return studente;
	}

	public void setStudente(Studente studente) {
		this.studente = studente;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Date getDataEsame() {
		return dataEsame;
	}

	public void setDataEsame(Date dataEsame) {
		this.dataEsame = dataEsame;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public boolean isLode() {
		return lode;
	}

	public void setLode(boolean lode) {
		this.lode = lode;
	}

	@Override
	public String toString() {
		return "Esame [id=" + id + ", studente=" + studente + ", materia=" + materia + ", dataEsame=" + dataEsame
				+ ", voto=" + voto + ", lode=" + lode + "]";
	}

}
