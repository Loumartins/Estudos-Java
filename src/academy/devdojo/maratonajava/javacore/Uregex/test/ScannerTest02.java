package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannerTest02 {
    public static void main(String[] args) {
        String texto = "Levi, Eren , Mikasa";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
