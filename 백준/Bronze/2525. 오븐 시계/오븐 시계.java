import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt(); int B = scanner.nextInt();
		int C = scanner.nextInt();
		int bc = (B+C)/60;
		if (bc==0)
			System.out.println(A+" "+(B+C)%60);
		else if ((A+bc)>=24)
			System.out.println(A+bc-24+" "+((B+C)%60));
		else
			System.out.println(A+bc+" "+((B+C)%60));
	}
}