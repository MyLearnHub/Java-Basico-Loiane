import java.util.Scanner;

public class Exer35 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int[] vetorA = new int[10];
        
        for (int i=0; i<vetorA.length; i++){
            System.out.println("Entre com o valor da posição A - " + i + ":");
            vetorA[i] = scan.nextInt();
        }

        for (int k : vetorA) {
            System.out.println("Analizando o número " + k);

            for (int j = 1; j < k; j++) {
                if (k % j == 0) {
                    System.out.println(j + " é divisor");
                }
            }

            System.out.println();
        }
    }    
}
