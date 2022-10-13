
public class Lab13_10 {	
	Dugum bas;	
	public Lab13_10() {
		bas = null;
	}	
	void basEkle(Dugum yeni) {
		if(bas ==null) {
			bas = yeni;
		}
		else {
			yeni.ileri= bas;
			bas = yeni;
		}		
	}
	void sonaEkle(Dugum yeni) {
		if(bas == null)
		{
			bas = yeni;
		}
		else {
			Dugum tmp = bas;
		
		while(tmp.ileri != null) {
			tmp = tmp.ileri;
		}
		
		tmp.ileri = yeni;
		
		}
	}
	void sıralıEkle(Dugum yeni) {
		Dugum tmp ;
		
		if(bas == null || bas.no >= yeni.no ) {
			yeni.ileri = bas;
			bas = yeni;
		}
		else {
			tmp=bas;
			
			while(tmp.ileri !=null  && tmp.ileri.no < yeni.no) {
				tmp = tmp.ileri;
			}
			
			yeni.ileri = tmp.ileri;
			tmp.ileri = yeni;
			
		}
	}
	void bastanSil() {
		if(bas != null) {
			bas = bas.ileri;
		}
	}
	void sil(int no ) {
		Dugum tmp = bas,onece = null;
		
		if(tmp != null && tmp.no == no) {
			bas = bas.ileri;
			return ;
		}
		while(tmp != null && tmp.no != no) {
			onece = tmp;
			tmp = tmp.ileri;
		}
		if(tmp == null)
			return ;
		onece.ileri = tmp.ileri;
		
	}
	String Listele() {
		String S = "";
		Dugum tmp = bas;
		while(tmp != null) {
			S += tmp.no + " - " + tmp.isim + " ->";
			tmp = tmp.ileri;
		}
		return S;	
	}
}
class Dugum{
	int no;
	String isim;
	Dugum ileri;
	Dugum(int no,String isim){
		this.no = no;
		this.isim = isim;
		ileri = null;
	}
	
}