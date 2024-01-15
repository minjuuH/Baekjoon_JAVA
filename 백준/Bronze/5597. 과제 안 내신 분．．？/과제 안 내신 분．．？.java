import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<String> num = new ArrayList<>();
		for(int i=0; i<30; i++)
			num.add(Integer.toString(i+1));
		
		for(int i=0; i<28; i++)
			num.remove(scanner.nextLine());
		
		for(int i=0; i<num.size(); i++)
			System.out.println(num.get(i));
	}
}