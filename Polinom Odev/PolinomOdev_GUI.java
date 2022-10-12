import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;



import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PolinomOdev_GUI {

	int katsayı,derece;
	PolinomOdev Polinom ;
	String Ekran = " ";
	
	private JFrame frame;
	private JTextField textField_Derece;
	private JTextField textField_katsayı;
	private JTextField textField_deger;
	private JButton btnNewButton_Polinom;
	private JLabel lblNewLabel_3;
	private JButton btnNewButton_Polinom_1;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PolinomOdev_GUI window = new PolinomOdev_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public PolinomOdev_GUI() {
		Polinom = new PolinomOdev(); //Nesne tanımlanama
		initialize();
	}


	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField_Derece = new JTextField();
		textField_Derece.setBounds(10, 70, 169, 48);
		frame.getContentPane().add(textField_Derece);
		textField_Derece.setColumns(10);
		
		textField_katsayı = new JTextField();
		textField_katsayı.setColumns(10);
		textField_katsayı.setBounds(10, 11, 169, 48);
		frame.getContentPane().add(textField_katsayı);
		
		textField_deger = new JTextField();
		textField_deger.setColumns(10);
		textField_deger.setBounds(10, 142, 169, 48);
		frame.getContentPane().add(textField_deger);
		
		JLabel lblNewLabel = new JLabel("Polinom");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(20, 174, 103, 61);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Deger");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(357, 326, 92, 54);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Katsayı");
		lblNewLabel_2.setBounds(189, 20, 69, 31);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Derece");
		lblNewLabel_2_1.setBounds(189, 70, 69, 31);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Deger");
		lblNewLabel_2_1_1.setBounds(189, 142, 69, 31);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		btnNewButton_Polinom = new JButton("Polinom Gir");
		btnNewButton_Polinom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Ekrandandan alınanı int'e çevirme 
				int katsayı = Integer.parseInt(textField_katsayı.getText());
				int derece = Integer.parseInt(textField_Derece.getText());	

				
				//liste classının nesnesini oluşturmak, class'a değer yollamak için
				Liste yeni = new Liste(katsayı,derece);
				//liste de oluşturduğumuz değerleri polinoma yazma ve sıralama
				Polinom.PolinomSırala(yeni);
				
				
				
				//oluşan polinomu bir string değerine atamak için
				String Ekran = Polinom.Yazdır();
				
				
				
				//Stringi label nesnesine yazdırma kodu 
				lblNewLabel_3.setText(Ekran);
			
				

				
			}
		});
		btnNewButton_Polinom.setBounds(317, 29, 132, 54);
		frame.getContentPane().add(btnNewButton_Polinom);
		
		lblNewLabel_3 = new JLabel(":");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(10, 199, 439, 104);
		frame.getContentPane().add(lblNewLabel_3);
		
		btnNewButton_Polinom_1 = new JButton("Polinom Gir");
		btnNewButton_Polinom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Ekrandan değer alma
				int deger = Integer.parseInt(textField_deger.getText());
				//Int değeri string yapma 
				String DegerSonuc = Integer.toString(Polinom.Hesaplama(deger));
				//Stringi ekrana yazma
				lblNewLabel_1.setText(DegerSonuc);			
			}
		});
		btnNewButton_Polinom_1.setBounds(317, 126, 132, 54);
		frame.getContentPane().add(btnNewButton_Polinom_1);
		

		
		
	}
}
