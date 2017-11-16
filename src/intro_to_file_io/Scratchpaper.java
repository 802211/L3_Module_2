package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Scratchpaper {

	public static void main(String[] args) {

		try {
			FileWriter fw = new FileWriter("test.txt");
			fw.write("Some stuff.");
			fw.close();

			FileReader fr = new FileReader("test.txt");
			int c = fr.read();
			// System.out.println((char) c);
			// c = fr.read();
			// System.out.println((char) c);
			while (c != -1) {
				System.out.print((char) c);
				c = fr.read();
			}

			BufferedReader br = new BufferedReader(new FileReader("test.txt"));
			String d;
			while (c != -1) {
				System.out.print((char) c);
				c = br.read();
			}

			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
//Copyright © 2017 by Chloe :)