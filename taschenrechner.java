
public class taschenrechner {

	public static void main(String[] args) {

		int zahl1 = Integer.parseInt(args[0]);
		int zahl2 = Integer.parseInt(args[2]);
		
		if(args[2].equals("+")("*")("/")("-")) ) {
			
		}
		else {
			System.out.println("diese Zeichen ist falsche Zeichen");
		}
		
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		if (args[1].equals("+")) {
			int addieren = zahl1 + zahl2;
			System.out.println("Ergebnis: " +  addieren);
		}
		if (args[1].equals("-")) {
			int subtrahieren = zahl1 - zahl2;
			System.out.println("Ergebnis: " +  subtrahieren);
		}
		if (args[1].equals("*")) {
			int multiplizieren = zahl1 * zahl2;
			System.out.println("Ergebnis: " +  multiplizieren);
		}
		if (args[1].equals("/")) {
			int dividieren = zahl1 / zahl2;
			System.out.println("Ergebnis: " +  dividieren);
		}
		
	}

}
