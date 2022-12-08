package academy.devdojo.maratonajava.javacore.Oexceptions.examplebook;

public class ExcDemo04 {
    //Subclasses devem proceder as superclasses em instruções catch
    public static void main(String[] args) {
        int numer[] = {4,8,16,32,64,128, 256,512};
        int denom[] = {2,0,4,4,0,8};
        for(int i = 0;i<numer.length;i++){
            try{
                System.out.println(numer[i] + " / " + denom[i] + " = " + numer[i]/denom[i] );
            }
            catch (ArrayIndexOutOfBoundsException exc){ //captura a subclasse
                //captura a exception
                System.out.println("No matching element found");
            }
            catch (Throwable exc){ //captura a superclasse
                System.out.println("Some exception ocurred");
            }
        }
    }
}
