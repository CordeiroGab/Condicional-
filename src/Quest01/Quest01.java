package Quest01;

import java.util.Scanner;

public class Quest01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double quant;
        double valor = 0;

        System.out.println(" Maçãs Promoção \n Duzia:R$ 1.00 \n Unidade:R$1.30");

        System.out.print("Digite a quantidade de maçãs: ");
        quant = sc.nextInt();

        if (quant <= 11) {
            valor = quant * 1.30;
            System.out.println("Preço: " + valor);
        } else {
            valor = quant * 1.00;
            System.out.println("Preço " + valor);
        }
    }
}
    

