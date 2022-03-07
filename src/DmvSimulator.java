
import java.util.Random;
public class DmvSimulator {
	public static void main(String []args) {
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		Boolean call = false; 
		int numb = 1;
		System.out.println("welcome to the DMV!");
		System.out.println("you are number " + randomNumber + " please wait until your number is called");
		while (call == false) {
			
			if (randomNumber == numb) {
				System.out.println(randomNumber);
				System.out.println("you dont have the required paperwork");
				call = true;
			}
			else {
				System.out.println(numb);
				numb += 1;
			}
		}
	}
}
