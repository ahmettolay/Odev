package bankApp;

public class UserManager {

	public void otomatikEmailOluştur(User user) {

		System.out.println(user.getEmail());

	}

	public void bilgileriGoster(User user) {
System.out.println("İsim : "+user.getName()+
		" Soyad : "+user.getSureName()+
		" Hesap NO: "+ user.getAccount().getHesapNo()+
		" Email : "+user.getEmail()+
		" Hesap Bakiyeniz : "+user.getAccount().getBakiye()+
		" Kalan Kredi Borcu : "+user.getAccount().getIstenenKredi());
		
	}

	public void krediBasvurusundaBulun(Account account, int para) {

		account.setKrediBaşvursu(true);
		account.setIstenenKredi(para);
		System.out.println(account.getIstenenKredi() + " TL kredi başvursundan bulundunuz.\nLütfen onay bekleyiniz.");
	}

	public void krediBorcuOdeme(Account account, double taksit) {

		if (account.getKrediBaşvursu() == false) {
			System.out.println("Kredi Borcunuz Yoktur...");
		} else {
			
			account.setIstenenKredi(account.getIstenenKredi() - taksit);

			System.out.println(taksit+ "TL kadar borcunuzu ödediniz, Güncel Kredi kartı Borcunuz : "+ account.getIstenenKredi());
			
		}

	}
}
