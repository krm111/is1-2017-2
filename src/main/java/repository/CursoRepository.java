package repository;

import java.util.Collection;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.hibernate.sql.Select;
import domain.Curso;

public interface CursoRepository extends CrudRepository<Curso,Long> {
	
	@Query("SELECT c from Curso c")
	Collection<Curso> findAll();
	
	@Query("SELECT c FROM Curso c WHERE c.codigo = ?1")
	Collection<Curso> findCodigo(String codigo);
	
	@Query("SELECT c FROM Curso c WHERE c.nombre LIKE CONCAT('%',:nombre,'%')")
	Collection<Curso> findNombre(String nombre);
	
}
