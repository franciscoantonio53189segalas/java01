package Testes;

import java.util.Scanner;

public class retanguloArea {
    public static void main(String[] ARGS){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da compra");
        double valorDaCompra =  Double.parseDouble(scanner.nextLine());

        System.out.println("Digite o valor pago");
        double valorPago = Double.parseDouble(scanner.nextLine());

        double troco = valorDaCompra - valorPago;


        System.out.println("troco");
        System.out.println(troco);






    }
}
