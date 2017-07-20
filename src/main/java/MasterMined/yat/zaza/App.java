package MasterMined.yat.zaza;

public class App {

	public static void main(String args[]) {

		MasterMined colors = new MasterMined(new String[] { "BLACK", "RED", "WHITE", "-", "-" });
		String[] givenBlackRedWhite = new String[] { "BLACK", "RED", "WHITE", " ", " " };
		colors.compareCombinaison(givenBlackRedWhite);
	}
}
