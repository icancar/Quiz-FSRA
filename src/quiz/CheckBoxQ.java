package quiz;


import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.BoxLayout;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class CheckBoxQ extends Question implements ActionListener{
	//private ButtonGroup ponudjeni_odg;
	private List<String> tacniOdgovori;
	private JCheckBox[]  dugmad;
	CheckBoxQ(JLabel text, List<String> odg, String tacanOdgovor, JLabel slika, List<String> tacniOdgovori) {
		super(text, odg, tacanOdgovor,slika, tacniOdgovori);
		this.tacniOdgovori=tacniOdgovori;
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
	/*	Font font=new Font("Verdana", Font.BOLD, 24);
		text_pitanja.setFont(font);*/
		text_pitanja.setText("<html>"+redniBrojPitanja+".<html/> "+this.tekstPitanja.getText());
		
		

		JPanel pom=new JPanel();
		pom.setLayout(new BorderLayout());
		pom.add(text_pitanja,BorderLayout.WEST);
		pitanje.add(pom,BorderLayout.WEST);

		
		
		
		
		dugmad=new JCheckBox[odgovori.size()];
		
		
/*
		if(slika!=null) {
			JPanel pom1=new JPanel();
			pom1.setLayout(new BorderLayout());
			pom1.add(slika,BorderLayout.NORTH);
			pitanje.add(pom1);
			} //sliku cemo da dodajemo kao argument pri pravljenju objekta pitanja
		
		
		
		/*
		
		for(int i=0; i<odgovori.size();i++) 	
		{
			dugmad[i]=new JCheckBox(odgovori.get(i), false);
			dugmad[i].setText(odgovori.get(i));
			dugmad[i].addActionListener(this);
			//ponudjeni_odg.add(dugmad[i]);
			JPanel radioPan=new JPanel();
			radioPan.setLayout(new BorderLayout());
			radioPan.add(dugmad[i], BorderLayout.NORTH);
			pitanje.add(radioPan, BorderLayout.WEST);
			
		
		}
		*/

		return pitanje;
		
	}
	/*
	public Box iscrtajPanel(int redniBrojPitanja, int brojPonudjenihOdgovora) {
		//JPanel pitanje=new JPanel(new GridLayout(brojPonudjenihOdgovora+1,1));
		Box pitanje=new Box(BoxLayout.Y_AXIS);
	
		pitanje.add(Box.createVerticalGlue());
		

		

		
		JLabel text_pitanja =new  JLabel();
		text_pitanja.setText(""+redniBrojPitanja+". "+this.tekstPitanja);
		text_pitanja.setBackground(pitanje.getBackground());
		
		text_pitanja.setSize(pitanje.getSize());
		pitanje.add(text_pitanja, BorderLayout.NORTH);
		
		//ponudjeni_odg=new ButtonGroup();
		
		dugmad=new JCheckBox[odgovori.size()];
		
		if(slika!=null) {
			pitanje.add(slika);
			} //sliku cemo da dodajemo kao argument pri pravljenju objekta pitanja
		
		
		
		
		
		for(int i=0; i<odgovori.size();i++) 	
		{
			dugmad[i]=new JCheckBox(odgovori.get(i), false);			
			dugmad[i].addActionListener(this);
			//ponudjeni_odg.add(dugmad[i]);
			pitanje.add(dugmad[i],BorderLayout.LINE_START);
			
		
		}
		

		return pitanje;
	}
*/
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.predatiOdgovor.clear();
		for(int i=0;i<odgovori.size();i++) {
			if(dugmad[i].isSelected()) { 
				predatiOdgovor.add(dugmad[i].getText());}
		}
		
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
	
	public boolean datTacanOdgovor() {
		int cnt=0;
		for(int i=0;i<odgovori.size();i++) {
			if(dugmad[i].isSelected()) {
				if(odgovori.contains(dugmad[i].getText())) {
					cnt++;
				}
			}
		}
		
		if (cnt==tacniOdgovori.size()){ return true;}
		return false;
	}

	@Override
	public JTextField dohvTextField() { //ne koristi se ali mi treba za AnswerBoxQ
		return null;
	}

	
}

