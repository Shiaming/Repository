package demo;

import java.util.Random;

/**
 * @author Shi
 *
 */
public class demo {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 1000000);
		System.out.println(num);

		for (int i = 0; i < 1000; i++) {
			int nextInt = new Random().nextInt(1000000);
			if ((nextInt + "").length() == 6) {

				System.out.println("六位随机数: " + nextInt);
			}

		}
	
	}

}
