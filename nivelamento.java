import java.util.Scanner;

public class nivelamento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double valor, porc, perc, acrec, desc;

        System.out.print("Digite um valor: ");
        valor = entrada.nextDouble();

        System.out.print("Digite o valor percentual: ");
        porc = entrada.nextDouble();

        perc = valor * porc / 100;

        acrec = valor + perc;
        desc = valor - perc;

        System.out.println("Percentual: " + perc);
        System.out.println("Acréscimo: " + acrec);
        System.out.println("Desconto: " + desc);

        entrada.close();
    }
}
