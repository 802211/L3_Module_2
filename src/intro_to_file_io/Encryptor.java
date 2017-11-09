package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Encryptor {
	
public static void main(String[] args) {
	String message = JOptionPane.showInputDialog("Insert a Message");
	try {
		FileWriter fw = new FileWriter("Encryptor.txt");
		fw.write(message);
		fw.close();
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

}
