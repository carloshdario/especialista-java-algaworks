package lambdaEMethodReference.desafio;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Principal {
    public static void main(String[] args) {
        var funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
        funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
        funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
        funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

        // TODO remover funcionários inativos
        Predicate<Funcionario> predicateRemoverInativo =  funcionario -> funcionario.isInativo();
        funcionarios.removeIf(predicateRemoverInativo);


        // TODO ordenar funcionários pelo valor do salário
        Function<Funcionario, BigDecimal> function = funcionario -> funcionario.getSalario();
        funcionarios.sort(Comparator.comparing(function));


        // TODO iterar e imprimir funcionários usando o método estático imprimir
        Consumer<Funcionario> consumer = funcionario -> imprimir(funcionario);
        funcionarios.forEach(consumer);
    }

    private static void imprimir(Funcionario funcionario) {

        System.out.printf("Funcionario: %s, Salario R$%s, imposto: R$%s%n", funcionario.getNome(), funcionario.getSalario(), funcionario.getSalario().multiply(new BigDecimal("0.2")));

    }

}

