import java.util.Scanner;
public class Datentyp_double_erkunden {//g
    public static void main(String[] args) {
        double a, b;
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie den Wert für a (dezimale Zahl) ein: ");
        a = input.nextDouble();
        System.out.print("Geben Sie den Wert für b (dezimale Zahl) ein: ");
        b = input.nextDouble();
        double addition = a + b;
        double subtraktion = a - b;
        double multiplikation = a * b;
        double division = 0;
        double modulo = 0;
        if (b != 0) {
            division = a / b;
            modulo = a % b;
        } else {
            System.out.println("Division durch Null ist nicht erlaubt.");
        }
        System.out.println("a + b = " + addition);
        System.out.println("a - b = " + subtraktion);
        System.out.println("a * b = " + multiplikation);

// Überprüfen, ob die Division durch Null vermieden wurde
        if (b != 0) {
            System.out.println("a / b = " + division);
            System.out.println("a % b = " + modulo);
        }
input.close();
    }
}
