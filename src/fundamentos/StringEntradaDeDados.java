package fundamentos;

import java.util.Scanner;

public class StringEntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual valor por hora voce recebe? ");
        double valorHora = scanner.nextDouble();

        System.out.println("Quantas Horas voce trabalha por mes? ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Qual valor dos seus descontos? ");
        double descontos = scanner.nextDouble();

        double salario = horasTrabalhadas * valorHora;
        double salarioLiquido = salario - descontos;

        System.out.printf("Folha de pagamento: %s%n", nome);
        System.out.printf("%d horas X R$%.2f = R$%.2f%n", horasTrabalhadas, valorHora, salario);
        System.out.printf("Descontos: R$%.2f%n", descontos);
        System.out.printf("Total devido: R$%.2f", salarioLiquido);


    }
}
