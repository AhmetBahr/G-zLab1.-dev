
public class Palindrom_Odevi {

	public static void main(String args []) {
		Karsilastir("kek");
		Karsilastir("tenet");
		Karsilastir("Odev");
		
	}
	
	public static void Karsilastir(String s) {
		kuyruk k2 = new kuyruk(25); 
		stack2 s2 = new stack2(25);
		boolean isPalindrom = false;
		
		
		for(int i=0 ; i<s.length();++i) {            //  ---------0-------- 	Kuyruğa eleman eklendi
			k2.push(s.charAt(i));
		
		}			
	
	/*	while(!k2.isNull()) {							//  ---------0-------- 	kuyruğu ekrana yazmak için
			System.out.println(k2.pop()); 
		}*/
		
		
		for(int i=0 ; i<s.length();++i) {            //  ---------0-------- 	Yığıta eleman eklendi
			s2.push(s.charAt(i));
		
		}		
		
	/*	while(!s2.isNull()) {					//  ---------0-------- 	Stack ekrana yazmak için
			System.out.println(s2.pop());
		}
		*/

		while(!s2.isNull()) {	
			if(k2.pop() == s2.pop()) {
				isPalindrom = true;
			}
			else {
				isPalindrom = false;
				break;
			}
		}
		System.out.println( s + " Palindrom mu? " + isPalindrom);
	}

}
		

class kuyruk{
	int maxBoyut;
	char[] kDizi;
	private int bas;
	private int son;
	private int elemanSayisi;

	
	public kuyruk(int boyut){
		maxBoyut = boyut;
		kDizi = new char[maxBoyut];
		elemanSayisi = 0;
		
	}
	public void push(int i) {
		if(son == maxBoyut) son = 0;
		kDizi[son++] = (char) i;
		elemanSayisi++;
	}
	
	public char pop() {
		int temp = kDizi[bas++];
		if(bas == maxBoyut)bas =0;
		elemanSayisi--;
		
		return (char) temp;
	}
	
	public char peek() {
		return kDizi[bas];
	}
	
	public boolean isNull() {	
		return (elemanSayisi == 0);
	}

	
}

class stack2 {

	int maxBoyut;
	char[] yDizi;
	int top;
	
	public stack2(int boyut){
		maxBoyut = boyut;
		yDizi = new char[maxBoyut];
		top = -1;
		
	}
	public void push(int i) {
		top = top +1;
		
		yDizi[top] = (char) i;
	}
	
	public char pop() {
		return yDizi[top--];
	}
	
	public char peek() {
		return yDizi[top];
	}
	
	public boolean isNull() {	
		return top == -1;
	}


}