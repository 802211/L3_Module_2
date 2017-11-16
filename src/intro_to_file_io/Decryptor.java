package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Decryptor {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("Encryptor.txt"));

			String read = br.readLine();
			String blank = "";
			String decrypted = "";
			while (read != null) {
				blank += read;
				read = br.readLine();
			}

			br.close();

			for (int i = 0; i < blank.length(); i++) {
				decrypted += (char) (blank.charAt(i) / 2);
			}
			System.out.println(decrypted);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
