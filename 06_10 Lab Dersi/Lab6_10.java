import java.util.*;


public class Lab6_10 {

	Eleman bas,son;
	
	
	Lab6_10(){
		bas = null;
		son = null;
	}
	
public void basaEkle(Eleman yeni) {
		if(son == null) {
			bas = yeni;
			son = yeni;
		}
		else {
			yeni.ileri=bas;
			bas=yeni;
		}
	
	
	}
	void sonaEkle(Eleman yeni) {
		if(bas == null) {
			bas = yeni;
			son = yeni;
		}
		else {
			son.ileri=yeni;
			son=yeni;
		}
	
	
	}
String Listele() {
	
	Eleman tmp = bas;
	String S = " ";

	while(tmp != null) {
		S += " ->" +tmp.icerik;
		tmp = tmp.ileri;

	}
	
	return S;
  }


int elemanAra(int aranan) {
	int x;
	Eleman tmp = bas;
	int i=1;
	
	
	while(tmp != null) {
		if(tmp.icerik == aranan)
			return i;
		tmp = tmp.ileri;
		i++;
	}
	return -1;
}

}

class Eleman{
	int icerik;
	
	Eleman ileri;
	
	Eleman(int icerik){
		this.icerik= icerik;
		ileri = null;
	}
	
}