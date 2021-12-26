package abstractionexample;

public class policybazar {

	public static void main(String args []) {
		
		rbi sb = new sbi();
		sb.roi();
		
		rbi ic = new icici();
		ic.roi();
		
		rbi hd = new hdfc();
		hd.roi();
	}
}
