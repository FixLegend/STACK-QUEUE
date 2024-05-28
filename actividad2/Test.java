package actividad2;

public class Test {
    public static void main(String[] args) {
        // Crear una cola de números enteros
        Queue<Integer> colaEnteros = new QueueLink<>();
        // Agregar elementos a la cola
        colaEnteros.enqueue(40);
        colaEnteros.enqueue(50);
        colaEnteros.enqueue(60);
        // Mostrar la cola
        System.out.println("Cola de números enteros:");
        System.out.println(colaEnteros);
        // Obtener el elemento en la parte frontal de la cola
        try {
            System.out.println("Elemento en la parte frontal de la cola: " + colaEnteros.front());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
        // Obtener el elemento en la parte trasera de la cola
        try {
            System.out.println("Elemento en la parte trasera de la cola: " + colaEnteros.back());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
        // Eliminar elementos de la cola
        try {
            System.out.println("Elemento eliminado de la cola: " + colaEnteros.dequeue());
            System.out.println("Elemento eliminado de la cola: " + colaEnteros.dequeue());
        } catch (ExceptionIsEmpty e) {
            System.out.println(e.getMessage());
        }
        // Mostrar la cola después de la eliminación
        System.out.println("Cola después de la eliminación:");
        System.out.println(colaEnteros);
        // Verificar si la cola está vacía
        System.out.println("¿La cola está vacía? " + colaEnteros.isEmpty());
    }
}