package autovermietung;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;


public class AutoBuchung {
	ArrayList <Preis> Preisliste = new ArrayList<Preis>();
	

	private JFrame frame;
	private JCheckBox cbSUV;
	private JCheckBox cbKleinwagen;
	private JCheckBox cbMittelklasse;
	private JCheckBox cbLuxusklasse;
	private JCheckBox cbSchaltung;
	private JCheckBox cbAutomatik;
	private JTextField txtAutoAusgabe;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblGetriebe;
	private JRadioButton rbMuenchen;
	private JRadioButton rbHamburg;
	private JRadioButton rbBerlin;
	private JRadioButton rbRueckMuenchen;
	private JRadioButton rbRueckHamburg;
	private JRadioButton rbRueckBerlin;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private final ButtonGroup buttonGroup_3 = new ButtonGroup();
	private JTextField txtPreis;
	private final ButtonGroup buttonGroup_4 = new ButtonGroup();
	private JTextField txtTage;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AutoBuchung window = new AutoBuchung();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AutoBuchung() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Auto Buchung");
		frame.setBounds(100, 100, 1095, 907);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSuchen = new JButton("Suchen");
		btnSuchen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Orte 
				if (rbMuenchen.isSelected()&&rbRueckBerlin.isSelected())
					JOptionPane.showMessageDialog(null, "Es tut uns leid sie müssen ihr Fahrzeug am selben Standort abholen und zurückgeben", null, JOptionPane.ERROR_MESSAGE);
				else if (rbMuenchen.isSelected()&&rbRueckHamburg.isSelected())
				JOptionPane.showMessageDialog(null, "Es tut uns leid sie müssen ihr Fahrzeug am selben Standort abholen und zurückgeben", null, JOptionPane.ERROR_MESSAGE);
				
				if (rbBerlin.isSelected()&&rbRueckMuenchen.isSelected())
					JOptionPane.showMessageDialog(null, "Es tut uns leid sie müssen ihr Fahrzeug am selben Standort abholen und zurückgeben", null, JOptionPane.ERROR_MESSAGE);
				else if (rbBerlin.isSelected()&&rbRueckHamburg.isSelected())
				JOptionPane.showMessageDialog(null, "Es tut uns leid sie müssen ihr Fahrzeug am selben Standort abholen und zurückgeben", null, JOptionPane.ERROR_MESSAGE);
				
				if (rbHamburg.isSelected()&&rbRueckMuenchen.isSelected())
					JOptionPane.showMessageDialog(null, "Es tut uns leid sie müssen ihr Fahrzeug am selben Standort abholen und zurückgeben", null, JOptionPane.ERROR_MESSAGE);
				else if (rbHamburg.isSelected()&&rbRueckBerlin.isSelected())
				JOptionPane.showMessageDialog(null, "Es tut uns leid sie müssen ihr Fahrzeug am selben Standort abholen und zurückgeben", null, JOptionPane.ERROR_MESSAGE);
				
					
				// SUV Auswahl 
				if (cbSUV.isSelected()&&cbAutomatik.isSelected())
					txtAutoAusgabe.setText("Wir haben einen BMW X6 Zur Verfügung");
				else if  (cbSUV.isSelected()&&cbSchaltung.isSelected())
					txtAutoAusgabe.setText("Wir haben einen Dacia Duster Zur Verfügung");
				
				// Kleinwagen Auswahl
				 if (cbKleinwagen.isSelected()&&cbAutomatik.isSelected()) 
					 txtAutoAusgabe.setText("Wir haben einen Smart Zur Verfügung");
				 else if  (cbKleinwagen.isSelected()&&cbSchaltung.isSelected())
						txtAutoAusgabe.setText("Wir haben einen Fiat 500 Zur Verfügung");
				 
