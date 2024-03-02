package dominio;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Funciones {
    // Metodos para pedir datos
    public static int numero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un numero");

        return sc.nextInt();
    }

    public static int tamaño() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige el tamaño de la lista");
        return sc.nextInt();
    }

    public static ArrayList<Integer> lista(int tamaño, Scanner sc) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Elige el numero que quieres agregar");
            Integer numero = sc.nextInt();
            lista.add(numero);
        }
        return lista;
    }

    // 1
    public static int suma(int n) {
        return IntStream.rangeClosed(1, n)
                .sum();
    }

    // 2
    public static int factorial(int n) {
        return IntStream.rangeClosed(1, n)
                .reduce(1, (x, y) -> x * y);

    }

    // 3
    public static int potencias(int n, int i) {

        return  IntStream.
                rangeClosed(1, i)
                .map(x -> (int) Math.pow(n, x))
                .sum();

    }

    // 4
    public static Integer listaSuma(ArrayList<Integer> lista, Scanner sc) {
        lista = lista(tamaño(),sc);
      return lista.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    // 5
    public static Integer mediaLista( ArrayList<Integer> lista, Scanner sc) {

        lista = lista(tamaño(), sc);

       return lista.stream()
                .mapToInt(Integer::intValue)
                .sum() / lista.size();
    }


    // 6(este aun no esta terminado)
    // public static double desviacionTipica(ArrayList<Integer> lista, Scanner sc,
    // int indice, double sum) {
    // tamaño();
    // double a = mediaLista(tamaño(),lista, sc);
    // if (indice <= 0) {
    // return Math.sqrt(sum / lista.size());
    // } else {
    // sum += Math.pow(lista.get(indice-1) - a, 2);
    // return desviacionTipica(lista, sc, indice - 1, sum);
    // }
    // }

    // 7
    public static int sumaPares(int n) {

       return IntStream.rangeClosed(1, n)
                .filter(x -> x % 2 == 0)
                .sum();

    }

    // 8
    public static Integer listaSumaPares( Scanner sc) {

        ArrayList<Integer> lista = lista(tamaño(), sc);

        return lista.stream()
                .filter(x -> x % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

    }

    // 9
    public static ArrayList<Integer> obtenerListaPares(ArrayList<Integer> lista,Scanner sc) {
        lista = lista(tamaño(), sc);
        return lista.stream()
                    .filter(n -> n >= 2 & n >= 2)
                    .collect(Collectors.toCollection(ArrayList::new));
    }

    // 10
    public static ArrayList<Integer> listaPar(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(x -> x % 2 == 0)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

    }

    // 11
    public static Integer productoEscalar(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {

        return IntStream.range(0, lista1.size())
                .map(i -> lista1.get(i) * lista2.get(i))
                .sum();
    }

    // // 12
    public static int fibonacci(int n) {
       
        return IntStream.range(0, n)
                .map(x -> (int) Math.pow(2, x))
                .sum();

    }

   
   
   
    
    

}