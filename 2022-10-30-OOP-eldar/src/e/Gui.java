package e;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Gui {

	public static void main(String[] args) {

		// main window
		JFrame fr = new JFrame("My Application");
		fr.setLayout(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setLocation(100, 100);
		fr.setSize(600, 300);

		// text label
		JLabel lb = new JLabel();
		lb.setLocation(25, 45);
		lb.setSize(300, 25);
		fr.add(lb);
		
		// button
		JButton btAdd = new JButton("Add");
		btAdd.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				lb.setText("" + Math.random());

			}
		});

		btAdd.setLocation(25, 25);
		btAdd.setSize(100, 25);
		fr.add(btAdd);
		

		fr.setVisible(true);
	}

}
