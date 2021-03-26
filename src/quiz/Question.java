package quiz;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public abstract  class Question {
	private static int stID=0;
	private int id;
	//protected String tekstPitanja;
	protected JLabel tekstPitanja;
	

	protected List<String> odgovori=new ArrayList<String>();
	protected String tacanOdgovor;
	protected List<String> predatiOdgovor=new LinkedList<String>();
	protected boolean dat_tacan_odgovor;
	protected JLabel slika;
	
	Question(JLabel text,List<String> odg, String tacanOdgovor,JLabel slika, List<String> odgovori){
		this.tekstPitanja=text;
		this.odgovori=odg;
		this.tacanOdgovor=tacanOdgovor;
		Baza_Pitanja baza=Baza_Pitanja.dohvati_bazu();
		dat_tacan_odgovor=false;
		id=stID;
		stID++;
		this.slika=slika;
		
	}
	
	public abstract int brojPonudjenihOdgovora();
	
	public void shuffleAnswers() {
		Collections.shuffle(odgovori);
	}
	
	
	public int getID() {
		return id;
	}
	boolean tacan(String odgovor) {
	    if (tacanOdgovor.compareTo(odgovor)==0) {
	    	return true;
	    }
	    else return false;
	}
	
	public int getId() {
		return this.id;
	}
	public abstract Box iscrtaj(int i, boolean east);
	//public abstract Box iscrtajPanel(int i,int a);
	public abstract JTextField dohvTextField();



	public boolean isDat_tacan_odgovor() {
		return dat_tacan_odgovor;
	}

	public List<String> getPredatiOdgovor() {
		return predatiOdgovor;
	}

	public String getTekstPitanja() {
		return this.tekstPitanja.getText();
	}
	
	public boolean imaSliku() {
		return (slika==null);
	}
	public List<String> ponudjeniOdgovori() {
		return this.odgovori;
	}

	public String getTacanOdgovor() {
		return tacanOdgovor;
	}
	
}
