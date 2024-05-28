package actividad1;

class StackArray<E> implements Stack<E> {
    private E[] array;
    private int tope;
    private int capacity;

    public StackArray(int capacity) {
        this.array = (E[]) new Object[capacity];
        this.capacity = capacity;
        tope = -1;
    }
    public void push(E x) {
        if (isFull()) {
            System.out.println("La pila está llena. No se puede agregar más elementos.");
        } else {
            tope++;
            array[tope] = x;
        }
    }
    public E pop() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía. No se puede realizar pop().");
        } else {
            E elemento = array[tope];
            array[tope] = null; // Liberar referencia
            tope--;
            return elemento;
        }
    }
    public E top() throws ExceptionIsEmpty {
        if (isEmpty()) {
            throw new ExceptionIsEmpty("La pila está vacía. No se puede obtener el elemento en la cima.");
        } else {
            return array[tope];
        }
    }

    public boolean isEmpty() {
        return tope == -1;
    }

    public boolean isFull() {
        return tope == capacity - 1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Contenido de la pila:\n");
        for (int i = tope; i >= 0; i--) {
            result.append(array[i]).append("\n");
        }
        return result.toString();
    }
}






