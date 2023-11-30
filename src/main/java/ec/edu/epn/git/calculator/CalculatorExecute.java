
package ec.edu.epn.git.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        System.out.println("!! Change !!");
        System.out.println("*----- ESCUELA POLITÉCNICA NACIONAL ---*");
        System.out.println("== Calculator Execute ==");

        Calculator c = new Calculator();
        int addition = c.addition(4, 7);
        System.out.println("c.addition(4,7) = " + addition);

        int subtraction = c.subtraction(7, 1);
        System.out.println("c.subtraction(7,1) = " + subtraction);
        System.out.println("!! Change !!");
        System.out.println("INTEGRANTES GR4: Erick Cabezas, Johan Mantilla, Sebastian Moyano, Christopher Zambrano");
        System.out.println("Commit y push hecho por Sebastian Moyano");
        System.out.println("Commit y push hecho por Christopher Zambrano");
        System.out.println("Commit y push hecho por Erick Cabezas");
        System.out.println("PRUEBA");
        System.out.println("PRUEBA2");
    }

}

