package py.edu.facitec.hibernatespringtaller.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity //Indicamos que sera una tabla
public class Cliente {

	@Id //Indicamos que sera una clave primaria
	@GeneratedValue //Generacion automatica de id
	private Integer id;
	private String nombre;
	private String correo;

	@OneToMany(mappedBy="cliente")
	private List<Pedido> listaPedidos;

	public Cliente() {
		id = 0;
		nombre = "";
		correo = "";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public List<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	public void setListaPedidos(List<Pedido> listaPedidos) {
		this.listaPedidos = listaPedidos;
	}

}