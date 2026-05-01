package LEC;

public class Main {
    public static void main(String[] args) {
        
        CircleList lista = new CircleList();
        
        Node n1 = new Node("1");
        Node n2 = new Node("2");
        Node n3 = new Node("3");
        Node n4 = new Node("4");
        Node n5 = new Node("5");
        Node n6 = new Node("6");
        Node n7 = new Node("7");

      
        lista.add(n1);
        lista.add(n2);
        lista.add(n3);
        lista.add(n4);
        lista.add(n5);
        lista.add(n6);
        lista.add(n7);

        System.out.println("Lista após inserções:");
        printLista(lista);

     
        lista.remove(n4);
        System.out.println("\nApós remover o 4:");
        printLista(lista);

     
        lista.remove(n6);
        System.out.println("\nApós remover o 6:");
        printLista(lista);

      
        lista.remove(n1);
        System.out.println("\nApós remover o 1 (início):");
        printLista(lista);

        
        lista.remove(n7);
        System.out.println("\nApós remover o 7:");
        printLista(lista);

        
        lista.remove(n2);
        lista.remove(n3);
        System.out.println("\nApós remover 2 e 3:");
        printLista(lista);

 
        lista.remove(n5);
        System.out.println("\nApós remover 5 (resta apenas 1 elemento):");
        printLista(lista);

 
        lista.remove(n6);
        System.out.println("\nApós tentar remover 6 novamente:");
        printLista(lista);
    }

    public static void printLista(CircleList lista) {
        if (lista.getInicio() == null) {
            System.out.println("Lista vazia");
            return;
        }

        Node atual = lista.getInicio();

        System.out.print("↻ ");

        do {
            System.out.print(atual.getElemento() + " ⇄ ");
            atual = atual.getProximo();
        } while (atual != lista.getInicio());

        System.out.println("(volta para " + lista.getInicio().getElemento() + ")");
    }
}