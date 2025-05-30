package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

	HashMap<String, String> words = new HashMap<String, String>();

	public void put() {
		words.put("apple", "りんご");
		words.put("peach", "桃");
		words.put("banana", "バナナ");
		words.put("lemon", "レモン");
		words.put("pear", "梨");
		words.put("kiwi", "キウィ");
		words.put("strawberry", "いちご");
		words.put("grape", "ぶどう");
		words.put("muscat", "マスカット");
		words.put("cherry", "さくらんぼ");
	}

	public void search(String[] string) {
		put();
		for (String str : string) {
			if (words.containsKey(str)) {
				System.out.println(str + "の意味は" + words.get(str));
			} else {
				System.out.println(str + "は辞書に存在しません");
			}
		}
	}
}
