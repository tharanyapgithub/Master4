package projectbook;

import java.util.ArrayList;

public class Books {
private static String bname;
private static String aname;
private static int p;
private static int q;
private static int d;
// private String Name;
	    	
	
	public Books() {
	super();
	// TODO Auto-generated constructor stub
}


	public Books(String bname, String aname, int p, int q, int d) {
	super();
	this.bname = bname;
	this.aname = aname;
	this.p = p;
	this.q = q;
	this.d = d;
}


	public static char[] get(ArrayList<Books> friend) {
		// TODO Auto-generated method stub
		return null;
	}


	public static String getAllBname() {
		try {
			return bname;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public static String getAllAname() {
		return aname;
	}


	public void setAname(String aname) {
		this.aname = aname;
	}


	public static int getAllP() {
		try {
			return p;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}


	public void setP(int p) {
		this.p = p;
	}


	public static int getAllQ() {
		try {
			return q;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return q;
	}


	public void setQ(int q) {
		this.q = q;
	}


	public static int getAllD() {
		try {
			return d;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}
    }


