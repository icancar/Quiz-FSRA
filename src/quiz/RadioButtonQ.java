package quiz;


import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class RadioButtonQ extends Question implements ActionListener{
	private ButtonGroup ponudjeni_odg;
	private JRadioButton[]  dugmad;
	RadioButtonQ(JLabel text, List<String> odg, String tacanOdgovor, JLabel slika, List<String> tacniOdgovori) {
		super(text, odg, tacanOdgovor,slika, null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Box iscrtaj(int redniBrojPitanja, boolean east) {

	
		Box pitanje;
		if (east==true) {
		pitanje=new Box(BoxLayout.Y_AXIS);
		}
		else {
			pitanje=new Box(BoxLayout.Y_AXIS);
			//pitanje.setLayout(new GridLayout(2,1,0,0));
		}
	
	
	
		pitanje.add(Box.createVerticalGlue());
		

		

		
		JLabel text_pitanja =new  JLabel();
		text_pitanja.setText("<html>"+redniBrojPitanja+".<html/> "+this.tekstPitanja.getText());
		text_pitanja.setHorizontalAlignment(SwingConstants.LEFT);
		text_pitanja.setBackground(pitanje.getBackground());
		
		text_pitanja.setSize(pitanje.getSize());
		
		//pitanje.add(text_pitanja, BorderLayout.CENTER);

		JPanel pom=new JPanel(new BorderLayout());
		pom.add(text_pitanja,BorderLayout.WEST);
		pitanje.add(pom);
		
		ponudjeni_odg=new ButtonGroup();
		
		dugmad=new JRadioButton[odgovori.size()];
		
		
		if(slika!=null) {
			JPanel pom1=new JPanel();
			pom1.setLayout(new BorderLayout());
			pom1.add(slika,BorderLayout.WEST);
			pitanje.add(pom1);
			} //sliku cemo da dodajemo kao argument pri pravljenju objekta pitanja
		
		
		
		
		
		for(int i=0; i<odgovori.size();i++) 	
		{
			dugmad[i]=new JRadioButton(odgovori.get(i), false);
			
			dugmad[i].addActionListener(this);
			ponudjeni_odg.add(dugmad[i]);
			JPanel radioPan=new JPanel();
			radioPan.setLayout(new BorderLayout());
			radioPan.add(dugmad[i], BorderLayout.NORTH);
			pitanje.add(radioPan,BorderLayout.WEST);
		
		}
		


		return pitanje;
		
	}
	/*
	
	public Box iscrtajPanel(int redniBrojPitanja, int brojPonudjenihOdgovora) {
		//JPanel pitanje=new JPanel(new GridLayout(brojPonudjenihOdgovora+1,1));
		Box pitanje=new Box(BoxLayout.Y_AXIS);
	
		pitanje.add(Box.createVerticalGlue());
		

		

		
		JLabel text_pitanja =new  JLabel();
		text_pitanja.setText(""+redniBrojPitanja+". "+this.tekstPitanja.getText());
		text_pitanja.setBackground(pitanje.getBackground());
		
		text_pitanja.setSize(pitanje.getSize());
		pitanje.add(text_pitanja, BorderLayout.NORTH);
		
		ponudjeni_odg=new ButtonGroup();
		
		dugmad=new JRadioButton[odgovori.size()];
		
		if(slika!=null) {
			pitanje.add(slika);
			} //sliku cemo da dodajemo kao argument pri pravljenju objekta pitanja
		
		
		
		
		
		for(int i=0; i<odgovori.size();i++) 	
		{
			dugmad[i]=new JRadioButton(odgovori.get(i), false);
			
			dugmad[i].addActionListener(this);
			ponudjeni_odg.add(dugmad[i]);
			pitanje.add(dugmad[i],BorderLayout.LINE_START);
			
		
		}
		

		return pitanje;
	}
	*/

	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.predatiOdgovor.clear();
		this.predatiOdgovor.add(arg0.getActionCommand().toString());
		if(arg0.getActionCommand().equals(tacanOdgovor)) {
			dat_tacan_odgovor=true;
			
		}else dat_tacan_odgovor=false;
	}
	
	public boolean datOdgovor() {
		for(int i=0;i<odgovori.size();i++) {
			if(dugmad[i].isSelected())
				return true;
		}
		return false;
	}

	@Override
	public int brojPonudjenihOdgovora() {
		return odgovori.size();
	}

	@Override
	public JTextField dohvTextField() { //ne koristi se ali mi treba za AnswerBoxQ
		return null;
	}
}
