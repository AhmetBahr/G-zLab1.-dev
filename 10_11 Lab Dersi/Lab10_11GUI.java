import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lab10_11GUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	public Lab10_11 lab10_11;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lab10_11GUI window = new Lab10_11GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Lab10_11GUI() {
		lab10_11 = new Lab10_11(300);
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 660, 438);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 31, 191, 41);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 97, 191, 41);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setBounds(10, 156, 479, 200);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k = textField.getText();
				String a = textField_1.getText();
				lab10_11.Ekle(k, a);
				lab10_11.printHash();
			}
		});
		btnNewButton.setBounds(238, 31, 115, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAra = new JButton("Ara");
		btnAra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = textField.getText();
				String sonuc = lab10_11.get(s);
				if(sonuc != null)
					textField_1.setText(sonuc);
				
			}
		});
		btnAra.setBounds(238, 97, 115, 41);
		frame.getContentPane().add(btnAra);
		
		JButton btnSi = new JButton("Sil");
		btnSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String k = textField.getText();
				lab10_11.sil(k);
				lab10_11.printHash();
				
			}
		});
		btnSi.setBounds(388, 31, 115, 41);
		frame.getContentPane().add(btnSi);
	}
}
