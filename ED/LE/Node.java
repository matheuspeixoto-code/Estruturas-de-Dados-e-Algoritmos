package LE;

public class Node {
	
	private String elemento;
	private Node proximo;
	
	public Node(String elemento, Node proximo) {
		this.elemento = elemento;
		this.proximo = proximo;
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
	
	
}
