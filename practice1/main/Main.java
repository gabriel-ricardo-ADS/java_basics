package practice1; // 1. O pacote vem sempre na primeira linha

// 2. O import vem logo abaixo do pacote
import practice1.entities.Playground;

// 3. A classe começa aqui
public class Main {

    // 4. O metodo principal (entry point)
    public static void main(String[] args) {

        // Instanciando o objeto
        Playground pessoa = new Playground();

        // Atribuindo valores
        pessoa.setNome("Daniel Silva");
        pessoa.setCpf("123.456.789-00");
        pessoa.setIdade(30);
        pessoa.setAltura(1.82);

        // Saída de dados
        System.out.println("=========================");
        System.out.println("      RELATÓRIO          ");
        System.out.println("=========================");

        System.out.println("Nome:     " + pessoa.getNome());
        System.out.println("CPF:      " + pessoa.getCpf());
        System.out.println("Idade:    " + pessoa.getIdade() + " anos");
        System.out.println("Altura:   " + pessoa.getAltura() + "m");

        System.out.println("=======================================");
    }
} // 5. Fecha a classe Main
