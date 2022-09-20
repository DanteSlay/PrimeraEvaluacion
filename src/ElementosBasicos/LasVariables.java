package ElementosBasicos;

public class LasVariables {
    public static void main(String[] args) {

        // VARIABLES

        int a = 5; // Declaro la variable a, asignandole el numero 5
        System.out.println("La variable a vale " + a);

        // Su valor puede ser modificado en cualquier momento
        a = 8;
        System.out.println("La variable a vale " + a);
        // A partir de aqui a sera 8


        //Reglas para las variables

        /*No puede comenzar por ningun digito
        Puede contener cualquier tipo de letra o digito
        No puede contener ningun caracter especial a excepcion de "_" y "$"
        No puede contener espacios
         */

        System.out.println("Tipos de variable para numeros enteros: byte, short, int y long");

        System.out.println("byte");
        byte variableBytePos = 127; //Es el numero mas grande de una varable byte
        byte variableByteNeg = -128; //Es el numero mas pequeño que puedo almacenar
        System.out.println("variableByteNeg" + variableByteNeg);
        System.out.println("variableBytePos" + variableBytePos);


        System.out.println("-------------------------");


        System.out.println("Tipo de variable para numeros con decimales: float y double");





    }
}