				 //Mittelklasse Auswahl 
				 if (cbMittelklasse.isSelected()&&cbAutomatik.isSelected())
					 txtAutoAusgabe.setText("Wir haben einen Mini Cooper Zur Verfügung");
				 else if  (cbMittelklasse.isSelected()&&cbSchaltung.isSelected())
						txtAutoAusgabe.setText("Wir haben einen Seat Zur Verfügung");
				 
				 //Luxusklasse Auswahl 
				 if (cbLuxusklasse.isSelected()&&cbAutomatik.isSelected())
					 txtAutoAusgabe.setText("Wir haben einen Tesla Model S Zur Verfügung");
				 else if  (cbLuxusklasse.isSelected()&&cbSchaltung.isSelected())
						txtAutoAusgabe.setText("Wir haben einen Golf GTI Zur Verfügung");
				 				
			
				 
				 
				 // Preis
				 			//SUV
				
					if (cbSUV.isSelected()&&cbAutomatik.isSelected()) 
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisSUV() + " und einem Gesamtpreis von: " + String.valueOf(preisSUV()* Integer.parseInt(txtTage.getText()))));
					else if (cbSUV.isSelected()&&cbSchaltung.isSelected())
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisSUVSchaltung()) + " und einem Gesamtpreis von: " + String.valueOf(preisSUVSchaltung()* Integer.parseInt(txtTage.getText())));
					
					//Kleinwagen
					
					if (cbKleinwagen.isSelected()&&cbAutomatik.isSelected()) 
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisKleinwagen() + " und einem Gesamtpreis von: " + String.valueOf(preisKleinwagen()* Integer.parseInt(txtTage.getText()))));
					else if (cbKleinwagen.isSelected()&&cbSchaltung.isSelected())
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisKleinwagenSchaltung()) + " und einem Gesamtpreis von: " + String.valueOf(preisKleinwagenSchaltung()* Integer.parseInt(txtTage.getText())));
					
					//Mittelklasse
					
					if (cbMittelklasse.isSelected()&&cbAutomatik.isSelected()) 
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisMittelklasse() + " und einem Gesamtpreis von: " + String.valueOf(preisMittelklasse()* Integer.parseInt(txtTage.getText()))));
					else if (cbMittelklasse.isSelected()&&cbSchaltung.isSelected())
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisMittelklasseSchaltung()) + " und einem Gesamtpreis von: " + String.valueOf(preisMittelklasseSchaltung()* Integer.parseInt(txtTage.getText())));
					
					//Luxusklasse
					
					if (cbLuxusklasse.isSelected()&&cbAutomatik.isSelected()) 
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisLuxusklasse() + " und einem Gesamtpreis von: " + String.valueOf(preisLuxusklasse()* Integer.parseInt(txtTage.getText()))));
					else if (cbLuxusklasse.isSelected()&&cbSchaltung.isSelected())
						txtPreis.setText("Zu einem Tagespreis von: " + String.valueOf(preisLuxusklasseSchaltung()) + " und einem Gesamtpreis von: " + String.valueOf(preisLuxusklasseSchaltung()* Integer.parseInt(txtTage.getText())));
					
				 
				 
					
				
				 
				 
				 
				
				//frame.setVisible(false); //you can't see me!
				//frame.dispose(); //Destroy the JFrame object
			}
		});
		btnSuchen.setBounds(10, 358, 89, 23);
		frame.getContentPane().add(btnSuchen);
		
		JLabel lblAbholort = new JLabel("Abholort");
		lblAbholort.setBounds(22, 11, 142, 14);
		frame.getContentPane().add(lblAbholort);
		
		JLabel lblRueckgabeort = new JLabel("R\u00FCckgabeort");
		lblRueckgabeort.setBounds(22, 106, 97, 14);
		frame.getContentPane().add(lblRueckgabeort);
		
		JLabel lblAutotyp = new JLabel("Autotyp");
		lblAutotyp.setBounds(22, 202, 74, 14);
		frame.getContentPane().add(lblAutotyp);
		
		cbSUV = new JCheckBox("SUV");
		buttonGroup.add(cbSUV);
		cbSUV.setBounds(22, 223, 99, 23);
		frame.getContentPane().add(cbSUV);
		
		cbKleinwagen = new JCheckBox("Kleinwagen");
		buttonGroup.add(cbKleinwagen);
		cbKleinwagen.setBounds(120, 223, 99, 23);
		frame.getContentPane().add(cbKleinwagen);
		
		cbMittelklasse = new JCheckBox("Mittelklasse");
		buttonGroup.add(cbMittelklasse);
		cbMittelklasse.setBounds(244, 223, 99, 23);
		frame.getContentPane().add(cbMittelklasse);
		
		cbLuxusklasse = new JCheckBox("Luxusklasse");
		buttonGroup.add(cbLuxusklasse);
		cbLuxusklasse.setBounds(22, 249, 99, 23);
		frame.getContentPane().add(cbLuxusklasse);
		
		cbSchaltung = new JCheckBox("Schaltung");
		buttonGroup_1.add(cbSchaltung);
		cbSchaltung.setBounds(22, 316, 99, 23);
		frame.getContentPane().add(cbSchaltung);
		
		cbAutomatik = new JCheckBox("Automatik");
		buttonGroup_1.add(cbAutomatik);
		cbAutomatik.setBounds(120, 316, 99, 23);
		frame.getContentPane().add(cbAutomatik);
		
		txtAutoAusgabe = new JTextField();
		txtAutoAusgabe.setEditable(false);
		txtAutoAusgabe.setBounds(10, 410, 292, 20);
		frame.getContentPane().add(txtAutoAusgabe);
		txtAutoAusgabe.setColumns(10);
		
		lblGetriebe = new JLabel("Getriebe");
		lblGetriebe.setBounds(22, 286, 74, 14);
		frame.getContentPane().add(lblGetriebe);
		
		rbMuenchen = new JRadioButton("Muenchen");
		buttonGroup_2.add(rbMuenchen);
		rbMuenchen.setBounds(22, 31, 154, 14);
		frame.getContentPane().add(rbMuenchen);
		
		rbHamburg = new JRadioButton("Hamburg");
		buttonGroup_2.add(rbHamburg);
		rbHamburg.setBounds(22, 51, 154, 14);
		frame.getContentPane().add(rbHamburg);
		
		rbBerlin = new JRadioButton("Berlin");
		buttonGroup_2.add(rbBerlin);
		rbBerlin.setBounds(22, 71, 154, 14);
		frame.getContentPane().add(rbBerlin);
		
		rbRueckMuenchen = new JRadioButton("Muenchen");
		buttonGroup_3.add(rbRueckMuenchen);
		rbRueckMuenchen.setBounds(22, 126, 154, 14);
		frame.getContentPane().add(rbRueckMuenchen);
		
		rbRueckHamburg = new JRadioButton("Hamburg");
		buttonGroup_3.add(rbRueckHamburg);
		rbRueckHamburg.setBounds(22, 146, 154, 14);
		frame.getContentPane().add(rbRueckHamburg);
		
		rbRueckBerlin = new JRadioButton("Berlin");
		buttonGroup_3.add(rbRueckBerlin);
		rbRueckBerlin.setBounds(22, 166, 154, 14);
		frame.getContentPane().add(rbRueckBerlin);
		
		txtPreis = new JTextField();
		txtPreis.setEditable(false);
		txtPreis.setBounds(10, 441, 799, 34);
		frame.getContentPane().add(txtPreis);
		txtPreis.setColumns(10);
		
		txtTage = new JTextField();
		txtTage.setBounds(185, 133, 96, 20);
		frame.getContentPane().add(txtTage);
		txtTage.setColumns(10);
		
		JLabel lblAnzahlTage = new JLabel("Anzahl Tage:");
		lblAnzahlTage.setBounds(185, 106, 96, 14);
		frame.getContentPane().add(lblAnzahlTage);
		
		JButton btnVisa = new JButton("Mit Visa Bezahlen");
		btnVisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				// Bezahlung SUV
				if (cbSUV.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisSUV()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				else if (cbSUV.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisSUVSchaltung()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				
				// Bezahlung Kleinwagen
				if (cbKleinwagen.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisKleinwagen()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				else if (cbKleinwagen.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisKleinwagenSchaltung()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				
				// Bezahlung Mittelklasse
				if (cbMittelklasse.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisMittelklasse()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				else if (cbMittelklasse.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisMittelklasseSchaltung()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				
				// Bezahlung Luxusklasse
				if (cbLuxusklasse.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisLuxusklasse()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				else if (cbLuxusklasse.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit Visa erheben wir eine Gebühr von 10€ - Neuer Gesamtpreis: "+ String.valueOf((preisLuxusklasseSchaltung()* Integer.parseInt(txtTage.getText()))+10)+ "€");
				
				
			}
		});
		btnVisa.setBounds(22, 512, 134, 23);
		frame.getContentPane().add(btnVisa);
		
		JButton btnPayPal = new JButton("Mit PayPal");
		btnPayPal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//und durch die Nutzung von Rabattcode Meyer nochmal 5€ 
				
				// Bezahlung SUV
				if (cbSUV.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisSUV()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				else if (cbSUV.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisSUVSchaltung()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				
				// Bezahlung Kleinwagen
				if (cbKleinwagen.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisKleinwagen()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				else if (cbKleinwagen.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisKleinwagenSchaltung()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				
				// Bezahlung Mittelklasse
				if (cbMittelklasse.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisMittelklasse()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				else if (cbMittelklasse.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisMittelklasseSchaltung()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				
				// Bezahlung Luxusklasse
				if (cbLuxusklasse.isSelected()&&cbAutomatik.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisLuxusklasse()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				else if (cbLuxusklasse.isSelected()&&cbSchaltung.isSelected())
				JOptionPane.showMessageDialog(null, "Durch die Bezahlung mit PayPal schreiben wir ihnen 10€ gut - Neuer Gesamtpreis: "+ String.valueOf((preisLuxusklasseSchaltung()* Integer.parseInt(txtTage.getText()))-10)+ "€");
				
					
			}		
	});
		btnPayPal.setBounds(166, 512, 177, 23);
		frame.getContentPane().add(btnPayPal);
		
	}
// Berechne Preis SUV
	private  int preisSUV() {
		if(cbSUV.isSelected()) {
			return Preis.berechnePreisSUV();
		}
		else
			return 0;
		
	}
	private  int preisSUVSchaltung() {
		if(cbSUV.isSelected()) {
			return Preis.berechnePreisSUVSchaltung();
		}
		else
			return 0;
		
	}
	// Berechne Preis Kleinwagen
		private  int preisKleinwagen() {
			if(cbKleinwagen.isSelected()) {
				return Preis.berechnePreisKleinwagen();
			}
			else
				return 0;
			
		}
		private  int preisKleinwagenSchaltung() {
			if(cbKleinwagen.isSelected()) {
				return Preis.berechnePreisKleinwagenSchaltung();
			}
			else
				return 0;
			
		}
		// Berechne Preis Mittelklasse
		private  int preisMittelklasse() {
			if(cbMittelklasse.isSelected()) {
				return Preis.berechnePreisMittelklasse();
			}
			else
				return 0;
			
		}
		private  int preisMittelklasseSchaltung() {
			if(cbMittelklasse.isSelected()) {
				return Preis.berechnePreisMittelklasseSchaltung();
			}
			else
				return 0;
			
		}
		// Berechne Preis Luxusklasse
		private  int preisLuxusklasse() {
			if(cbLuxusklasse.isSelected()) {
				return Preis.berechnePreisLuxusklasse();
			}
			else
				return 0;
			
		}
		private  int preisLuxusklasseSchaltung() {
			if(cbLuxusklasse.isSelected()) {
				return Preis.berechnePreisLuxusklasseSchaltung();
			}
			else
				return 0;
			
		}
}
