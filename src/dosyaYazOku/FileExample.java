package dosyaYazOku;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {

	public static void dosyaYarat(File file) {

		try {
			if (file.exists()) {// exists = var,mevcut
				System.out.println("Dosya zaten var");
			} else if (!file.createNewFile()) {
				System.out.println("Dosya oluştururken hata oluştu.");
			} else {
				System.out.println("Dosya oluşturuldu.");
			}

		} catch (Exception ex) {
			System.out.println("Dosya oluşturulamadı.");
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	public static void dosyaYaz(File file) {

		try {

			if (file.exists())// exists= var, mevcut
			{
				FileWriter fileWriter = new FileWriter(file);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write("Ödev yapıldı...");
				bufferedWriter.close();
				System.out.println("Dosyaya yazıldı...");

			}
		} catch (Exception ex) {

			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

	public static void dosyaOku(File file) {

		if (file.exists())// exists = bar , mevcut
		{

			try {
				FileReader fileReader = new FileReader(file);
				String line;
				BufferedReader bufferedReader = new BufferedReader(fileReader);
				while ((line=bufferedReader.readLine())!=null) {
					
					System.out.println(line);
				}
			} catch (Exception ex) {

				System.out.println(ex.getMessage());
				ex.printStackTrace();
			}

		}

	}
}
