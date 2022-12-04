package bankApp;

public class AccountManager {

	void paraYatir(Account account, double miktar) {

		if (miktar < 10000) {

			account.setBakiye(account.getIstenenKredi()+account.getBakiye() + miktar);
			System.out.println(miktar+" Yatırdınız "+"Güncel bakiyeniz : "+account.getBakiye());
		} else {
			System.out.println("10000 TL den Fazla Para Yatıramazsınız.");
		}

	}

	void paraCek(Account account, double miktar) {

		if(miktar>account.getBakiye()) {
			System.out.println("Bakiyeniz yetersiz.");
		}else {
			account.setBakiye(account.getBakiye()-miktar);	
				System.out.println(miktar+" TL çektiniz. Güncel Bakiyeniz : "+account.getBakiye());
		}
	}

	void hesapBilgileriniGöster(Account account) {

System.out.println("Hesap NO: "+account.getHesapNo()+"----"+"Mevcut Bakiyeniz : "+account.getBakiye());
	}

}
