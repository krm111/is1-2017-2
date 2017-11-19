package domain;

import javax.persistence.*;

@Entity
//@Table(name = "alumnos")
public class Alumno implements BaseEntity<Long> {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name = "nombres", length = 130, nullable = false)
	private String nombres;
	
	//@Column(name = "ap_pat", length = 64, nullable = false)
	private String apellidoPaterno;
	
	//@Column(name = "ap_mat", length = 64, nullable = false)
	private String apellidoMaterno;
	
	private Long dni;
	
	Alumno(){}
	Alumno(String nombres, String apellidoPaterno, String apellidoMaterno, Long dni) {
		this.nombres = nombres;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.dni = dni;
	}

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	
	public Long getDni() {
		return dni;
	}

	public void setDni(Long dni) {
		this.dni = dni;
	}

}
