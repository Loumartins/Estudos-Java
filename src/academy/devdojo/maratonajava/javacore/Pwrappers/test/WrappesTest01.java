package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrappesTest01 {
    public static void main(String[] args) {

        //Classes primitivas

        byte byteP = 1;
        short shortP = 1;
        int intP = 10;
        long longP = 10;
        float floatP = 10F;
        double doubleP = 10.5;
        char charP = 'L';
        boolean booleanP = false;

        // No wrapper ocorre que a agora voce atribui à referencia

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 10; // autoboxing;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10.5;
        Character charW = 'L';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
    }
}
