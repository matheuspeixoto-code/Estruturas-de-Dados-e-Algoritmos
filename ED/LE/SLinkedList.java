package LE;

public class SLinkedList {
	
	protected Node inicio;
	protected Node fim;
	protected int tamanho;
	
	public SLinkedList() {
		this.inicio = null;
		this.fim=null;
		this.tamanho = 0;
	}
	
	public void addFirst(Node novoNode) {
		
		if (tamanho==0) {
			novoNode.setProximo(null);
			inicio=novoNode;
			fim=novoNode;
		}else {
			novoNode.setProximo(inicio);
			inicio=novoNode;
		}
		
		tamanho++;
	}
	
	public void addLast(Node novoNode) {
		novoNode.setProximo(null);
		fim.setProximo(novoNode);
		fim=novoNode;
		
		tamanho++;
	}
	
	
	public void remove(Node nodeRemove) {
		if(inicio ==null) return;
		
		
		if(inicio.equals(nodeRemove)) {
			inicio=inicio.getProximo();
			if(inicio==null) {
				fim=null;
			}
			tamanho--;

			return;
			
		}
		
		
		Node remove;
		Node aux=inicio;
		while(aux.getProximo() != null && !aux.getProximo().equals(nodeRemove)) {
			aux=aux.getProximo();
		}
		if(aux.getProximo()!=null) {
			remove=aux.getProximo();
			aux.setProximo(remove.getProximo());
			
			if(remove==fim) {
				fim=aux;
			}
			tamanho--;
		}
		
		
	}
	
}
