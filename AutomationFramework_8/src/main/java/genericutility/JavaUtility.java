package genericutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author abhijith
 */
public class JavaUtility {
	/**
	 * This method is used to generate system date and time
	 * @return String
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * This method generates random numbers within 1000
	 * @return int
	 */
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}
}
