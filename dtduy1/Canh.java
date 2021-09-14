package dtduy1;

public class Canh {
	private int x1,x2,y1,y2;
	public Canh(int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public double length() {
		double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		return d;
	}
	public void setX1(int x1) {
		this.x1 = x1;
	}
	public float getX1() {
		return this.x1;
	}
	public void setX2(int x2) {
		this.x2 = x2;
	}
	public float getX2() {
		return this.x2;
	}
	public void setY1(int y1) {
		this.y1 = y1;
	}
	public float getY1() {
		return this.y1;
	}
	public void setY2(int y2) {
		this.y2 = y2;
	}
	public float getY2() {
		return this.y2;
	}
}
