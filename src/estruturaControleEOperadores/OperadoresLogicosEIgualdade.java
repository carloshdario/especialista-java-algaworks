package estruturaControleEOperadores;

import java.util.Scanner;

public class OperadoresLogicosEIgualdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um ano, para saber se eh bissexto ou nao: ");
        int ano = scanner.nextInt();

        boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        if(isBissexto){
            System.out.printf("O ano %s eh bissexto", ano);
        }else {
            System.out.printf("O ano %s nao e um ano bissexto ", ano);
        }
    }
}
