/*  +__^_________,_________,_____,________^-.-------------------,
 *  | |||||||||   `--------'     |          |                   O
 *  `+-------------USMC----------^----------|___________________|
 *    `\_,---------,---------,--------------'
 *      / X MK X /'|       /'
 *     / X MK X /  `\    /'
 *    / X MK X /`-------'
 *   / X MK X /
 *  / X MK X /
 * (________(                @author m.c.kunkel
 *  `------'
*/
package domain;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class Main extends JFrame {
	public Main() {
		setSize(200, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLayeredPane lp = getLayeredPane();
		JButton top = new JButton();
		top.setBackground(Color.white);
		top.setBounds(20, 20, 50, 50);
		JButton middle = new JButton();
		middle.setBackground(Color.gray);
		middle.setBounds(40, 40, 50, 50);
		JButton bottom = new JButton();
		bottom.setBackground(Color.black);
		bottom.setBounds(60, 60, 50, 50);
		top.addActionListener(e -> {
			System.out.println("Top Button clicked");
		});
		middle.addActionListener(e -> {
			System.out.println("Middle Button clicked");
		});
		bottom.addActionListener(e -> {
			System.out.println("Bottom Button clicked");
		});
		lp.add(middle, new Integer(2));
		lp.add(top, new Integer(3));
		lp.add(bottom, new Integer(1));

		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();

	}
}
