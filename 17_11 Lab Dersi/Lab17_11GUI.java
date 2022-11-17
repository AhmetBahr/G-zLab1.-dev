import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab17_11GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	Lab17_11 A;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab17_11GUI window = new Lab17_11GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Lab17_11GUI() {
		A = new Lab17_11();
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NO");
		lblNewLabel.setBounds(10, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("İsim");
		lblNewLabel_1.setBounds(10, 78, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(67, 39, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(66, 75, 86, 20);
		frame.getContentPane().add(textField_1);
		
		final JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setBounds(10, 155, 167, 55);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(textField.getText());
				String isim = textField_1.getText();
				Dugum5 yeni = new Dugum5(isim,no);
				
				A.addItem(yeni);
				System.out.println("");
				A.inOrder(A.kok);
				
			}
		});
		btnNewButton.setBounds(183, 38, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnYaprakSil = new JButton("Yaprak sil");
		btnYaprakSil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(textField.getText());
				
				boolean s = A.yaprakSil(no);
				if(s) {
					lblNewLabel_2.setText("Yaprak Silindi");

				}
				else {
					lblNewLabel_2.setText("Yaprak Silinmedi");

				}
				
			}
		});
		btnYaprakSil.setBounds(183, 74, 89, 23);
		frame.getContentPane().add(btnYaprakSil);
		
		JButton btnEnByk = new JButton("En Büyük");
		btnEnByk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(textField.getText());
				
					Dugum5 d = A.enBuyuk();
					if(d!= null) {
						lblNewLabel_2.setText(d.no +" " +d.isim );

					}
				
			}
		});
		btnEnByk.setBounds(290, 74, 89, 23);
		frame.getContentPane().add(btnEnByk);
		
		JButton btnAra = new JButton("Ara");
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int no = Integer.parseInt(textField.getText());
				Dugum5 d = A.search(no);
				
				if(d!=null) {
					lblNewLabel_2.setText(d.no +" " +d.isim );
				}
				else
					lblNewLabel_2.setText("Yoktur");
				
			}
		});
		btnAra.setBounds(290, 38, 89, 23);
		frame.getContentPane().add(btnAra);
	}
}
