package actividad3;

class PriorityQueueLinkSort<E, P extends Comparable<P>> implements PriorityQueue<E, P> {
    class EntryNode {
        E data;
        P priority;
        EntryNode(E data, P priority) {
            this.data = data;
            this.priority = priority;
        }
        
        public E getData() {
            return data;
        }
        
        public P getPriority() {
            return priority;
        }
    }
    private Node<EntryNode> first;
    private Node<EntryNode> last;
    public PriorityQueueLinkSort() {
        this.first = null;
        this.last = null;
    }
    public void enqueue(E x, P pr) {
        EntryNode newNode = new EntryNode(x, pr); // se crea un entry node
        Node<EntryNode> newNodeWrapper = new Node<>(newNode);
        
        if (isEmpty() || pr.compareTo(first.getData().priority) > 0) { // si esta vacia o la prioridad es > que el 1er elemento
            newNodeWrapper.setNext(first); // primero
            first = newNodeWrapper;
            if (last == null) { // cola esta vacia
                last = first;
            }
            return;
        }
        
        Node<EntryNode> current = first; // si no hay prioridad mas alto busca donde colocar
        while (current.getNext() != null && pr.compareTo(current.getNext().getData().priority) <= 0) { //va comparando posicion
            current = current.getNext(); // se mueve
        }
        newNodeWrapper.setNext(current.getNext()); // inserta el nuevo nodo en la posicion
        current.setNext(newNodeWrapper);
        if (newNodeWrapper.getNext() == null) { // si se inserta alfinal
            last = newNodeWrapper; // actualiza
        }
    }
	    public E dequeue() throws ExceptionIsEmpty {
	        if (isEmpty()) // Verifica
	            throw new ExceptionIsEmpty("No se puede eliminar de una cola vacía");
	        E aux = this.first.getData().data; // guarda
	        this.first = this.first.getNext(); // apunta al siguente
	        if (this.first == null) // elimina el ultimo nodo
	            this.last = null; // actualiza
	        return aux;
	    }
	    public E back() throws ExceptionIsEmpty {
	        if (isEmpty())  // Verifica 
	            throw new ExceptionIsEmpty("No se puede acceder al último elemento de una cola vacía");
	        return last.getData().data;   // Retorna el dato del último nodo en la cola
	    }
	    public E front() throws ExceptionIsEmpty {
	        if (isEmpty())// Verifica
	            throw new ExceptionIsEmpty("No se puede acceder al primer elemento de una cola vacía");
	        return first.getData().data; // Retorna el dato del primer nodo en la cola
	    }
	    public boolean isEmpty() {
	        return first == null; 
	    }
	    public String toString() {
	        StringBuilder sb = new StringBuilder(); //itera
	        Node<EntryNode> current = first;
	        while (current != null) { // Agrega el dato de cada nodo a la cadena resultante
	            sb.append(current.getData().data).append(" ");
	            current = current.getNext();
	        }
	        return sb.toString();
	    }
	}





