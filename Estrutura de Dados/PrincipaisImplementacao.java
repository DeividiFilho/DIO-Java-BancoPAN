// Esse é uma resumo do aprendizado no curso
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

public class PrincipaisImplementacao {

    public static void main(String[] args) {

        // ArrayList - uma lista que permite adicionar e remover elementos facilmente
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("world");
        arrayList.remove(1);
        System.out.println(arrayList);

        // LinkedList - uma lista encadeada que permite adicionar e remover elementos facilmente
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("world");
        linkedList.remove(1);
        System.out.println(linkedList);

        // Stack - uma pilha que segue o princípio LIFO (Last In, First Out)
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        System.out.println(stack.pop());

        // Queue - uma fila que segue o princípio FIFO (First In, First Out)
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(1);
        queue.add(4);
        System.out.println(queue.remove());

        // PriorityQueue - uma fila com prioridade, onde os elementos são recuperados na ordem da sua prioridade
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(3);
        priorityQueue.add(1);
        priorityQueue.add(4);
        System.out.println(priorityQueue.remove());

        // HashSet - um conjunto que não permite elementos duplicados
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        System.out.println(hashSet);

        // HashMap - um mapa que associa chaves a valores
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        System.out.println(hashMap.get("two"));

        // TreeMap - um mapa ordenado que associa chaves a valores
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("one", 1);
        treeMap.put("three", 3);
        treeMap.put("two", 2);
        System.out.println(treeMap.get("two"));

    }
}
