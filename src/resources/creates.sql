CREATE TABLE aulanosa.alumno(
	id INT NOT NULL AUTO_INCREMENT,
	nome varchar(100) NOT NULL,
	email varchar(100) NULL,
	CONSTRAINT alumno_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;




CREATE TABLE aulanosa.asistencia (
	id INT NOT NULL AUTO_INCREMENT,
	fecha date not NULL,
	asiste boolean not NULL,
	CONSTRAINT asistencia_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;


CREATE TABLE aulanosa.trimestre (
	id INT NOT NULL AUTO_INCREMENT,
	nome varchar(100) NOT NULL,
	fechaInicio date not NULL,
	fechaFin date not NULL,
	CONSTRAINT trimestre_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;


CREATE TABLE aulanosa.nota (
	id INT NOT NULL AUTO_INCREMENT,
	nota int not null ,
	CONSTRAINT nota_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;


CREATE TABLE aulanosa.asignatura (
	id INT NOT NULL AUTO_INCREMENT,
	nome varchar(100) NOT NULL,
	codigoexterno varchar(100) NOT NULL,
	CONSTRAINT asignatura_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;


CREATE TABLE aulanosa.datopersonal (
	id INT NOT NULL AUTO_INCREMENT,
	telf varchar(10) NOT NULL,
	CONSTRAINT datopersonal_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;

CREATE TABLE aulanosa.expediente (
	id INT NOT NULL AUTO_INCREMENT,
	fecha date NOT NULL,
	contido varchar(2000)  ,
	CONSTRAINT expediente_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;

CREATE TABLE aulanosa.alumnoasignatura (
	idAlumno INT NOT NULL ,
	idAsignatura INT NOT NULL ,
	CONSTRAINT expediente_pk PRIMARY KEY (idAlumno, idAsignatura)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8
COLLATE=utf8_general_ci ;



-- Alters e referencias
ALTER TABLE aulanosa.datopersonal ADD idAlumno INT NOT NULL ;
ALTER TABLE aulanosa.datopersonal ADD CONSTRAINT datopersonal_alumno_fk FOREIGN KEY (idAlumno) REFERENCES aulanosa.alumno(id) ;
commit;

ALTER TABLE aulanosa.expediente ADD idAlumno INT NOT NULL ;
ALTER TABLE aulanosa.expediente ADD CONSTRAINT expediente_alumno_fk FOREIGN KEY (idAlumno) REFERENCES aulanosa.alumno(id) ;
commit;

ALTER TABLE aulanosa.alumnoasignatura ADD CONSTRAINT alumnoasignatura_alumno_fk FOREIGN KEY (idAlumno) REFERENCES aulanosa.alumno(id) ;
ALTER TABLE aulanosa.alumnoasignatura ADD CONSTRAINT alumnoasignatura_asignatura_fk FOREIGN KEY (idAsignatura) REFERENCES aulanosa.asignatura(id) ;
commit;

ALTER TABLE aulanosa.trimestre ADD idAlumno INT NOT NULL ;
ALTER TABLE aulanosa.trimestre ADD CONSTRAINT trimestre_alumno_fk FOREIGN KEY (idAlumno) REFERENCES aulanosa.alumno(id) ;
commit;

ALTER TABLE aulanosa.asistencia ADD idAlumno INT NOT NULL ;
ALTER TABLE aulanosa.asistencia ADD CONSTRAINT asistencia_alumno_fk FOREIGN KEY (idAlumno) REFERENCES aulanosa.alumno(id) ;
commit;

ALTER TABLE aulanosa.nota ADD idAlumno INT NOT NULL ;
ALTER TABLE aulanosa.nota ADD CONSTRAINT nota_alumno_fk FOREIGN KEY (idAlumno) REFERENCES aulanosa.alumno(id) ;
commit;

ALTER TABLE aulanosa.nota ADD idTrimestre INT NOT NULL ;
ALTER TABLE aulanosa.nota ADD CONSTRAINT nota_Trimestre_fk FOREIGN KEY (idTrimestre) REFERENCES aulanosa.Trimestre(id) ;
commit;

ALTER TABLE aulanosa.nota ADD idAsignatura INT NOT NULL ;
ALTER TABLE aulanosa.nota ADD CONSTRAINT nota_Asignatura_fk FOREIGN KEY (idAsignatura) REFERENCES aulanosa.Asignatura(id) ;
commit;

















