package actividad2;

class QueueLink<E> implements Queue<E> {
    private Node<E> first;
    private Node<E> last;

    public QueueLink() {
        this.first = null;
        this.last = null;
    }
    public void enqueue(E x) {
        Node<E> aux = new Node<E>(x); // Crea un nuevo nodo con el elemento dado
        if (this.isEmpty()) {
            this.first = aux; 
        } else {
            this.last.setNext(aux); // De lo contrario, enlaza el último nodo al nuevo nodo
        }
        this.last = aux; // Actualiza
    }
    public E dequeue() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía. No se puede realizar dequeue().");
        } else {
            E elemento = this.first.getData(); // Obtiene los datos del primer nodo
            this.first = this.first.getNext(); // Mueve el primer nodo al siguiente nodo
            if (this.first == null) {
                this.last = null; // Si la cola ahora está vacía, actualiza el último nodo a null
            }
            return elemento; // Devuelve los datos del nodo desencolado
        }
    }
    
    public E back() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía. No se puede obtener el elemento en la parte trasera.");
        } else {
            return this.last.getData(); // Devuelve los datos del último nodo
        }
    }
    public E front() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La cola está vacía. No se puede obtener el elemento en la parte frontal.");
        } else {
            return this.first.getData();// Devuelve los datos del primer nodo
        }
    }
    public boolean isEmpty() {
        return this.first == null;
    }
    
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Contenido de la cola:\n"); // Encabezado para el contenido de la cola
        Node<E> current = this.first; // Comienza desde el primer nodo
        while (current != null) {
            result.append(current.getData()).append("\n"); // Añade los datos de cada elemento
            current = current.getNext(); // Mueve al siguiente nodo
        }
        return result.toString(); // Devuelve la representación completa en cadena
    }
}



