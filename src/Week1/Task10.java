package Week1;

import java.util.Scanner;

/*
Перевод литров в галлоны.
    С консоли считывается число n –  количество литров, которое нужно перевести в галлоны.
    (1 литр = 0,219969 галлонна)
 */
public class Task10 {
    private static final double LITRE_TO_GALLON = 0.219969;

    public static void main(String[] args) {
        final double gallonToLitre = 0.219969;

        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество литров: ");
        int n = console.nextInt();

        System.out.println("Веедено " + n + " литров -> это получается: " + n * gallonToLitre + " галлонов." );


    }
}
