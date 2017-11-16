package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;

public class Copyright {

	public static void main(String[] args) {
		
		JFileChooser jfc = new JFileChooser();
		int returnValue = jfc.showOpenDialog(null);
		if (returnValue == JFileChooser.APPROVE_OPTION) {
			String fileName = jfc.getSelectedFile().getAbsolutePath();
			System.out.println(fileName);
			try {
				FileWriter fw = new FileWriter(fileName, true);
				fw.write("//Copyright © 2017 by Chloe :)");
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
		
		
	}
	
}
