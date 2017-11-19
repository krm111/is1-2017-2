package domain;

import javax.persistence.*;

import java.util.Vector;

import java.util.List;

@Entity
public class Curso implements BaseEntity<Long> {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String codigo;

	private String nombre;

	private Integer creditos;
	
	@ManyToMany
	@JoinTable(name = "curso_prerequisitos",
	joinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id"),
	inverseJoinColumns = @JoinColumn(name = "id_prereq", referencedColumnName = "id"))
	private List<Curso> prerequisitos;
	
	Curso() {
		this.prerequisitos = new Vector<Curso>();
	}
	
	Curso(String codigo, String nombre, Integer creditos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
		this.prerequisitos = new Vector<Curso>();
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	
	public List<Curso> getPrerequisitos() {
		return prerequisitos;
	}

	public void setPrerequisitos(List<Curso> prerequisitos) {
		this.prerequisitos = prerequisitos;
	}
	

}
