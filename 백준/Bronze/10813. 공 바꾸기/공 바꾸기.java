import java.util.Scanner;
//no10813
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt(); int M = scanner.nextInt();
		int basket[] = new int[N];
		for (int i=0; i<N; i++)
			basket[i]=i+1;
		
		int i, j, k;
		
		for (int l=0; l<M; l++) {
			i = scanner.nextInt(); j = scanner.nextInt();
			k=basket[i-1]; basket[i-1]=basket[j-1]; basket[j-1]=k;
		}
		
		for (int idx=0; idx<N; idx++)
			System.out.printf("%d ", basket[idx]);
	}
}