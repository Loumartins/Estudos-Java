package academy.devdojo.maratonajava.javacore.Oexceptions.examplebook;

public class TryAninhados {
    public static void main(String[] args) {
        //Utilização de um bloco try aninhado
        //numer mais longo do que denom.
        int numer[] = {4,8,16,32,64,128,256,512};
        int denom[] = {2,0,4,4,0,8};
        try{ //try externo
            for(int i = 0; i < numer.length; i++){
                try{ // try interno
                    System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i]/denom[i]  );
                }
                catch (ArithmeticException e){
                    // captura a exception
                    System.out.println("Can't divide by zero");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            // captura a exception
            System.out.println("No matching element found");
            System.out.println("Fatal error - program terminated");
        }
    }
}
