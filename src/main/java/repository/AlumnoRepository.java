package repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.hibernate.sql.Select;
import domain.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno,Long> {
	
	@Query("SELECT a FROM Alumno a WHERE a.apellidoPaterno = ?1")
	Collection<Alumno> findApellidoP(String apellido);
	
}
