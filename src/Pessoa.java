import java.io.Serializable;

public class Pessoa implements Serializable {

    String nome;
    String sobrenome;
    int idade;

    public Pessoa() {
    }

    public Pessoa(String nome, String sobrenome, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
    }

    public void exibirDados(){
        System.out.println("\nNome Completo: " + this.nome + " " + this.sobrenome);
        System.out.println("Idade: " + this.idade);
    }

}
