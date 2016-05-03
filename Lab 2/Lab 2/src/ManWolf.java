import java.io.*;

public class ManWolf {
	public static void main(String[] args)
			throws IOException {
		Driver d = new Driver(); // The DFA
		BufferedReader in = // Standard input
				new BufferedReader(new InputStreamReader(System.in));
		// Read and echo lines until EOF
		String s = in.readLine();
		while (s!=null) {
			d.reset();
			d.process(s);
			if (d.isCorrectc()) System.out.println(s);
			s = in.readLine();
		}
	}
}