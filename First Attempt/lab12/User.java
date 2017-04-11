import java.io.Serializable;
import java.util.Random;


public class User implements Serializable{

	int userNumber;
	int balance;
	
	public User(int userNumber) {
		Random r = new Random();
		this.userNumber = userNumber;
		this.balance = r.nextInt()*25000;
	}

}
