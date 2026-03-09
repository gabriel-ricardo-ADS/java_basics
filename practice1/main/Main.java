package practice1.main;

import java.util.Scanner; // Importa a ferramenta de leitura de teclado
import practice1.entities.Playground;

public class Main {

    public static void main(String[] args) {
        // Criamos o objeto Scanner para ler a entrada (System.in)
        Scanner sc = new Scanner(System.in);

        // Criamos o objeto da sua entidade (o pote onde guardaremos os dados)
        Playground pessoa = new Playground();

        System.out.println("--- Cadastro de Usuário ---");

        // Lendo o Nome (String)
        System.out.print("Digite o seu nome completo: ");
        String nomeDigitado = sc.nextLine();
        pessoa.setNome(nomeDigitado);

        // Lendo o CPF (String)
        System.out.print("Digite o seu CPF: ");
        String cpfDigitado = sc.nextLine();
        pessoa.setCpf(cpfDigitado);

        // Lendo a Idade (int)
        System.out.print("Digite a sua idade: ");
        int idadeDigitada = sc.nextInt();
        pessoa.setIdade(idadeDigitada);

        // Lendo a Altura (double)
        System.out.print("Digite a sua altura (ex: 1.75): ");
        double alturaDigitada = sc.nextDouble();
        pessoa.setAltura(alturaDigitada);

        // Exibindo os dados que foram armazenados no objeto
        System.out.println("\n--- Dados Armazenados com Sucesso! ---");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Idade: " + pessoa.getIdade() + " anos");
        System.out.println("Altura: " + pessoa.getAltura() + "m");

        // Fechar o scanner é uma boa prática de gestão de memória
        sc.close();
    }
}