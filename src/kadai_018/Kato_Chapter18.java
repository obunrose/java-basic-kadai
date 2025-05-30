package kadai_018;

abstract class Kato_Chapter18 {

	public String familyName;
	public String givenName;
	public String address;

	//共通の紹介を出力する
	public void commonIntroduce() {
		address = "東京都中野区〇×";
		System.out.println("住所は" + address + "です");
	}

	//個別の紹介を出力する
	public abstract void eachIntroduce();

	//紹介を実行する
	public void execIntroduce() {
		System.out.println("名前は加藤" + givenName + "です");
	}
}
