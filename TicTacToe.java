
public class TicTacToe {

	public static void main(String[] args) {

		String[][] Spielfeld = new String[3][3];

		Spielfeld[0][0] = "x";
		Spielfeld[1][1] = "x";
		Spielfeld[2][2] = "x";
		if (istWinner("x", Spielfeld)) {
			System.out.println("Spieler x hat gewonnen!");
		}

	}

	public static boolean istWinner(String zeichen, String[][] Spielfeld) {
		int punkte = 0;
		for (int diagonale = 0; diagonale < Spielfeld[0].length; diagonale++) {
			if (Spielfeld[diagonale][diagonale].equals(zeichen)) {
				punkte++;
			}
		}
		
		for (int waagrecht = 0; waagrecht < Spielfeld[0].length; waagrecht++) {
			if (Spielfeld[waagrecht][waagrecht].equals(zeichen)) {
				punkte++;
			}
		}
		
		for (int senkrecht = 0; senkrecht < Spielfeld[0].length; senkrecht++) {
			if (Spielfeld[senkrecht][senkrecht].equals(zeichen)) {
				punkte++;
			}
		}
		
		if(Spielfeld[0][0] == "x" && Spielfeld[0][1] == "x" && Spielfeld[0][2] == "x" ) {
			System.out.println("gewonnen");
		}
		if(Spielfeld[1][0] == "x" && Spielfeld[1][1] == "x" && Spielfeld[1][2] == "x" ) {
			System.out.println("gewonnen");
		}
		if(Spielfeld[0][0] == "x" && Spielfeld[0][1] == "x" && Spielfeld[0][2] == "x" ) {
			System.out.println("gewonnen");
		}
		if(Spielfeld[0][0] == "x" && Spielfeld[0][1] == "x" && Spielfeld[0][2] == "x" ) {
			System.out.println("gewonnen");
		}
		if(Spielfeld[0][0] == "x" && Spielfeld[0][1] == "x" && Spielfeld[0][2] == "x" ) {
			System.out.println("gewonnen");
		}
		if(Spielfeld[0][0] == "x" && Spielfeld[0][1] == "x" && Spielfeld[0][2] == "x" ) {
			System.out.println("gewonnen");
		}
		if(Spielfeld[0][0] == "x" && Spielfeld[0][1] == "x" && Spielfeld[0][2] == "x" ) {
			System.out.println("gewonnen");
		}
		if(Spielfeld[0][0] == "x" && Spielfeld[0][1] == "x" && Spielfeld[0][2] == "x" ) {
			System.out.println("gewonnen");
		}
		
		System.out.println(punkte);
		return true;
	}

}
