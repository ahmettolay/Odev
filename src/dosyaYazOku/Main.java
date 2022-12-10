package dosyaYazOku;

import java.io.File;

public class Main {

	public static void main(String[] args) {

		String dosyaYolu = "C:\\JavaTekrar\\Odev\\odev.txt";
		File file = new File(dosyaYolu);

		// ------------------DOSYA OLUŞTUR-------------------//
		FileExample.dosyaYarat(file);

		// ------------------DOSYA OLUŞTUR-------------------//
		FileExample.dosyaYaz(file);
		
		FileExample.dosyaOku(file);
		
	}

}
