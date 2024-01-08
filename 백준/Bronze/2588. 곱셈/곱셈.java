import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); String b = scanner.next();
		for(int i=b.length()-1; i>=0; i--)
			System.out.println(a*Character.getNumericValue(b.charAt(i)));
		System.out.println(a*Integer.parseInt(b));
	}
}