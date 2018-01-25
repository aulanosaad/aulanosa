
INSERT INTO aulanosa.datopersonal
(id, telf, idAlumno)
VALUES(1, '981565852', 1);


INSERT INTO aulanosa.datopersonal
(id, telf, idAlumno)
VALUES(2, '651851815', 2);


INSERT INTO aulanosa.datopersonal
(id, telf, idAlumno)
VALUES(3, '254735673', 3);


INSERT INTO aulanosa.datopersonal
(id, telf, idAlumno)
VALUES(4, '99988252', 4);

alter table datopersonal drop column idAlumno ;
alter table datopersonal DROP FOREIGN KEY 'datopersonal_alumno_fk';