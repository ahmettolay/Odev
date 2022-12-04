package bankApp;

public class AdminManager {

	void krediBasvurusunuOnayla(Account account) {
		if (account.getKrediBaşvursu() == true) {
			System.out.println("Başvurunuz onaylanmıştır.");
			account.setBakiye(account.getBakiye() + account.getIstenenKredi());
		} else {
			System.out.println("Kredi Başvurunz Bulunmamaktadır.");
		}

	}

	void krediBasvurusunuReddet(Account account) {
		if (account.getKrediBaşvursu() == true) {
			System.out.println("Başvurunz red  edilmiştir.");
			account.setIstenenKredi(0);

		} else {
			System.out.println("Kredi Başvurunz Bulunmamaktadır.");
		}
	}

}
