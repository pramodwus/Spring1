package pack1.business;

public class ProductImpl implements Product {

	public void add(int x, int y) {
		System.out.println("Addition ="+(x+y));
	}

	public int multiply(int x, int y) {
		
		return (x*y);
	}

}
