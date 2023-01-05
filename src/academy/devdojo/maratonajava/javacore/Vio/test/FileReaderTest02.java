package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest02 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("file2.txt")) {
            //utilização do loop para viabilizar que o metodo read() possa ler todos os caracteres
            int i;
            while((i = fr.read())!= -1){
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
