import java.util.Scanner;

public class Dia {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite um número: ");
        int diaSemana = entrada.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
                case 2:
                System.out.println("Segunda");
                break;
                case 3:
                System.out.println("Terça");
                break;
                case 4:
                System.out.println("Quarta-feira");
                break;
                case 5:
                System.out.println("Quinta-feira");
                break;
                case 6:
                System.out.println("Sexta-feira");
                break;
                case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Inválido, entre 1 e 7!");
        }
        entrada.close();
    }
}