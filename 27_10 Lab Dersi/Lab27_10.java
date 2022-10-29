
public class Lab27_10 {

	int maxBoyut;
	char[] yDizi;
	int top;
	
	public Lab27_10(int boyut){
		maxBoyut = boyut;
		yDizi = new char[maxBoyut];
		top = -1;
		
	}
	
	public void push(char eleman) {
		top = top +1;
		
		yDizi[top] = eleman;
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






