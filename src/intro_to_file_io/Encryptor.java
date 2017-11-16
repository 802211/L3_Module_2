package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encryptor {

	public static void main(String[] args) {
		String message = JOptionPane.showInputDialog("Insert a message");
		try {
			FileWriter fw = new FileWriter("Encryptor.txt");

			String blank = "";
			for (int i = 0; i != message.length(); i++) {
				blank += (char) (message.charAt(i) * 2);
			}

			fw.write(blank);

			fw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
