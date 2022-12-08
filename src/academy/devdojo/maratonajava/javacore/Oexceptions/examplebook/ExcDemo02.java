package academy.devdojo.maratonajava.javacore.Oexceptions.examplebook;

public class ExcDemo02 {
    // Trata o erro normalmente e continua a exception
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128};
        int denom[] = {2,0,4,4,0,8};
        for(int i = 0; i < numer.length; i++){
            try{
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i]/denom[i]);
            }
            catch (ArithmeticException exc){
                //captura a exception
                System.out.println("Não pode ser dividido por 0");
            }
        }
    }
}
