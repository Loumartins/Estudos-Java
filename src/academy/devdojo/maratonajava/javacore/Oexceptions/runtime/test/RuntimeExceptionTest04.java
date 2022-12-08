package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try{
            throw  new ArrayIndexOutOfBoundsException();
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException");
        }
        catch (RuntimeException e){
            System.out.println("Dentro do RuntimeException");
        }
        //Utilização da sintaxe de multi catch
        try {
            talvezLanceException();
        }
        catch (SQLException | FileNotFoundException e){
            e.printStackTrace();
        }
    }
    //Utilização da sintaxe de multi catch
        private static void talvezLanceException() throws SQLException, FileNotFoundException {

        }
}
