import java.util.Scanner;

public class Main {
	//선택 정렬
	static void slection_sort(int list[]) {
		int least, tmp;
		for(int i=0;i<list.length;i++) {
			least = i;
			for(int j=i+1;j<list.length;j++) {
				if(list[j]<list[least])
					least=j;
			}
			tmp=list[i]; list[i]=list[least]; list[least]=tmp;
		}
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int array[] = new int[n];
		for(int i=0; i<n; i++)
			array[i] = scanner.nextInt();
		
		scanner.close();
		slection_sort(array);
		
		for(int i=0; i<n; i++)
			System.out.println(array[i]);
	}
}