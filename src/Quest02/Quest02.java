package Quest02;

import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {

        System.out.println("DIAS DA SEMANA");
        System.out.println("____________________________");
        System.out.print("Digite um número de 1 a 7 :");

        Scanner dia = new Scanner(System.in);
        int semana;
        semana = Integer.parseInt(dia.nextLine());

         switch (semana){

            case 1 -> System.out.print("Segunda");

            case 2 -> System.out.print("terça");

            case 3 -> System.out.print("Quarta");

            case 4 -> System.out.print("Quinta");

            case 5 -> System.out.print("Sexta");

            case 6 -> System.out.print("Sabado");

            case 7 -> System.out.print("Domingo");

            default -> System.out.print("valor invalido");
        }


    }
}
