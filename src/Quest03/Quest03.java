package Quest03;

import java.util.Scanner;

public class Quest03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        int contNumb;
        double saldo,debito,credito, saldoAtual;

        System.out.print("Digite seu nome : ");
        nome = sc.nextLine();
        System.out.print("Digite o número da conta : ");
        contNumb = sc.nextInt();
        System.out.print("Digite seu saldo :R$");
        saldo = sc.nextDouble();
        System.out.print("Digite seu debito :R$");
        debito = sc.nextDouble();
        System.out.print("Digite o credito :R$");
        credito = sc.nextDouble();

        saldoAtual = saldo - debito + credito;
            System.out.println("Saldo Atual: R$"+saldoAtual);

        if (saldoAtual >= 0) {
            System.out.print(nome+", seu saldo é positivo");
        } else  {
            System.out.print(nome+", seu saldo é negativo");
        }

    }
}
