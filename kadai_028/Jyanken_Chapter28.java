package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	public String getMyChoice() {
		String result = null;
		try (Scanner moves = new Scanner(System.in)) {
			String move = moves.next();
			if (move.equals("r") || move.equals("s") || move.equals("p")) {
				result = move;
			} else {
				System.out.println("error");
				result = getMyChoice();
			}
		}
		return result;

	}

	public String getRandom() {
		String result = null;
		String[] hands = { "r", "s", "p" };
		result = hands[(int) Math.floor(Math.random() * 3)];
		return result;

	}

	public void playGame() {
		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("r", "グー");
		hashmap.put("s", "チョキ");
		hashmap.put("p", "パー");

		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		String ich = getMyChoice();
		String sie = getRandom();

		System.out.println("自分の手は" + hashmap.get(ich) +
				",対戦相手の手は" + hashmap.get(sie));

		if (ich.equals(sie)) {
			System.out.println("あいこです");
		} else if (ich.equals("r") && sie.equals("s")) {
			System.out.println("自分の勝ちです");
		} else if (ich.equals("r") && sie.equals("p")) {
			System.out.println("自分の負けです");
		} else if (ich.equals("s") && sie.equals("p")) {
			System.out.println("自分の勝ちです");
		} else if (ich.equals("s") && sie.equals("r")) {
			System.out.println("自分の負けです");
		} else if (ich.equals("p") && sie.equals("r")) {
			System.out.println("自分の勝ちです");
		} else if (ich.equals("p") && sie.equals("s")) {
			System.out.println("自分の負けです");
		}

	}

}
