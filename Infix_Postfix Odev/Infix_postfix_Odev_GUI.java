import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Infix_postfix_Odev_GUI {

	private JFrame frame;
	private JTextField textField;
	Infix_postfix_Odev odev;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Infix_postfix_Odev_GUI window = new Infix_postfix_Odev_GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public Infix_postfix_Odev_GUI() {
		odev = new Infix_postfix_Odev();
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 448);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		
		textField = new JTextField();
		textField.setBounds(21, 32, 227, 68);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel(":");
		lblNewLabel.setBounds(21, 151, 368, 100);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Stack içi");
		lblNewLabel_1.setBounds(21, 111, 138, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Sonuc");
		lblNewLabel_1_1.setBounds(21, 262, 138, 29);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel(":");
		lblNewLabel_2.setBounds(21, 302, 368, 100);
		frame.getContentPane().add(lblNewLabel_2);
		
		
		JButton btnNewButton = new JButton("Sonuc");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String girdi = textField.getText();
				
				Infix_postfix_Odev st = new Infix_postfix_Odev();
				
				String infix = st.PostfixGosterim(girdi);
				
				
				int sonucInt = st.PostfixSonuc(infix);
				String sonucStr = Integer.toString(sonucInt);
				
				lblNewLabel.setText(st.PostfixGosterim(girdi));
				lblNewLabel_2.setText(sonucStr);
				
			}
		});
		btnNewButton.setBounds(346, 29, 175, 74);
		frame.getContentPane().add(btnNewButton);
		
	}
}
