package de.jonas.quiz;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {
	
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		if(Var.AEinsBool == true) {
			GUI.AEins.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AZweiBool == true) {
			GUI.AZwei.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.ADreiBool == true) {
			GUI.ADrei.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AVierBool == true) {
			GUI.AVier.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AFuenfBool == true) {
			GUI.AFuenf.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.ASechsBool == true) {
			GUI.ASechs.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		} 
		if(Var.ASiebenBool == true) {
			GUI.ASieben.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AAchtBool == true) {
			GUI.AAcht.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.ANeunBool == true) {
			GUI.ANeun.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AZehnBool == true) {
			GUI.AZehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AElfBool == true) {
			GUI.AElf.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AZwoelfBool == true) {
			GUI.AZwoelf.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.ADreizehnBool == true) {
			GUI.ADreizehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AVierzehnBool == true) {
			GUI.AVierzehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AFuenfzehnBool == true) {
			GUI.AFuenfzehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.ASechzehnBool == true) {
			GUI.ASechzehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.ASiebzehnBool == true) {
			GUI.ASiebzehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AAchtzehnBool == true) {
			GUI.AAchtzehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.ANeunzehnBool == true) {
			GUI.ANeunzehn.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		if(Var.AZwanzigBool == true) {
			GUI.AZwanzig.setBackground(Color.getHSBColor(ChangeColor.h, ChangeColor.s, ChangeColor.b));
		}
		
		repaint();		
	}

}
