import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro: ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int num2 = sc.nextInt();
        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int num1,int num2) throws ParametrosInvalidosException {
        if(num1 > num2){
            throw new ParametrosInvalidosException(num1, num2);
        }else{
            int contador = num2 - num1;
            for(int i=1;i<=contador;i++){
                System.out.println("Imprimindo o número " + i);
            }
        }
    }
}
