package LDE;

public class SLinkedList {
	
	protected Node inicio;
	protected Node fim;
	protected int tamanho;
	
	public SLinkedList() {
		this.inicio = null;
		this.fim=null;
		this.tamanho = 0;
	}
	
	public void add(Node novoNode) {
		
		if (tamanho==0) {
			novoNode.setProximo(null);
			novoNode.setPassado(null);
			inicio=novoNode;
			fim=novoNode;
		}else {
			novoNode.setProximo(inicio);
			inicio.setPassado(novoNode);
			novoNode.setPassado(null);
			inicio=novoNode;
		}
		
		tamanho++;
	}
	
	public void addLast(Node novoNode) {
		
		if(tamanho==0) {
			novoNode.setProximo(null);
			novoNode.setPassado(null);
			inicio=novoNode;
			fim=novoNode;
			
			
		}else {
			novoNode.setProximo(null);
			novoNode.setPassado(fim);
			fim.setProximo(novoNode);
			fim=novoNode;
			
		}
		
		
		tamanho++;
	}
	
	
	public void remove(Node nodeRemove) {
		if(inicio ==null) return;
		
		
		else if(inicio.equals(nodeRemove)) {
			inicio=inicio.getProximo();
			inicio.setPassado(null);
			if(inicio==null) {
				fim=null;
			}
			tamanho--;

			return;
			
		}
		
		else if(fim.equals(nodeRemove)) {
			Node remove=fim;
			
			fim = remove.getPassado();
			
			remove.setPassado(null);
			
			fim.setProximo(null);
			
			tamanho--;
			
			return;
		}
		
		else {
			Node remove=inicio;
			Node ProxRemove=inicio;
			Node AntRemove=inicio;
			while(remove.getProximo() != null && !remove.equals(nodeRemove)) {
				remove=remove.getProximo();
			}
			if(remove.getProximo()!=null) {
				
				ProxRemove.setPassado(remove.getPassado());
				AntRemove.setProximo(remove.getProximo());
				
				remove.setPassado(null);
				remove.setProximo(null);
				
				
				
				if(remove==fim) {
					fim=remove;
				}
				tamanho--;
			}
			
		}
		
		
	}
	
}
