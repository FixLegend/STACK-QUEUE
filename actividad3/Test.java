package actividad3;

import java.util.Random;

public class Test {
    public static void main(String[] args) throws ExceptionIsEmpty {
        // Crear una cola de prioridad para números enteros
        PriorityQueue<Integer, Integer> integerPriorityQueue = new PriorityQueueLinkSort<>();
        probarCola(integerPriorityQueue, "Integer");
        // Crear una cola de prioridad para cadenas de texto
        PriorityQueue<String, Integer> stringPriorityQueue = new PriorityQueueLinkSort<>();
        probarCola(stringPriorityQueue, "String");
        // Crear una cola de prioridad para objetos personalizados
        PriorityQueueLinkSort<EntryNode, Integer> entryNodePriorityQueue = new PriorityQueueLinkSort<>();
        probarCola(entryNodePriorityQueue, "EntryNode");
    }
    public static <E, P> void probarCola(PriorityQueue<E, P> priorityQueue, String dataType) throws ExceptionIsEmpty {
        System.out.println("Probando Cola de Prioridad con tipo de datos: " + dataType);
        System.out.println("¿La cola está vacía? " + priorityQueue.isEmpty());
        
        // Llenar la cola de prioridad con datos aleatorios
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int prioridad = random.nextInt(100); // Prioridad aleatoria
            priorityQueue.enqueue((E) (dataType + i), (P) Integer.valueOf(prioridad));
        }
        
        System.out.println("Frente de la cola: " + priorityQueue.front());
        System.out.println("Final de la cola: " + priorityQueue.back());
        // Desencolar elementos de la cola
        System.out.println("Desencolando elementos:");
        while (!priorityQueue.isEmpty()) {
            try {
                System.out.println("Desencolado: " + priorityQueue.dequeue());
            } catch (ExceptionIsEmpty exceptionIsEmpty) {
                exceptionIsEmpty.printStackTrace();
            }
        }
        System.out.println("¿La cola está vacía ahora? " + priorityQueue.isEmpty());
        System.out.println("--------------------------------------------------");
    }
}


