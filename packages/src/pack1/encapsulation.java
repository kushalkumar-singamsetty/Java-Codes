package pack1;//encapsulation is binding the variables and methods in a single class 
//encapsulation is done by using private keyword  we can access this class in another class
//by creating getter and setter methods to variable

public class encapsulation  {
	private int n;
	private String k;
	public void setval(int n) {
		this.n=n;
	}
	public int getval() {
		return n;
	}
	public void setname(String k) {
		this.k=k;
	}
	public String getname() {
		return k;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	}

}
