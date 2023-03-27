import java.util.*;

public class ExemploMapOrdenadoPorChave {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Maria");
        map.put(3, "João");
        map.put(4, "Pedro");
        map.put(2, "Ana");

        List<Map.Entry<Integer, String>> lista = new ArrayList<>(map.entrySet());
        Comparator<Map.Entry<Integer, String>> comparador = Comparator.comparing(Map.Entry::getKey);
        Collections.sort(lista, comparador);

        Map<Integer, String> mapOrdenado = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> entry : lista) {
            mapOrdenado.put(entry.getKey(), entry.getValue());
        }

        System.out.println("Mapa original: " + map);
        System.out.println("Mapa ordenado por chave: " + mapOrdenado);
    }
}

