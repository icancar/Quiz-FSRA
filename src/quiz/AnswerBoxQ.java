package quiz;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AnswerBoxQ extends Question {
	private JTextField textField=new JTextField();
	public AnswerBoxQ(JLabel text, List<String> odg, String tacanOdgovor,JLabel slika, List<String> odgovori) {
		super(text, odg, tacanOdgovor,slika, odgovori);
		// TODO Auto-generated constructor stub
	}

	

		
		
		
		
	public Box iscrtajPanel(int i, int a) {
		return null;
	}

	public Box iscrtaj(int i, boolean east) {
		Box pitanje=new Box(BoxLayout.Y_AXIS);
		pitanje.add(Box.createVerticalGlue());
		
		JLabel text_pitanja =new  JLabel();
		text_pitanja.setText("<html>"+i+"."+this.tekstPitanja.getText());
		text_pitanja.setHorizontalAlignment(SwingConstants.LEFT);
		text_pitanja.setBackground(pitanje.getBackground());
		
		
		JPanel pom=new JPanel(new BorderLayout());
		pom.add(text_pitanja,BorderLayout.WEST);
		pitanje.add(pom);
		
		
	
		if(slika!=null) {
			pitanje.add(slika);
			} 
		
		
	
		textField.setSize(20,40);
		
		JPanel pom1=new JPanel(new BorderLayout());
		pom1.add(textField,BorderLayout.NORTH);
		
		
		
		pitanje.add(pom1);
		

		return pitanje;
	}

	
	
	public boolean tacanTextField() {
		String ans=textField.getText();
		if(ans.compareTo(tacanOdgovor)==0) {
			return true;
		}
		return false;
	}







	@Override
	public int brojPonudjenihOdgovora() {
		return 1;
	}







	@Override
	public JTextField dohvTextField() {
		return textField;
	}

	
}
