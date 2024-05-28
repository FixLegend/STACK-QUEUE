package actividad1;

public class Test {
    public static void main(String[] args) {
        // Crear una pila de capacidad 5 para números enteros
        Stack<Integer> pilaEnteros = new StackArray<>(5);
        // Agregar elementos a la pila
        pilaEnteros.push(10);
        pilaEnteros.push(20);
        pilaEnteros.push(30);
        // Mostrar la pila
        System.out.println("Pila de números enteros:");
        System.out.println(pilaEnteros);
        // Obtener el elemento en la cima de la pila
        try {
            System.out.println("Elemento en la cima de la pila: " + pilaEnteros.top());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
        // Eliminar elementos de la pila
        try {
            System.out.println("Elemento eliminado de la pila: " + pilaEnteros.pop());
            System.out.println("Elemento eliminado de la pila: " + pilaEnteros.pop());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
        // Mostrar la pila después de la eliminación
        System.out.println("Pila después de la eliminación:");
        System.out.println(pilaEnteros);
        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pilaEnteros.isEmpty());
    }
}



