package POO;

public class Cachorro {
    public static void main(String[] args) {

        Dog cachorro = new Dog();

        cachorro.idade = 10;
        cachorro.nome = "Doug";
        cachorro.raca = "Pitbull";
        cachorro.sexo = "Macho";

        Dog outroCachorro = new Dog();
        outroCachorro.idade = 5;
        outroCachorro.nome = "Dinda";
        outroCachorro.raca = "Border Collie";
        outroCachorro.sexo = "Femea";

        System.out.println(cachorro);
        System.out.println(outroCachorro);


    }
}

class Dog{
    String nome;
    String raca;
    String sexo;
    int idade;

    @Override
    public String toString() {
        return "Dog{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}
