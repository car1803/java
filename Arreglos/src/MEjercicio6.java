//crear una matriz y transponerla
import java.util.Scanner;
public class MEjercicio6 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[][] matriz1 = new int[5][9];
		int[][] matriz2 = new int[9][5];

		System.out.println("llenado de numeros");
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				matriz1[i][j]=entrada.nextInt();
			}
		}
		//imprimir matriz
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(matriz1[i][j]+" ");
			}
			System.out.println();
		}

		//transponerla
		for(int i=0;i<5;i++) {
			for(int j=0;j<9;j++) {
				matriz2[j][i]=matriz1[i][j];
			}
		}
		System.out.println("matrix transpuesta");
		for(int i=0;i<9;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matriz2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
