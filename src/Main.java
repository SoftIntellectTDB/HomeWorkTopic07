import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		/*
		 * Напишете програма, която обхожда предварително създаден двумерен
		 * масив от числа и извежда на екрана само четните.
		 */
		int d[][] = { { 1, 2, 3, 3 }, { 4, 5, 6, 7 }, { 8, 9, 0, 1 } };
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				if (d[i][j] % 2 == 0) {
					System.out.println(d[i][j]);
				}
			}
		}

		/*
		 * Напишете програма, която позволява на потребителя да попълва масив с
		 * размери 3х4. Изведете масива на екрана.
		 */
		int e[][] = new int[3][4];
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				e[i][j] = in.nextInt();
			}
		}
		System.out.println();
		for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				System.out.print(e[i][j] + "\t");
			}
			System.out.println();
		}

		/*
		 * Напишете програма, която приема от конзолата 2 числа a и b (b > a) и
		 * изкарва на екрана всички числа от a до b, които се делят на 3 без
		 * остатък.
		 */
		int a = in.nextInt();
		int b = in.nextInt();
		for (int i = a; i <= b; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}

		/*
		 * Напишете програма, която принтира на екрана числата от 30 до 1 в
		 * обратен ред, подредени в 5 реда и 6 колони.
		 */
		for (int j = 0, k = 30; j < 5; j++) {
			for (int i = 0; i < 6; i++, k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}

		/*
		 * Напишете програма, която пълни двумерен масив с размер NxN, и след
		 * това намерете сумата по главния диагонал.
		 */
		int N = in.nextInt();
		int f[][] = new int[N][N];
		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N; i++) {
				f[i][j] = (int) (1 + Math.random() * 10.0);
			}
		}
		int sum = 0;
		for (int i = 0; i < N; i++) {
			sum = sum + f[i][i];
		}
		System.out.println(sum);
	}
}
