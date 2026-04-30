package LDE;

public class Node {
	
	private String elemento;
	private Node proximo, passado;
	
	public Node(String elemento) {
		this.elemento = elemento;
		this.proximo = null;
		this.passado=null;
	}
	
	
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	public Node getProximo() {
		return proximo;
	}
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	public Node getPassado() {
		return passado;
	}
	public void setPassado(Node passado) {
		this.passado = passado;
	}
	
	
	
}
