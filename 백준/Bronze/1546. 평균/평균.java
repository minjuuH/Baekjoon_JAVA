import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		double score[] = new double[N];
		double max=0;
		for(int i=0; i<N; i++) {
			score[i] = scanner.nextDouble();
			if(max<score[i])
				max=score[i];
		}
		
		double total=0;
		for(int i=0; i<N; i++) {
			total+=(score[i]/max)*100;
		}
		System.out.println(total/N);
	}
}