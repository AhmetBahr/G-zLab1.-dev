public class Infix_postfix_Odev {

	  public int PostfixSonuc(String s) {
	    stack st = new stack(100);
	    int toplam = 0;
	    
	    int x = 0, y = 0;
	    char ch[] = s.toCharArray();
	 
	    
	    for(char c: ch) {
	    	
	      if(c >= '0' && c <= '9') {
	    	  
	        st.push((int)(c - '0'));
	      } else {
	        y = st.pop();
	        x = st.pop();
	        
	        switch(c) {
	          case '+':
	            st.push(x+y);
	            break;
	          case '-':
	            st.push(x-y);
	            break;
	          case '*':
	            st.push(x*y);
	            break;
	          case '/':
	            st.push(x/y);
	            break;
	        }
	      }
	    }
	    return st.pop();
	  }
	  
	  public int toplam(String s) {
		  stack st = new stack(100);
		    int toplam = 0;
		    
		    int x = 0, y = 0;
		    char ch[] = s.toCharArray();

		    for(char c: ch) {
		    	
			   if(c >= '0' && c <= '9') {
			    	 
			    st.push((int)(c - '0'));
			toplam += st.peek();
			     }
			      
			   }
		    
		  return toplam;
	  }
	  
//	h.yetis@firat.edu.tr
	  
	  
	  public String PostfixGosterim(String s) {
		stack st = new stack(100);
	    String postfix = "";
	    char ch[] = s.toCharArray();
	    
	    for(char c: ch) {
	      if(c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')') {
	        postfix = postfix + c;
	      } else if (c == '(') {
	        st.push(c);
	      } else if (c == ')') {
	        while(!st.isNull()) {
	          char t = st.pop();
	          if(t != '(') {
	            postfix = postfix + t;
	          } else {
	            break;
	          }
	        }
	      } else if(c == '+' ||c == '-' ||c == '*' ||c == '/') {
	        if(st.isNull()) {
	          st.push(c);
	        } else {
	          while(!st.isNull()) {
	            char t = st.pop();
	            if(t == '(') {
	              st.push(t);
	              break;
	            } else if(t == '+' || t == '-' || t == '*' || t == '/') {
	              if(getPriority(t) <  getPriority(c)) {
	                st.push(t);
	                break;
	              } else {
	                postfix = postfix + t;
	              }
	            }
	          }
	          st.push(c);
	        }
	      }
	    }
	    while(!st.isNull()) {
	      postfix = postfix + st.pop();
	    }
	    return postfix;
	  }
	  
	  public int getPriority(char c) {
	    if(c == '+' || c == '-') {
	      return 1;
	    } else {
	      return 2;
	    } 
	  }
	}

 class stack {

	int maxBoyut;
	char[] yDizi;
	int top;
	
	public stack(int boyut){
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


