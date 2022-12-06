package academy.devdojo.maratonajava.javacore.Oexceptions.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        try{
            divide(1,0);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Código finalizado");
    }
    private static int divide(int a, int b) {
       if( b == 0) {
           throw new IllegalArgumentException("Argumento ilegal, não pode ser zero");
       }
       return a/b;
    }
}
