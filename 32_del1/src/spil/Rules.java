package spil;

public class Rules {
	
	/** tjekker om der er slået to ens */
	public static boolean evalEqual(DiceCup cup) {
		return cup.getD1() == cup.getD2();
	}
	
	/** tjekker om der er slået to 1'ere */
	public static boolean evalTwoOnes(DiceCup cup) {
		return cup.getD1() == 1 && cup.getD2() == 1;
	}
	
	/** tjekker om der er slået to 6'ere to gange i træk*/
	public static boolean evalTwoSixesInRow(DiceCup cup) {
		return cup.getD1() == 6 && cup.getD2() == 6 && cup.getLastD1() == 6 && cup.getLastD2() == 6;
	}

	/** tjekker om spilleren har 40 point */
	public static boolean evalFourty(Player player) {
		return player.getPoints() >= 40;
	}
}
