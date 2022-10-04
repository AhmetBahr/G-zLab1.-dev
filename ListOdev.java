import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;



public class ListOdev extends JFrame {

	 int kalan;
	 int deneme = 0;
     int i;
     int count_add;
     int istenenYer;
     int gecici;
     
     String Ogrenci = "";
     String count_add_String ;
 
     ListOdev_Ogrenci[]ogr;     

     
     
     private JPanel contentPane;
     private JTextField KeyField;
     private JTextField textField;
     private JTextField textVize;
     private JTextField textField_1;
     private JTextField textField_2;
    

public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					ListOdev frame = new ListOdev();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


public ListOdev() {
	
	kalan = 4;
    i=0;
    ogr = new ListOdev_Ogrenci[5];  
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KeyField = new JTextField();
		KeyField.setText("");
		KeyField.setBounds(10, 40, 96, 35);
		contentPane.add(KeyField);
		KeyField.setColumns(10);
		
		JButton ListeleBT = new JButton("Listele");
		ListeleBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		     
				
				
				for(int i = 0; i < 4; i++)
		        {
		            for(int j = i+1; j < 5; j++)
		            {
		                if(ogr[j].no < ogr[i].no) {
		                    gecici = ogr[i].no;
		                    ogr[i].no = ogr[j].no;
		                    ogr[j].no = gecici;
		                }
		            }
		        }
				
				for (int j = 0; j < 5; j++) { //Diziye atamak için
		            System.out.println(ogr[j]); //Diziyi yazrımak için
		           Ogrenci += j+1 + ". " + ogr[j].isim + " " + ogr[j].no + " "  + ogr[j].vize + "\n" ;//Ekrana yazrımak için
		           

		        }
				

				
	
			
			}
		});
		ListeleBT.setBounds(10, 381, 89, 23);
		contentPane.add(ListeleBT);	
		
		JButton AddBT = new JButton("Add");
		
		AddBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				if(kalan == 0) {//Eleman eklemeyi engellemek için
					AddBT.setEnabled(false);
				}
				//Ekrandaki yazıları alıp diziye atamak
		        int no=Integer.parseInt(textField.getText()); 
		        String ad=KeyField.getText();
		        int vize=Integer.parseInt(textVize.getText());		        
		        ogr[i] =new ListOdev_Ogrenci(ad, no, vize);  
		        
		        istenenYer = no;

		        
		        
		        i++;
		        kalan--;     
		        count_add++;
		     
		        count_add_String =String.valueOf(count_add);
		        System.out.println(count_add);

		        
			}
		});
		AddBT.setBounds(10, 245, 89, 23);
		contentPane.add(AddBT);
		
		JButton DeleteBT = new JButton("Delete");
		DeleteBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		DeleteBT.setBounds(10, 279, 89, 23);
		contentPane.add(DeleteBT);
		
		JButton KontrolBt = new JButton("Kontrol");
		KontrolBt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_1.setText(Ogrenci);
				textField_2.setText(count_add_String);
			
				
	
				
			  }
		});
		KontrolBt.setBounds(10, 313, 89, 23);
		contentPane.add(KontrolBt);
		
		JButton SayıBT = new JButton("Sayı");
		SayıBT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			}
		});
		SayıBT.setBounds(10, 347, 89, 23);
		contentPane.add(SayıBT);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(116, 40, 96, 35);
		
		contentPane.add(textField);
		
		
		JLabel lblNewLabel = new JLabel("İsim");
		lblNewLabel.setBounds(10, 13, 66, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblVeri = new JLabel("Numara");
		lblVeri.setBounds(116, 11, 66, 18);
		contentPane.add(lblVeri);
		
		textVize = new JTextField();
		textVize.setColumns(10);
		textVize.setBounds(222, 40, 96, 35);
		contentPane.add(textVize);
		
		JLabel lblVize = new JLabel("Vize");
		lblVize.setBounds(222, 13, 66, 18);
		contentPane.add(lblVize);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(192, 192, 192));
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setText(Ogrenci);
		textField_1.setBounds(10, 119, 386, 100);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField_2.setEnabled(false);
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBounds(300, 274, 96, 35);
		contentPane.add(textField_2);
		
		JLabel lbCount = new JLabel("Toplam Sayı");
		lbCount.setBounds(264, 245, 102, 18);
		contentPane.add(lbCount);
		   
	}
}
