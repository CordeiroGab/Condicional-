package Quest04;

import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        double dureza,teooCarvao,resistencia;

        System.out.print("Digite a dureza do aço: ");
        dureza = sc.nextDouble();
        System.out.print("Digite o Teor do Carvão: ");
        teooCarvao = sc.nextDouble();
        System.out.print("Digite a resistencia do aço: ");
        resistencia = sc.nextDouble();

        System.out.println("Grau do seu aço");
        System.out.println("Dureza: "+dureza+"\nTeor do carvão: "+teooCarvao+"\nResistencia: "+resistencia);

        if (dureza > 50 && teooCarvao < 0.7 && resistencia > 5600 ){
            System.out.print("Grau do seu aço é 10");

       }
        else if (dureza > 50 && teooCarvao < 0.7 && resistencia <= 5600){
            System.out.print("Grau do seu aço é 9");

        }

        else if (dureza <= 50 && teooCarvao < 0.7 && resistencia > 5600){
            System.out.print("Grau do seu aço é 8");

        }

        else if (dureza > 50 && teooCarvao > 0.7 && resistencia > 5600){
            System.out.print("Grau do seu aço é 7");

        }

        else if (dureza > 50 ^ teooCarvao <= 0.7 ^ resistencia > 5600) {
            System.out.print("Grau do seu aço é 6");

        }

        else if (dureza < 50 && teooCarvao > 0.7 && resistencia < 5600) {
            System.out.print("Grau do seu aço é 5");

        }
    }
}
