package bankApp;

import java.util.Random;

public class Account {
	
	
	private String hesapNo;
	private double istenenKredi;
	private boolean krediBaşvursu;
	private double bakiye;

	
	
	
	public Account() {
	
		int randomSayi = (int) (Math.random()*1000);
		String stringRandomSayi = String.valueOf(randomSayi);
		this.hesapNo= stringRandomSayi;
		this.bakiye=0;
	}


	
	
	

	@Override
	public String toString() {
		return "Account [hesapNo=" + hesapNo + ", istenenKredi=" + istenenKredi + ", krediBaşvursu=" + krediBaşvursu
				+ "]";
	}






	public String getHesapNo() {
		return hesapNo;
	}






	public void setHesapNo(String hesapNo) {
		this.hesapNo = hesapNo;
	}






	public double getIstenenKredi() {
		return istenenKredi;
	}






	public void setIstenenKredi(double istenenKredi) {
		this.istenenKredi = istenenKredi;
	}






	public boolean getKrediBaşvursu() {
		return krediBaşvursu;
	}






	public void setKrediBaşvursu(boolean krediBaşvursu) {
		this.krediBaşvursu = krediBaşvursu;
	}






	public double getBakiye() {
		return bakiye;
	}






	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}










	


}
