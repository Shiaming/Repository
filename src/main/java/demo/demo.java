 package demo;

import java.util.Random;

/**
 * @author Shi
 *
 */
public class demo {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 1000000);
		//删除了1
		//删除了2
		//删除了3
		//删除了4 
		//删除了4
		//删除了5
		//删除了6
		System.out.println(num);
		System.out.println(num);
		

		for (int i = 0; i < 1000; i++) {
			int nextInt = new Random().nextInt(1000000);
			if ((nextInt + "").length() == 6) {

				System.out.println("鍏綅闅忔満鏁�: " + nextInt);
			}

		}
	
	}

}
