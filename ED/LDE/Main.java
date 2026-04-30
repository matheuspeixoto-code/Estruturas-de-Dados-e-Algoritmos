package LDE;

public class Main {

    public static void main(String[] args) {
        
        SLinkedList lista = new SLinkedList();
        
        // Criando nós
        Node n1 = new Node("A");
        Node n2 = new Node("B");
        Node n3 = new Node("C");
        Node n4 = new Node("D");

    
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);

        System.out.println("Após add no início:");
        printLista(lista);


        lista.addLast(n4);

        System.out.println("\nApós addLast:");
        printLista(lista);

  
        System.out.println("\nApós remover B:");
        lista.remove(n2);
        
        System.out.println("\nApós remover D:");
        lista.remove(n4);

        System.out.println("\nApós remover B e D:");
        printLista(lista);
    }

 
    public static void printLista(SLinkedList lista) {
        Node atual = lista.inicio;

        while (atual != null) {
            System.out.print(atual.getElemento() + " -> ");
            atual = atual.getProximo();
        }

        System.out.println("null");
    }
}