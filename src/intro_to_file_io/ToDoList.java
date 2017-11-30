package intro_to_file_io;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ToDoList implements ActionListener {

	public static void main(String[] args) {
		ToDoList TDL = new ToDoList();
		TDL.set();
	}

	JFrame f;
	JPanel p;
	JButton add;
	JButton remove;
	JButton save;
	JButton load;

	// FileWriter fw;

	ArrayList<String> list = new ArrayList<String>();

	void set() {
		f = new JFrame();
		p = new JPanel();
		add = new JButton();
		remove = new JButton();
		save = new JButton();
		load = new JButton();
		f.add(p);
		p.add(add);
		p.add(remove);
		p.add(save);
		p.add(load);
		f.setSize(200, 200);
		f.setVisible(true);
		add.setText("add");
		remove.setText("remove");
		save.setText("save");
		load.setText("load");
		add.addActionListener(this);
		remove.addActionListener(this);
		save.addActionListener(this);
		load.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (e.getSource() == add) {
			String task = JOptionPane.showInputDialog("Add a task to the list.");
			list.add(task + "\n");

		} else if (e.getSource() == remove) {
			String showlist = "";
			for (int k = 0; k < list.size(); k++) {
				showlist += "\n" + k + ". " + list.get(k);
			}
			String remove = JOptionPane
					.showInputDialog("Input the number of the task you would like to remove." + showlist);
			int Remove = Integer.parseInt(remove);
			list.remove(Remove);
			// System.out.println(list);
		} else if (e.getSource() == save) {
			try {
				FileWriter fw = new FileWriter("ToDoList.txt");
				for (int i = 0; i < list.size(); i++) {
					fw.write(list.get(i));
				}
				fw.close();
			} catch (IOException f) {
				// TODO Auto-generated catch block
				f.printStackTrace();
			}

		} else if (e.getSource() == load) {
			list.clear();
			try {
				BufferedReader br = new BufferedReader(new FileReader("ToDoList.txt"));

				String read = br.readLine();
				while (read != null) {
					list.add(read);
					read = br.readLine();
				}
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}

	}
}
