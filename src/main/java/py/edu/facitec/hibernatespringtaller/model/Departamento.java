package py.edu.facitec.hibernatespringtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Departamento {

	@Id
	@GeneratedValue
	private Integer id;
	private String descripcion;

	@OneToOne
	private Gerente gerente;

	@OneToMany(mappedBy="departamento")
	private List<Usuario> listaUsuario;


	public Departamento() {
		id  = 0;
		descripcion = "";
		gerente = new Gerente();

	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Gerente getGerente() {
		return gerente;
	}


	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}


	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}


	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}




}
