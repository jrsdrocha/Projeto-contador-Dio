import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O Primeiro numero inserido deverá ser maior que o primeiro");
        } finally {
            System.out.println("Obrigado por usar nosso programa!");
        }

    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm >= parametroDois){
            throw new ParametrosInvalidosException("O primeiro numero deverá ser maior que o segundo numero inserido");
        } else {
            System.out.println("Validando...");
            int contagem = parametroDois - parametroUm;
            for (int i = 0; i < contagem; i++){
                System.out.printf("Imprimindo o numero: " + i + " ");
                System.out.println(" ");
            }
        }

    }
}
