package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest02 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file2.txt", true)){
            fw.write("Olá Mundo\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }

