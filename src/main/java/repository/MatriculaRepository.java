package repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.hibernate.sql.Select;
import domain.Matricula;
import domain.Curso;
import domain.Alumno;

public interface MatriculaRepository extends CrudRepository<Matricula,Long> {
	
	@Query("SELECT a , m.nota FROM Alumno a JOIN Matricula m where a.id = m.alumno.id AND a.curso = ?1 AND a.semestre = ?2")
	Collection<Alumno> findCursoSemestre(Curso curso, String semestre);

}
