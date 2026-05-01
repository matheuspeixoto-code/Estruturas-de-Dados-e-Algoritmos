package LEC;

public class CircleList {
	
	protected Node inicio;
	protected int tamanho;
	
	public CircleList() {
		this.inicio = null;
		this.tamanho = 0;
	}

	public int getTamanho() {
		return tamanho;
	}
	
	
	public Node getInicio() {
		return inicio;
	}

	public void add(Node novoNode) {
		if(inicio==null) { 
			novoNode.setProximo(novoNode);
			novoNode.setPassado(novoNode);
			inicio=novoNode;
		}else {
			Node auxNode=inicio.getPassado();
			
			novoNode.setProximo(inicio);
			novoNode.setPassado(inicio.getPassado());
			
			auxNode.setProximo(novoNode);
			
			inicio.setPassado(novoNode);
			
		}
		
		tamanho++;
	}
	
	public void remove(Node removeNode) {
		
		if (inicio == null) {
			return;
		}
		
		if (inicio == removeNode && inicio.getProximo() == inicio) {
		    inicio = null;
		    tamanho--;
		    return;
		}
		
		Node auxNodePreRemove = inicio;
		
		while (!auxNodePreRemove.getProximo().equals(removeNode)) {
			
			if(auxNodePreRemove.getProximo().equals(inicio)) {
				return;
			}
			
			auxNodePreRemove=auxNodePreRemove.getProximo();
			
		}
		
		removeNode=auxNodePreRemove.getProximo();
		
		if (removeNode.equals(inicio)) {
			inicio=inicio.getProximo();
		}
		
		Node auxNodePosRemove=removeNode.getProximo();
		
		auxNodePreRemove.setProximo(auxNodePosRemove);
		auxNodePosRemove.setPassado(auxNodePreRemove);
		
		removeNode.setPassado(null);
		removeNode.setProximo(null);
		
		tamanho--;
		
	}
	
	
	
	
}
