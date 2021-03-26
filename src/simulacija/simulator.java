package simulacija;

import quiz.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.lang.model.element.NestingKind;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollBar;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.JProgressBar;

public class simulator extends JFrame implements ActionListener {
	public static List<Integer> listaIzabranihPitanjaPoID = null;
	private JPanel contentPane;
	private JButton East;
	private JButton Austria;
	public static JPanel panel_pitanja;
	private JPanel panel_upravljanje;
	public static boolean east;
	private JButton sledece_pitanje;
	private List<Question> lista_izabranih_pitanja;
	private List<Question> lista_netacnih_pitanja;
	private JPanel statistika;
	private JLabel labela_sa_poenima = new JLabel("0");
	private JLabel vreme = new JLabel("0:0:0");
	private int counter = 0;
	private static int cntPitanjaAustria = 0;
	private JProgressBar progressBar;
	private boolean zahtevZaSledece = false;
	private CardLayout card = new CardLayout();
	private boolean isAustria;
	private Timer tajmer = new Timer(1000, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			counter--;
			int sekunde = counter % 60;
			int minuti = counter / 60;
			int sati = minuti / 60;
			minuti = minuti % 60;

			int pom = progressBar.getValue();
			progressBar.setValue(--pom);

			vreme.setText("" + sati + ":" + minuti + ":" + sekunde);
			// zavisno od trajanja testa
			if (vreme.getText().equals("0:0:0")) {
				tajmer.stop();
				if (isAustria == true) {
					cntPitanjaAustria++;
					sledece_pitanje.setEnabled(true);
					zahtevZaSledece = false;

					if (cntPitanjaAustria == 15) {
						sledece_pitanje.setText("Zavrsi test");
						isAustria = false;

					}

					if (east) {
						counter = 15 * 60;
						vreme.setText("0:15:0");
					}
					if (!east) {
						counter = 60 * 5;
						vreme.setText("0:5:0");
					}
					progressBar.setValue(100);
					card.next(panel_pitanja);
					panel_pitanja.validate();
					tajmer.start();

				} else {

					izbaciRezultate(brojac_tacnih_odg());
					sledece_pitanje.setEnabled(false);
					East.setEnabled(true);
					Austria.setEnabled(true);
				}

			}

		}
	});

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		// EventQueue.invokeLater(new Runnable() {
		// public void run() {
		try {
			simulator frame = new simulator();
			frame.setTitle("FSRA Simulator kvalifikacija");
			frame.setVisible(true);
			frame.setLocation(0, 0);
			frame.setSize(800, 800);
			frame.setResizable(true);

		} catch (Exception e) {
			e.printStackTrace();
		}
		// }
		// });
	}

	/**
	 * Create the frame.
	 */
	public simulator() {
		getContentPane().setLayout(new BorderLayout(0, 0));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(80, 80, 1200, 1100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		panel_upravljanje = new JPanel();
		contentPane.add(panel_upravljanje, BorderLayout.SOUTH);
		panel_upravljanje.setLayout(new BorderLayout(0, 0));

		East = new JButton("East");
		panel_upravljanje.add(East, BorderLayout.WEST);

		East.addActionListener(this);

		Austria = new JButton("Austria");
		Austria.addActionListener(this);
		panel_upravljanje.add(Austria, BorderLayout.EAST);

		sledece_pitanje = new JButton("");
		sledece_pitanje.addActionListener(this);
		sledece_pitanje.setEnabled(false);
		panel_upravljanje.add(sledece_pitanje, BorderLayout.NORTH);
		panel_pitanja = new JPanel();

		JScrollPane scrollPane = new JScrollPane(panel_pitanja);
		getContentPane().add(BorderLayout.CENTER, scrollPane);

		statistika = new JPanel();

		panel_pitanja.setVisible(true);

		progressBar = new JProgressBar(0, 140);
		progressBar.setStringPainted(true);
		statistika.add(progressBar);
		progressBar.setVisible(false);

		// JLabel label = new JLabel("Osvojeni poeni: ");
		// statistika.add(label);
		// statistika.add(labela_sa_poenima);
		statistika.add(new JLabel("Vreme:"));

		statistika.add(vreme);

		contentPane.add(statistika, BorderLayout.NORTH);

	}

	public JButton getEast() {
		return East;
	}

	protected void kreiraj_East() {
		// TODO Auto-generated method stub
		isAustria = false;
		panel_pitanja.removeAll();
		Baza_Pitanja baza = Baza_Pitanja.dohvati_bazu();
		System.out.println("Broj pitanja: " + baza.brojPitanja());
		lista_izabranih_pitanja = new ArrayList<Question>();
		lista_netacnih_pitanja = new ArrayList<Question>();
		if (listaIzabranihPitanjaPoID == null) {
			listaIzabranihPitanjaPoID = new ArrayList<Integer>();
		}

		// panel_pitanja.setLayout(new GridLayout(15,1));
		Box boxPitanja = new Box(BoxLayout.Y_AXIS);
		boxPitanja.add(Box.createVerticalGlue());
		Question pitanje;
		Austria.setEnabled(false);

		for (int i = 0; i < 15;) {

			int br = (int) (Math.random() * baza.brojPitanja());
			pitanje = baza.dohvati_po_Id(br);
			if (!lista_izabranih_pitanja.contains(pitanje) && !listaIzabranihPitanjaPoID.contains(pitanje.getID())) {
				lista_izabranih_pitanja.add(pitanje);
				listaIzabranihPitanjaPoID.add(pitanje.getID());

				// JPanel pom=new JPanel();
				// pom.setLayout(new BorderLayout());
				// pom.add(pitanje.iscrtaj(i+1, true), BorderLayout.NORTH);

				boxPitanja.add(pitanje.iscrtaj(i + 1, true), BorderLayout.WEST);
				// panel_pitanja.add(pom);

				i++;
			}

		}
		panel_pitanja.add(boxPitanja);
		panel_pitanja.validate();

		sledece_pitanje.setText("Zavrsi test");
		sledece_pitanje.setEnabled(true);

	}

	private void kreiranje_Austria() {
		isAustria = true;
		panel_pitanja.removeAll();
		panel_pitanja.setLayout(card);

		Baza_Pitanja baza = Baza_Pitanja.dohvati_bazu();
		lista_izabranih_pitanja = new ArrayList<Question>();
		lista_netacnih_pitanja = new ArrayList<Question>();
		Question pitanje;
		if (listaIzabranihPitanjaPoID == null) {
			listaIzabranihPitanjaPoID = new ArrayList<Integer>();
		}

		sledece_pitanje.setVisible(true);
		sledece_pitanje.setEnabled(true);
		sledece_pitanje.setText("Sledece pitanje");

		for (int i = 0; i < 15;) {

			int br = (int) (Math.random() * baza.brojPitanja());
			pitanje = baza.dohvati_po_Id(br);

			if (!lista_izabranih_pitanja.contains(pitanje) && !listaIzabranihPitanjaPoID.contains(pitanje.getID())) {
				lista_izabranih_pitanja.add(pitanje);
				listaIzabranihPitanjaPoID.add(pitanje.getID());

				JPanel pom = new JPanel();
				pom.setLayout(new BorderLayout());
				pom.add(pitanje.iscrtaj(i + 1, false), BorderLayout.NORTH);

				if (pitanje instanceof AnswerBoxQ)
					panel_pitanja.add(pom);
				else
					panel_pitanja.add(pom);

				i++;

			}

		}

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getActionCommand().equals("East")) {
			East.setEnabled(false);
			kreiraj_East();
			counter = 15 * 60;
			vreme.setText("0:15:0");
			tajmer.start();
			progressBar.setVisible(false);
			east = true;

		} else

		if (arg0.getActionCommand().equals("Zavrsi test")) {

			System.out.println("IZABRANA PITANJA PO ID: *************************************");
			for (int i = 0; i < listaIzabranihPitanjaPoID.size(); i++) {
				System.out.println(listaIzabranihPitanjaPoID.get(i));
			}
			// labela_sa_poenima.setText( String.valueOf(brojac_tacnih_odg()));

			generisiIzlazniFajl();
			generisiTextPitanja();
			sledece_pitanje.setEnabled(false);
			East.setEnabled(true);
			tajmer.stop();
			Austria.setEnabled(true);

			izbaciRezultate(brojac_tacnih_odg());
			for (int i = 0; i < lista_izabranih_pitanja.size(); i++) {
				if (lista_izabranih_pitanja.get(i) instanceof AnswerBoxQ) {
					lista_izabranih_pitanja.get(i).getPredatiOdgovor()
							.add(lista_izabranih_pitanja.get(i).dohvTextField().getText());
				}
			}

			cntPitanjaAustria = 0;
			panel_pitanja.removeAll();
			panel_pitanja.revalidate();

		} else if (arg0.getActionCommand().equals("Austria")) {

			East.setEnabled(false);
			Austria.setEnabled(false);
			east = false;
			kreiranje_Austria();
			CardLayout cl = (CardLayout) panel_pitanja.getLayout();
			cl.first(panel_pitanja);

			counter = 60 * 5;
			vreme.setText("0:5:0");
			tajmer.start();
			progressBar.setValue(140);
			progressBar.setVisible(true);
		}
		if (arg0.getActionCommand().equals("Sledece pitanje")) { // dodaj novo pitanje

			cntPitanjaAustria++;

			if (cntPitanjaAustria == 14) {
				sledece_pitanje.setText("Zavrsi test");
				isAustria = false;

			}

			counter = 60 * 5;
			vreme.setText("0:5:0");

			progressBar.setValue(140);

			card.next(panel_pitanja);

			panel_pitanja.validate();

		}

	}

	private void generisiTextPitanja() {
		Date date = java.util.Calendar.getInstance().getTime();
		StringBuilder s = new StringBuilder();
		s.append(date + "\n\n");
		int br_pitanja = lista_izabranih_pitanja.size();
		for (int i = 0; i < br_pitanja; i++) {
			Question p = lista_izabranih_pitanja.get(i);
			s.append((i + 1) + ". ");
			if (!p.imaSliku()) {
				s.append("      *****    OVO PITANJE IMA SLIKU   ****\n");
			} else {
				s.append(" " + p.getTekstPitanja() + "\n");
				if (p instanceof RadioButtonQ) {
					List<String> ponudjeniOdgovori = p.ponudjeniOdgovori();
					for (int a = 0; a < ponudjeniOdgovori.size(); a++) {
						s.append("     " + (a + 1) + ". -  " + ponudjeniOdgovori.get(a) + "\n");
					}
				} else {
					s.append("     **** OVO PITANJE NIJE IMALO PONUDJENI ODGOVOR **** \n");
				}
			}
		}

		System.out.println(s.toString());

		try {
			String filename = "ponudjeniOdgovori.txt";
			FileWriter fw = new FileWriter(filename, true); // the true will append the new data
			fw.write(s.toString());// appends the string to the file
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}

	}

	private void generisiIzlazniFajl() {
		Date date = java.util.Calendar.getInstance().getTime();
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < lista_izabranih_pitanja.size(); i++) {
			if (lista_izabranih_pitanja.get(i) instanceof AnswerBoxQ) {
				String odgovor = lista_izabranih_pitanja.get(i).dohvTextField().getText();
				lista_izabranih_pitanja.get(i).getPredatiOdgovor().add(odgovor);
				System.out.println(odgovor + "\n");
				// lista_izabranih_pitanja.get(i).getPredatiOdgovor().add(lista_izabranih_pitanja.get(i).dohvTextField().getText());

			}
			s.append("Question " + (i + 1) + ": " + lista_izabranih_pitanja.get(i).getTekstPitanja());
			s.append("\n");
			if (!lista_izabranih_pitanja.get(i).getPredatiOdgovor().isEmpty()) {
				for (int a = 0; a < lista_izabranih_pitanja.get(i).getPredatiOdgovor().size(); a++) {
					s.append("-Answer: " + lista_izabranih_pitanja.get(i).getPredatiOdgovor().get(a));
					s.append("\n");
				}
			} else {
				s.append("*** NA OVO PITANJE NIJE PREDAT ODGOVOR ***");
				s.append("\n");
			}
			s.append("\n");

		}
		s.append(date.toString() + "\n");
		s.append("********************** KRAJ TESTA  *********************************" + "\n\n\n");
		try {
			String filename = "predatiOdgovori.txt";
			FileWriter fw = new FileWriter(filename, true); // the true will append the new data
			fw.write(s.toString());// appends the string to the file
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
		
	}

	private void izbaciRezultate(int pom) {
		final JDialog d = new JDialog();
		d.setSize(400, 200);
		d.setTitle("Konacni rezultat");
		JLabel osvojeniPoeni = new JLabel();
		osvojeniPoeni.setText("Osvojili ste: " + pom + " poena!");
		fajlSaNetacnimOdgovorima();
		osvojeniPoeni.setHorizontalAlignment(SwingConstants.CENTER);
		d.getContentPane().add(osvojeniPoeni);
		d.setLocationRelativeTo(null);
		d.setVisible(true);

	}

	private int brojac_tacnih_odg() {
		int pom = 0;
		for (int i = 0; i < lista_izabranih_pitanja.size(); i++) {
			if (lista_izabranih_pitanja.get(i).isDat_tacan_odgovor() == true) {
				pom++;
			}else {
				lista_netacnih_pitanja.add(lista_izabranih_pitanja.get(i));
			}

		}
		lista_izabranih_pitanja.removeAll(lista_izabranih_pitanja);
		return pom;

	}

	
	private void fajlSaNetacnimOdgovorima() {
		Date date = java.util.Calendar.getInstance().getTime();
		StringBuilder s = new StringBuilder();
		
		for(int i=0;i<lista_netacnih_pitanja.size();i++) {
			Question pitanje=lista_netacnih_pitanja.get(i);
			s.append(""+(i+1)+". ");
			s.append(pitanje.getTekstPitanja());
			s.append("\n");
			s.append("\t"+"PREDATI ODGOVOR: "+pitanje.getPredatiOdgovor());
			s.append("\n");
			s.append("\t"+"TACAN ODGOVOR: "+ pitanje.getTacanOdgovor());
			s.append("\n");
		}
		
		System.out.println("********************************");
		System.out.println(s.toString());
		
		try {
			String filename = "pogresniOdgovori.txt";
			FileWriter fw = new FileWriter(filename, true); // the true will append the new data
			fw.write(s.toString());// appends the string to the file
			fw.close();
		} catch (IOException ioe) {
			System.err.println("IOException: " + ioe.getMessage());
		}
	}
	
}