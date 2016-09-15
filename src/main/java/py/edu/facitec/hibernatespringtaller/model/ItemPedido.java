package py.edu.facitec.hibernatespringtaller.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class ItemPedido {

	private Integer id;
	private int cantidadProducto;
	private double subTotal;
	
	@ManyToOne
	private Producto producto;
	
	@ManyToOne
	private Pedido pedido;

	
	public ItemPedido() {
		id = 0;
		cantidadProducto = 0;
		subTotal = 0;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

}
