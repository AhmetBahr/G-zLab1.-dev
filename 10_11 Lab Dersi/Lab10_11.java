
public class Lab10_11 {

	int gboyut,maxboyut;
	String[] keys,values;
	
	public Lab10_11(int maxboyut) {
		this.maxboyut=maxboyut;
		gboyut=0;
		keys=new String[maxboyut];
		values=new String[maxboyut];
		
	}
	
	boolean doluMu() {
		return gboyut==maxboyut;
	}
	boolean bosMu() {
		return gboyut==0;
	}
	int hash(String key) {
		return key.hashCode() % maxboyut;
	}
	
	void Ekle(String key, String value) {
		int tmp=hash(key);
		//System.out.println(hash(key));
		int i=tmp;
		do {
			if(keys[i] == null) {
				keys[i] = key;
				values[i] = value;
				gboyut++;
				return;
			}
			if(key.equals(keys[i])) {
				values[i] = value;
				return;
			}
			i= (i+1)%maxboyut;
		}
		while(i != tmp);
}
	
	String get(String key) {
		int i=hash(key);
		while(keys[i] != null) {
			if(keys[i].equals(key)) {
				return values[i];
			}
			i = (i+1)%maxboyut;
		}
		return null;
	}
	
	void sil(String key) {
		if(get(key) == null)
			return;	
		else {
			int i=hash(key);
			while(!key.equals(keys[i]))
				i = (i+1 )% maxboyut;
			keys[i] = values[i] = null;
			for(i = (i+1) % maxboyut; keys[i] != null; i= (i+1) % maxboyut) {      // hashi düzenliyor
				String tmp1 = keys[i],tmp2 = values[i];
				keys[i] = values[i] = null;
				gboyut--;
			}
		}
	}
	
	void printHash() {
		System.out.println("Hash Tablosu");
		for(int i=0; i<keys.length;i++) {
			if(keys[i] != null)
				System.out.println(i + "->" + keys[i] + "-" + values[i]);
		}
		System.out.println("");
	}
	
}
