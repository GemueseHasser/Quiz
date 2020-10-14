package de.jonas.quiz;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Auswertung {

	public Auswertung() {
		JFrame frame = new JFrame("Auswertung");
		frame.setBounds(0, 0, 500, 750);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel label = new JLabel("<html><a style=\"font-size: 30px;text-decoration: underline;font-weight: bold\">Auswertung:</a></html>", JLabel.CENTER);
		label.setBounds(0, 0, 500, 50);
		
		JLabel Eins = new JLabel();
		Eins.setFont(new Font("Arial", Font.BOLD, 20));
		Eins.setBounds(0, 51, 500, 30);
		
		JLabel Zwei = new JLabel();
		Zwei.setFont(new Font("Arial", Font.BOLD, 20));
		Zwei.setBounds(0, 81, 500, 30);
		
		JLabel Drei = new JLabel();
		Drei.setFont(new Font("Arial", Font.BOLD, 20));
		Drei.setBounds(0, 111, 500, 30);
		
		JLabel Vier = new JLabel();
		Vier.setFont(new Font("Arial", Font.BOLD, 20));
		Vier.setBounds(0, 141, 500, 30);
		
		JLabel Fuenf = new JLabel();
		Fuenf.setFont(new Font("Arial", Font.BOLD, 20));
		Fuenf.setBounds(0, 171, 500, 30);
		
		JLabel Sechs = new JLabel();
		Sechs.setFont(new Font("Arial", Font.BOLD, 20));
		Sechs.setBounds(0, 201, 500, 30);
		
		JLabel Sieben = new JLabel();
		Sieben.setFont(new Font("Arial", Font.BOLD, 20));
		Sieben.setBounds(0, 231, 500, 30);
		
		JLabel Acht = new JLabel();
		Acht.setFont(new Font("Arial", Font.BOLD, 20));
		Acht.setBounds(0, 261, 500, 30);
		
		JLabel Neun = new JLabel();
		Neun.setFont(new Font("Arial", Font.BOLD, 20));
		Neun.setBounds(0, 291, 500, 30);
		
		JLabel Zehn = new JLabel();
		Zehn.setFont(new Font("Arial", Font.BOLD, 20));
		Zehn.setBounds(0, 321, 500, 30);
		
		JLabel Elf = new JLabel();
		Elf.setFont(new Font("Arial", Font.BOLD, 20));
		Elf.setBounds(0, 351, 500, 30);
		
		JLabel Zwoelf = new JLabel();
		Zwoelf.setFont(new Font("Arial", Font.BOLD, 20));
		Zwoelf.setBounds(0, 381, 500, 30);
		
		JLabel Dreizehn = new JLabel();
		Dreizehn.setFont(new Font("Arial", Font.BOLD, 20));
		Dreizehn.setBounds(0, 411, 500, 30);
		
		JLabel Vierzehn = new JLabel();
		Vierzehn.setFont(new Font("Arial", Font.BOLD, 20));
		Vierzehn.setBounds(0, 441, 500, 30);
		
		JLabel Fuenfzehn = new JLabel();
		Fuenfzehn.setFont(new Font("Arial", Font.BOLD, 20));
		Fuenfzehn.setBounds(0, 471, 500, 30);
		
		JLabel Sechzehn = new JLabel();
		Sechzehn.setFont(new Font("Arial", Font.BOLD, 20));
		Sechzehn.setBounds(0, 501, 500, 30);
		
		JLabel Siebzehn = new JLabel();
		Siebzehn.setFont(new Font("Arial", Font.BOLD, 20));
		Siebzehn.setBounds(0, 531, 500, 30);
		
		JLabel Achtzehn = new JLabel();
		Achtzehn.setFont(new Font("Arial", Font.BOLD, 20));
		Achtzehn.setBounds(0, 561, 500, 30);
		
		JLabel Neunzehn = new JLabel();
		Neunzehn.setFont(new Font("Arial", Font.BOLD, 20));
		Neunzehn.setBounds(0, 591, 500, 30);
		
		JLabel Zwanzig = new JLabel();
		Zwanzig.setFont(new Font("Arial", Font.BOLD, 20));
		Zwanzig.setBounds(0, 621, 500, 30);
		
		if(Var.AEinsBool == true) {
			Eins.setText("<html> Frage 1:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅ </html>");
		} else {
			Eins.setText("<html> Frage 1:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.AZweiBool == true) {
			Zwei.setText("<html> Frage 2:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Zwei.setText("<html> Frage 2:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.ADreiBool == true) {
			Drei.setText("<html> Frage 3:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Drei.setText("<html> Frage 3:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.AVierBool == true) {
			Vier.setText("<html> Frage 4:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Vier.setText("<html> Frage 4:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.AFuenfBool == true) {
			Fuenf.setText("<html> Frage 5:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Fuenf.setText("<html> Frage 5:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.ASechsBool == true) {
			Sechs.setText("<html> Frage 6:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Sechs.setText("<html> Frage 6:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.ASiebenBool == true) {
			Sieben.setText("<html> Frage 7:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Sieben.setText("<html> Frage 7:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.AAchtBool == true) {
			Acht.setText("<html> Frage 8:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Acht.setText("<html> Frage 8:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.ANeunBool == true) {
			Neun.setText("<html> Frage 9:<a style=\"color: green;\">&nbsp&nbsp&nbsp✅</html>");
		} else {
			Neun.setText("<html> Frage 9:<a style=\"color: red;\">&nbsp&nbsp&nbsp❌</html>");
		}
		
		if(Var.AZehnBool == true) {
			Zehn.setText("<html> Frage 10:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Zehn.setText("<html> Frage 10:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.AElfBool == true) {
			Elf.setText("<html> Frage 11:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Elf.setText("<html> Frage 11:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.AZwoelfBool == true) {
			Zwoelf.setText("<html> Frage 12:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Zwoelf.setText("<html> Frage 12:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.ADreizehnBool == true) {
			Dreizehn.setText("<html> Frage 13:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Dreizehn.setText("<html> Frage 13:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.AVierzehnBool == true) {
			Vierzehn.setText("<html> Frage 14:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Vierzehn.setText("<html> Frage 14:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.AFuenfzehnBool == true) {
			Fuenfzehn.setText("<html> Frage 15:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Fuenfzehn.setText("<html> Frage 15:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.ASechzehnBool == true) {
			Sechzehn.setText("<html> Frage 16:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Sechzehn.setText("<html> Frage 16:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.ASiebzehnBool == true) {
			Siebzehn.setText("<html> Frage 17:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Siebzehn.setText("<html> Frage 17:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.AAchtzehnBool == true) {
			Achtzehn.setText("<html> Frage 18:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Achtzehn.setText("<html> Frage 18:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.ANeunzehnBool == true) {
			Neunzehn.setText("<html> Frage 19:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Neunzehn.setText("<html> Frage 19:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		if(Var.AZwanzigBool == true) {
			Zwanzig.setText("<html> Frage 20:<a style=\"color: green;\">&nbsp✅</html>");
		} else {
			Zwanzig.setText("<html> Frage 20:<a style=\"color: red;\">&nbsp❌</html>");
		}
		
		JLabel Prozent = new JLabel("<html>" + Var.ProzentZahlFuerEineFrage * Var.RichtigeFragen + "% der Fragen sind richtig! (" + Var.RichtigeFragen + "/20)</html>");
		Prozent.setFont(new Font("Arial", Font.BOLD, 25));
		Prozent.setBounds(0, 650, 500, 50);
		
		frame.add(label);
		frame.add(Eins);
		frame.add(Zwei);
		frame.add(Drei);
		frame.add(Vier);
		frame.add(Fuenf);
		frame.add(Sechs);
		frame.add(Sieben);
		frame.add(Acht);
		frame.add(Neun);
		frame.add(Zehn);
		frame.add(Elf);
		frame.add(Zwoelf);
		frame.add(Dreizehn);
		frame.add(Vierzehn);
		frame.add(Fuenfzehn);
		frame.add(Sechzehn);
		frame.add(Siebzehn);
		frame.add(Achtzehn);
		frame.add(Neunzehn);
		frame.add(Zwanzig);
		frame.add(Prozent);
		frame.setVisible(true);
	}

}
