package academy.devdojo.maratonajava.javacore.Oexceptions.examplebook;

public class ThrowDemo {
    public static void main(String[] args) {
        // lançar manualmente uma exception
        try{
            // lançamento manual da exception
            throw new ArithmeticException();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception capturada");
        }
        System.out.println("Fora do bloco try/catch");
    }
}
