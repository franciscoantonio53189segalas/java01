package Testes;
import java.util.Locale;
import java.util.Scanner;
public class DoZero {


    public static void main(String[] ARGS) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base");
        double base = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite altura");
        Double altura = Double.parseDouble(scanner.nextLine());
        double area = base*altura;
        System.out.println(area);
        scanner.close();


    }
}