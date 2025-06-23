import java.io.File;

public class App {

    public static void main(String[] args) {
        Pessoa minhaPessoa = new Pessoa("João", "Silva", 25);
        minhaPessoa.exibirDados();

        File meuArquivo = Arquivo.criarArquivo("teste");
        Arquivo.escreverArquivo(meuArquivo, minhaPessoa);

        Pessoa outraPessoa = Arquivo.lerArquivo(meuArquivo);
        outraPessoa.exibirDados();
    }

}
