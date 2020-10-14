package de.jonas.quiz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI {
	
	static JButton AEins, AZwei, ADrei, AVier, AFuenf, ASechs, ASieben, AAcht, ANeun, AZehn, AElf, AZwoelf, ADreizehn, AVierzehn, AFuenfzehn, ASechzehn, ASiebzehn, AAchtzehn, ANeunzehn, AZwanzig;
	
	private static JFrame RichtigeAntwort() {
		JFrame frame = new JFrame("Richtig :D");
		frame.setBounds(0, 0, 300, 150);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel label = new JLabel("Richtige Antwort!", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 15));
		label.setBounds(0, 0, 300, 50);
		
		JButton weiter = new JButton("Okay");
		weiter.setBounds(45, 70, 200, 30);
		weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
		frame.add(label);
		frame.add(weiter);
		frame.setVisible(true);
		return frame;
	}
	
	private static JFrame FalscheAntwort() {
		JFrame frame = new JFrame("Falsch :(");
		frame.setBounds(0, 0, 300, 150);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel label = new JLabel("Falsche Antwort!", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 15));
		label.setBounds(0, 0, 300, 50);
		
		JButton weiter = new JButton("Okay");
		weiter.setBounds(45, 70, 200, 30);
		weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
		frame.add(label);
		frame.add(weiter);
		frame.setVisible(true);
		return frame;
	}
	
	private static JFrame Finish() {
		JFrame frame = new JFrame("Nochmal? xD");
		frame.setBounds(0, 0, 300, 150);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel label = new JLabel("<html>Du hast doch schon ;) <br><br> Drücke auf Weiter</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 13));
		label.setBounds(0, 10, 300, 40);
		
		JButton weiter = new JButton("Okay");
		weiter.setBounds(45, 70, 200, 30);
		weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
		frame.add(label);
		frame.add(weiter);
		frame.setVisible(true);
		return frame;
	}
	
	private static JFrame WeiterVorAntwort() {
		JFrame frame = new JFrame("Jetzt schon? xD");
		frame.setBounds(0, 0, 300, 150);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setLayout(null);
		
		JLabel label = new JLabel("<html>Ohne etwas auszuwählen schon weiter?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 13));
		label.setBounds(0, 10, 300, 40);
		
		JButton weiter = new JButton("Nein");
		weiter.setBounds(45, 70, 200, 30);
		weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		
		frame.add(label);
		frame.add(weiter);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageEins() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 1/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("Das flächenmäßig kleinste Bundesland heißt...", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("...Bremen");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AEins = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AEinsBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("...Berlin");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("...Saarland");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("...Hamburg");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageZwei();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageZwei() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 2/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("Was bedeutet das lateinische \"carpe diem\" ?", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Nutze den Tag");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AZwei = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AZweiBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Genieße das Leben");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Dein Tag wird toll werden");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 201, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("<html>Man sieht sich immer<br>zweimal im Leben</html>");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageDrei();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageDrei() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 3/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("Was ist die \"Goldene Himbeere\"?", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("<html>ein Preis für die schlechteste Leistung innerhalb eines Filmjahres</html>");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 25));
		aEins.setBounds(0, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ADrei = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ADreiBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("<html>Eine Nachspeise aus Russland</html>");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("<html>Das teuerste Schmuckstück der Welt</html>");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Das Symbol einer Sekte");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageVier();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageFuenf() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 5/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("Welcher Pilz ist einer der giftigsten der Welt?", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("<html>Der Grüne Knollenblätterpilz</html>");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AFuenf = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AFuenfBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Der Fliegenpilz");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(0, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("<html>Der Gemeine Kartoffelbovist</html>");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Der Satansröhrling");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageSechs();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageVier() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 4/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Welcher deutsche Herrscher trug den Beinamen \"der Große\"?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("<html>Friedrich II. von Preußen</html>");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AVier = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AVierBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("<html>Friedrich der I. von Preußen</html>");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("<html>Friedrich der III. von Sachsen</html>");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("<html>Friedrich der III. von Österreich</html>");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(0, 201, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageFuenf();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageSechs() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 6/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Welche Gürtelfarbe existiert nicht im Kampfsport Karate?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("rot");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ASechs = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ASechsBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("schwarz");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("weiß");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("braun");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageSieben();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageSieben() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 7/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Welche Insel gehört nicht zu den Balearischen Inseln?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Gran Canaria");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ASieben = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ASiebenBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Ibiza");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Formentera");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 201, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Cabrera");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageAcht();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageAcht() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 8/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Welcher Schauspieler hat nicht in einem James Bond-Film mitgespielt?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Leonardo DiCaprio");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AAcht = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AAchtBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Timothy Dalton");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Daniel Craig");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Javier Bardem");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(0, 201, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageNeun();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageNeun() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 9/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("Einen Feinschmecker nennt man auch...", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("...Gourmet");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ANeun = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ANeunBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("...Gourmed");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(0, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("...Genießer");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("...Leckermäulchen");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageZehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageZehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 10/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Welches ist kein Buch aus dem Alten Testament?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Mosels");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AZehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AZehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Exodus");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Numeri");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 201, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Levitikus");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageElf();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageElf() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 11/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Folgt man dem Äquator um die Welt, legt man wie viele Kilometer zurück?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("rund 40.070 km");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AElf = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AElfBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("rund 30.070 km");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("rund 60.070 km");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("rund 80.070 km");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(0, 201, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageZwoelf();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageZwoelf() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 12/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("Wer oder was ist eine \"Druidin\"?", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("<html>eine Priesterin oder Zauberin der keltischen Religion</html>");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AZwoelf = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AZwoelfBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("<html>eine Kräutersammlerin im Harz</html>");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(0, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("<html>eine Hunderasse aus China</html>");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("ein Magnetfeld");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageDreizehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageDreizehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 13/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("Welches Metall leitet Wärme am besten?", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Silber");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ADreizehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ADreizehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Kupfer");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(0, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Aluminium");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Gold");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageVierzehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageVierzehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 14/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Welcher Roman stammt nicht von Stephen King?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("\"Der große Entwurf\"");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AVierzehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AVierzehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("\"Es\"");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(0, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("\"Shining\"");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("\"Feuerkind\"");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageFuenfzehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageFuenfzehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 15/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Mit welcher Tiergruppe sind die Dinosaurier am engsten verwandt?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Vögeln");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AFuenfzehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AFuenfzehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Eidechsen");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(0, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Alligatoren");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(350, 201, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Affen");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageSechzehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageSechzehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 16/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Was meinen Weinkenner, wenn sie das Wort \"rassig\" verwenden?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("<html>Es beschreibt Weine mit einer ausgeglichenen, aber ausgeprägten Säure</html>");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 25));
		aEins.setBounds(350, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ASechzehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ASechzehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("<html>Es beschreibt Weine mit vielen Duftstoffen</html>");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 25));
		aZwei.setBounds(0, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("<html>Es beschreibt alkohol- und körperreiche Weine</html>");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 25));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("<html>Es beschreibt Weine, die im Geschmack an frisches Obst erinnern</html>");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 25));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageSiebzehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageSiebzehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 17/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Wie vielen Zeitzonen gehört Russland an?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("11");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ASiebzehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ASiebzehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("5");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("7");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("9");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(350, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageAchtzehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageAchtzehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 18/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Welcher Schwimmstil existiert beim olympischen Lagenschwimmen nicht?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Bauch");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(350, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AAchtzehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AAchtzehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Schmetterling");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Brust");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(0, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Rücken");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(0, 201, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageNeunzehn();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageNeunzehn() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 19/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Wo wurde die Hauptfigur Jean-Baptiste Grenouille aus \"Das Parfum\" von Patrick Süskind geboren?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("auf einem Fischmarkt");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 321, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		ANeunzehn = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.ANeunzehnBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("in einem Krankenhaus");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 201, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("in einem Schlossgarten");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(350, 321, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("in einem Auto");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(0, 201, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Weiter");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.ORANGE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					FrageZwanzig();
					frame.dispose();
					Var.finish = false;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}
	
	public static JFrame FrageZwanzig() {
		JFrame frame = new JFrame("Beweise dein Wissen - Das Quiz: Frage 20/20");
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setOpaque(true);
		frame.setBounds(0, 0, 717, 520);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Draw labelDraw = new Draw();
		labelDraw.setBounds(0, 0, 700, 500);
		labelDraw.setVisible(true);
		
		JLabel label = new JLabel("<html>Wo herrscht kein Linksverkehr?</html>", JLabel.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 30));
		label.setBounds(0, 0, 700, 200);
		label.setOpaque(true);
		label.setBackground(Color.LIGHT_GRAY);
		label.setForeground(Color.WHITE);
		
		JButton aEins = new JButton("Island");
		aEins.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aEins.setBounds(0, 201, 350, 120);
		aEins.setOpaque(true);
		aEins.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		AZwanzig = aEins;
		aEins.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					Var.AZwanzigBool = true;
					RichtigeAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aZwei = new JButton("Irland");
		aZwei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aZwei.setBounds(350, 321, 350, 120);
		aZwei.setOpaque(true);
		aZwei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aZwei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aZwei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aDrei = new JButton("Indien");
		aDrei.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aDrei.setBounds(350, 201, 350, 120);
		aDrei.setOpaque(true);
		aDrei.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aDrei.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aDrei.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton aVier = new JButton("Großbritannien");
		aVier.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		aVier.setBounds(0, 321, 350, 120);
		aVier.setOpaque(true);
		aVier.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		aVier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == false) {
					aVier.setBackground(Color.RED);
					aEins.setBackground(Color.GREEN);
					FalscheAntwort();
					Var.finish = true;
				} else {
					Finish();
				}
			}
		});
		
		JButton Weiter = new JButton("Auswerten");
		Weiter.setFont(new Font("Arial", Font.ROMAN_BASELINE, 30));
		Weiter.setBounds(0, 441, 700, 40);
		Weiter.setOpaque(true);
		Weiter.setBackground(Color.MAGENTA);
		Weiter.setForeground(Color.WHITE);
		Weiter.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		Weiter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(Var.finish == true) {
					new Berechnen();
					new Auswertung();
					frame.dispose();
					Var.finish = true;
				} else {
					WeiterVorAntwort();
				}
			}
		});
		
		panel.add(labelDraw);
		panel.add(label);
		panel.add(aEins);
		panel.add(aZwei);
		panel.add(aDrei);
		panel.add(aVier);
		panel.add(Weiter);
		frame.add(panel);
		frame.setVisible(true);
		return frame;
	}

}
