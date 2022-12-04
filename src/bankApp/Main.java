package bankApp;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Account account1 = new Account();

		AccountManager accountManager = new AccountManager();
		User user1 = new User("Ahmet", "Tolay", account1);

		UserManager userManager = new UserManager();
		AdminManager adminManager = new AdminManager();

		accountManager.paraYatir(account1, 500);
		accountManager.paraYatir(account1, 2000);
		accountManager.paraCek(account1, 1000);
		accountManager.hesapBilgileriniGöster(account1);

		userManager.otomatikEmailOluştur(user1);
		userManager.bilgileriGoster(user1);
		userManager.krediBasvurusundaBulun(account1, 10000);
		adminManager.krediBasvurusunuOnayla(account1);
		
		
		
		accountManager.hesapBilgileriniGöster(account1);
	
		
		userManager.krediBorcuOdeme(account1, 1000);
		userManager.krediBorcuOdeme(account1, 1000);
		userManager.krediBorcuOdeme(account1, 1000);
		userManager.krediBorcuOdeme(account1, 1000);
		
		
		
		userManager.bilgileriGoster(user1);
		
	}

}
