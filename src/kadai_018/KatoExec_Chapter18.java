package kadai_018;

public class KatoExec_Chapter18 {
	public static void main(String[] args) {
		KatoTaro_Chapter18 taro = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ici = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hana = new KatoHanako_Chapter18();

		taro.setGivenName("太郎");
		ici.setGivenName("一郎");
		hana.setGivenName("花子");

		taro.execIntroduce();
		taro.commonIntroduce();
		taro.eachIntroduce();

		ici.execIntroduce();
		ici.commonIntroduce();
		ici.eachIntroduce();

		hana.execIntroduce();
		hana.commonIntroduce();
		hana.eachIntroduce();

	}

}
