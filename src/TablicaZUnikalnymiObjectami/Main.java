package TablicaZUnikalnymiObjectami;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Scanner scanner = new Scanner (System.in);
        boolean isIdentical = true;
        int index = 0;
        while (isIdentical) {
            System.out.println ("Wprowadz dane dla objektu");
            System.out.println ("Wprowadz imie");
            String name = scanner.nextLine ();
            System.out.println ("Wprowadz ilość lat");
            int year = scanner.nextInt ();
            scanner.nextLine ();

            Animal animal = new Animal (name, year);
            System.out.println (animal.toString ());
            boolean isEqual = false;
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].equals (animal)) {
                    System.out.println ("Duplikat , wprowadż dane ponownie");
                    isEqual = true;
                }
            }

            if (isEqual == false) {
                animals[index] = animal;
                index++;
            }

            if (index >= animals.length - 1) {
                isIdentical = false;
            }
        }
    }
}





