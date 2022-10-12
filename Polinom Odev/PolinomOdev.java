
public class PolinomOdev {
	Liste bas,son;
	public PolinomOdev(){

		bas = null;
		son = null;
	}
	public void PolinomSırala(Liste yeni) {	
		// Gelen liste elemanlarını dereceelerine göre sıralı bir şekilde tutmak için
		Liste tmp,tmp2;
		if (bas == null || bas.derece <= yeni.derece) {
		yeni.ileri = bas;
		bas = yeni;
		}
		else {
		tmp = bas;
		while (tmp.ileri != null && tmp.ileri.derece > yeni.derece) {
		tmp = tmp.ileri;
		}
		yeni.ileri = tmp.ileri;
		tmp.ileri = yeni;
		}
		System.out.println();
	}
	String Yazdır() {	
		//tutulan listeyi String hale getirmek için
		Liste tmp = bas;
		String S = " ";
		while(tmp != null) { 
			S +=  tmp.katsayi + "X^" + tmp.derece + " + " ;
			tmp = tmp.ileri;
		}	
		return S;
	  }
	int Hesaplama(int deger) {
		//Girilen polinom ile int şekilde işlem yapmak için 
		Liste tmp = bas;  
		int islem = 0;
		while(tmp != null) {
			double degerr = Math.pow(deger, tmp.derece);
			islem +=  tmp.katsayi * degerr ;
			tmp = tmp.ileri;
		}	
		return islem;	
	}
}
class Liste{//Programda kullandığımız liste classı 
	int katsayi,derece;
	Liste ileri;
	Liste(int katsayi,int derece){
		this.katsayi = katsayi;
		this.derece = derece;
		ileri = null;
	}
}


	
	
	
	

