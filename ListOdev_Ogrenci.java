
public class ListOdev_Ogrenci {
	    int no;
	    String isim;
	    int vize;

	    public ListOdev_Ogrenci(String isim, int no, int vize) {
	        this.no = no;
	        this.isim = isim;
	        this.vize = vize;
	    }

	    public String toString(){
	        return isim+" "+no+" "+vize;
	        
	    }
}


