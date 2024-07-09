
public class Area {
	
	int length;
	int breadth;
	
	void setDim(int l, int b) {
		this.length = l;
		this.breadth = b;
	}
	
	int getArea() {
		return this.length * this.breadth;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Area area1 = new Area();
	    area1.setDim(8,4);
	    System.out.printf("Area of rectangle with length %d and breadth %d is %d", area1.length, area1.breadth, area1.getArea());

	}

}
