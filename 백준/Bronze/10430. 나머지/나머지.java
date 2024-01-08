import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt(); int B = scanner.nextInt(); int C = scanner.nextInt();
		System.out.println((A+B)%C+"\n"+((A%C)+(B%C))%C+"\n"+(A*B)%C+"\n"+((A%C)*(B%C))%C);
	}
}