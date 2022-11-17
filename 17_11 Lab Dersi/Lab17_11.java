
public class Lab17_11 {

	Dugum5 kok;
	Lab17_11(){
		kok = null;
	}
	
	
	void addItem(Dugum5 yeni) {
		Dugum5 once = null;
		Dugum5 tmp = kok;
		while(tmp!=null) {
			once = tmp;
			if(yeni.no <tmp.no) {
				tmp = tmp.sol;
			}
			else {
				tmp = tmp.sag;
			}
		}
		if(once == null)
			kok = yeni;
		else if(yeni.no<once.no) 
			once.sol = yeni;
		else
			once.sag = yeni;
		
	}
	
	Dugum5 search(int no) {
		Dugum5 tmp = kok;
		
		while(tmp!=null) {
			if(tmp.no ==no)
				return tmp;
			else if(no<tmp.no)
				tmp=tmp.sol;
			else
				tmp = tmp.sag;
					
		}
		return null;
		
	}
	
	Dugum5 enBuyuk() {
		Dugum5 tmp = kok;
		while(tmp.sag!= null) {
			tmp = tmp.sag;
		}
		return tmp;
	}
	
	Dugum5 enKucuk() {
		Dugum5 tmp = kok;
		while(tmp.sol!= null) {
			tmp = tmp.sol;
		}
		return tmp;
	}
	
	boolean yaprakSil(int no) {
		Dugum5 tmp = kok,once = null;
	
		if(kok==null) return false;
		while(tmp.no!=no) {
			once = tmp;
			if(no<tmp.no)
				tmp=tmp.sol;
			else
				tmp=tmp.sag;
			if(tmp==null)
				return false;
		}
	
		if(tmp.sol == null && tmp.sag==null) {
			if(tmp ==kok)
				kok=null;
			else if(once.no > tmp.no)
				once.sol = null;
			else
				once.sag = null;
			return true;
		}
		else
			return false;
	}
	
	void inOrder(Dugum5 tmp) {
		if(tmp == null)
			return;
		inOrder(tmp.sol);
		System.out.println(tmp.no + " " + tmp.isim);
		inOrder(tmp.sag);
		
	}
	
	
	
}




class Dugum5{
	int no;
	String isim;
	Dugum5 sol,sag;
	Dugum5(String isim,int no){
		this.no = no;
		this.isim = isim;
		sol = null;
		sag = null;
	}
}

