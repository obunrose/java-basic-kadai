package Car_Chapter15.java;

public class Car_Chapter15 {
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 10; //ギアチェンジ後の速度を表す

	//	ギアの値により速度を変える
	public void gearChange(int afterGear) {
		gear = afterGear;
	}

	//	ギアチェンジ後の速度を表示する
	public void run() {
		if (gear == 2) {
			speed = 20;
		} else if (gear == 3) {
			speed = 30;
		} else if (gear == 4) {
			speed = 40;
		} else if (gear == 5) {
			speed = 50;
		} else {
			speed = 10;
		}
		System.out.println(speed);
	}
}
