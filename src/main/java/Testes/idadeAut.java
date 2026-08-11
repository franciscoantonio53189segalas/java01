package Testes;

import java.util.Scanner;

public class idadeAut {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite sua idade.");
        double idade = Double.parseDouble(scanner.nextLine());

        if (idade >= 18){
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade");
        }
    }
}
