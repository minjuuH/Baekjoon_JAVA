import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); int M = scanner.nextInt();
		int basket[] = new int[N];
		int i, j, k, idx;
		
		for (int l=0; l<M; l++) {
			i = scanner.nextInt(); j = scanner.nextInt(); k = scanner.nextInt();
			for(idx=i-1; idx<j; idx++)
				basket[idx] = k;
		}
		
		for (idx=0; idx<N; idx++)
			System.out.printf("%d ", basket[idx]);
	}
}