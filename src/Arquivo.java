import java.io.*;

public class Arquivo {

    public static File criarArquivo(String nome) {

        try {
            File arquivo = new File(nome + ".ser");

            if (!arquivo.createNewFile()) {
                System.out.println("\nArquivo " + arquivo.getName() + " já existe!");
                return arquivo;
            }

            System.out.println("\nArquivo " + arquivo.getName() + " criado com sucesso!");
            return arquivo;
        } catch (IOException e) {
            System.out.println("\nOcorreu um erro ao criar o arquivo!");
        }

        return null;
    }

    public static void escreverArquivo(File arquivo, Pessoa objeto) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(arquivo));

            escritor.writeObject(objeto);
            escritor.close();

            System.out.println("Objeto " + objeto.nome + " escrito com sucesso em " + arquivo.getName() + "!");
        } catch (IOException e) {
            System.out.println("\nOcorreu um erro ao escrever " + objeto.nome + " no arquivo " + arquivo.getName() + "!");
        }
    }

    public static Pessoa lerArquivo(File arquivo) {
        try {
            ObjectInputStream leitor = new ObjectInputStream(new FileInputStream(arquivo));

            Pessoa objeto = (Pessoa) leitor.readObject();
            System.out.println("Objeto " + objeto.nome + " lido com sucesso de " + arquivo.getName() + "!");
            return objeto;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Ocorreu um erro ao ler do arquivo " + arquivo.getName() + "!");
        }
        return null;
    }

}
