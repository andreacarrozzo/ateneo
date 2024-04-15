-- STUDENTE N <--> N MATERIA
-- STUDENTE 1 <--> N ESAME N <--> 1 MATERIA

CREATE SCHEMA ateneoweb;

USE ateneoweb;

CREATE TABLE studente (
-- attributi	 vincoli	
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
);

CREATE TABLE materia (
	id INT NOT NULL AUTO_INCREMENT,
    codice CHAR(5) NOT NULL,
    nome VARCHAR(45) NOT NULL,
    cfu INT NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(codice),
    CHECK(cfu > 0)
);

CREATE TABLE esame (
	id INT NOT NULL AUTO_INCREMENT,
    studente_id INT NOT NULL,
    materia_id INT NOT NULL,
    data_esame DATE NOT NULL,
    voto INT NOT NULL,
    lode BOOLEAN NOT NULL,
    PRIMARY KEY(id),
    UNIQUE(studente_id, materia_id),
    FOREIGN KEY (studente_id) REFERENCES studente(id),
    FOREIGN KEY (materia_id) REFERENCES materia(id),
    CHECK(voto >= 18)
);