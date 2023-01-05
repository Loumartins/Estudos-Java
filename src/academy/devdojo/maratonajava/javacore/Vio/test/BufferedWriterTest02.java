package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest02 {
    public static void main(String[] args) {
        try (FileWriter fw= new FileWriter("file2.txt", true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("Olá Mundo!");
            bw.newLine();
            bw.flush();
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
