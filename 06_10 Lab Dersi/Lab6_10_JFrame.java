import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab6_10_JFrame {

	private JFrame frame;
	private JTextField textField;
	
	Lab6_10 lab6_10;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab6_10_JFrame window = new Lab6_10_JFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Lab6_10_JFrame() {
		lab6_10 = new Lab6_10();
		initialize();
		
	}


	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 476, 404);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel SayıGirişi = new JLabel("Sayı Girişi");
		SayıGirişi.setBounds(35, 37, 62, 33);
		frame.getContentPane().add(SayıGirişi);
		
		textField = new JTextField();
		textField.setBounds(121, 43, 179, 25);
		frame.getContentPane().add(textField);
		textField.setColumns(10);


	    final JLabel JLabel2 = new JLabel("-----");
		JLabel2.setBounds(35, 112, 393, 230);
		frame.getContentPane().add(JLabel2);
		
		JButton btnNewButton = new JButton("Başa Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sayi = Integer.parseInt(textField.getText());
				Eleman yeni = new Eleman(sayi);
				lab6_10.basaEkle(yeni);
				
				String liste = lab6_10.Listele();
				
				JLabel2.setText(liste);
				
			}
		});
		btnNewButton.setBounds(339, 42, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
		JButton btnNewButton_1 = new JButton("Sona Ekle");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int sayi = Integer.parseInt(textField.getText());
				Eleman yeni = new Eleman(sayi);
				lab6_10.sonaEkle(yeni);
				
				String liste = lab6_10.Listele();
				
				JLabel2.setText(liste);
			}
		});
		btnNewButton_1.setBounds(339, 81, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Arama");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			    int aranan = Integer.parseInt(textField.getText());
				textField.getText();
				int s = lab6_10.elemanAra(aranan);
				if(s>0) {
					JLabel2.setText("Aranan: " +aranan + " ve " + s + ". sayı");
					
				}
				else {
					JLabel2.setText(aranan + " ");
					}
					
				
			}
		});
		btnNewButton_1_1.setBounds(211, 81, 89, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
	}}


//Parametre olarak gelen sayıyı bulsun varsa kaçıncı eleman yoksa yok dicek
