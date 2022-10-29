import java.util.Scanner;

public class Lab27_10Main {

	public static void main(String args[]) {

		
		
		
		
	}
	
	
	public static void tersYaz(String ifade) {
		Lab27_10 lab = new Lab27_10(5);
		
		char [] yeniDizi = ifade.toCharArray();
		
		for(int i=0;i<yeniDizi.length;i++) {
			lab.push(ifade.charAt(i));
		}
		
		while(!lab.isNull()) {
			//System.out.println(lab.pop());
		System.out.println(lab.peek());
		}
		
	}
	
	static boolean operantMi(char eleman) {
		
		if((eleman >= 'a' && eleman <='z')||(eleman >= 'A' && eleman <='Z')) {
			
			return true;
		}else
		{
	
		return false; 
		}
	}
	
	static boolean operator(char eleman) {
		
		return (eleman == '+' || 
				eleman == '-' ||
				eleman == '*' ||
				eleman == '/' ||
				eleman == '^' );
		
	}
	
	static int oncelikSirasi(char eleman){
		int oncelik = -1;
		if(eleman == '+' || eleman == '-') {
			oncelik = 1;
		}
		else if (eleman == '*' || eleman == '/') {
			oncelik = 2;
		}
		else if(eleman == '^') {
			oncelik = 3;
		}
		
		return oncelik;
	}
		
	public static boolean parantezKont(String ifade) {
		boolean isValid = true;
		Lab27_10 lab = new Lab27_10(10);

		for(int i=0;i<ifade.length();i++ ) {
			char k = ifade.charAt(i);
			if(k == '('|| k == '[' || k == '{' ) {
				lab.push(k);
			}
			else if ( k == ')'|| k == ']' || k == '}' ) {
				char yigitPop = lab.pop();
				if(k == ')' && yigitPop != '(' || k == ']' && yigitPop != '[' || k == '}' && yigitPop != '{'  ) {
					isValid = false;
				}
			}
			
		}
		if(!lab.isNull()) {
			isValid = false;
		}
		return isValid;
	}
	
	public static String infix2postfix(String ifade) {
		String S = "";
		Lab27_10 lab = new Lab27_10(13);
		
		for(int i=0;i<ifade.length();i++) {
			if(operantMi(ifade.charAt(i))) {
				S = S + ifade.charAt(i);
			}
			else if(ifade.charAt(i) == '(') {
				lab.push(ifade.charAt(i));
			}			
			else if(ifade.charAt(i) == ')') {
				while(!lab.isNull() && lab.peek() != '(') {
					S = S+ lab.pop();
				}
				if(!lab.isNull()) {
					if(lab.peek() != '(') 
						return null;
					
					lab.pop();
				}
			}
			else if (operator(ifade.charAt(i))) {
				if(oncelikSirasi(ifade.charAt(i)) < oncelikSirasi(lab.peek())) {
					S = S+ lab.pop();
				}
				lab.push(ifade.charAt(i));
			}
			
		}
		while(!lab.isNull()) {
			S = S+ lab.pop();
		}
		
		
		return S;
	}

	
}
