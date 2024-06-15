package EntregasPraticas;

	import java.util.Scanner;

	public class ExerMatrizPratica {

		    public static void main(String[] args) {

		        
		        Scanner sc = new Scanner(System.in);

		        int[][] matriz = new int[3][3];
		        int somaPrincipal = 0;
		        int somaSecundaria = 0;

		        System.out.println("Digite os elementos da matriz 3x3:");

		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print("Elemento [" + i + "][" + j + "]: ");
		                matriz[i][j] = sc.nextInt();
		            }
		        }

		        System.out.println("\nElementos da diagonal principal:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][i] + " ");
		            somaPrincipal += matriz[i][i];
		        }

		        System.out.println("\nElementos da diagonal secundária:");
		        for (int i = 0; i < 3; i++) {
		            System.out.print(matriz[i][2 - i] + " ");
		            somaSecundaria += matriz[i][2 - i];
		        }

		        System.out.println("\nSoma dos elementos da diagonal principal: " + somaPrincipal);
		        System.out.println("Soma dos elementos da diagonal secundária: " + somaSecundaria);

		        sc.close();
		    }
		}