import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String ab;
		StringTokenizer st;
		int a, b;
		int T = Integer.parseInt(bf.readLine());
		
		for(int i=0;i<T;i++) {
			ab = bf.readLine();
			st = new StringTokenizer(ab);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			bw.write(a+b+"\n");
		}
		bw.flush();
		bw.close();
	}
}