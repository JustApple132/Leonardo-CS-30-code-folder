public class AreaTriangleRunner{

    int a, b, c;
	double perimeter;
    double s;
	double area;

    public AreaTriangleRunner()
	{
	   setSides(0,0,0);
	   perimeter = 0;
	   area = 0;
	}

    public void setSides(int tempa, int tempb, int tempc) {
		a = tempa;
		b = tempb;
		c = tempc;
    }

    public void calcPerimeter() {
		perimeter = a + b + c;
		s = perimeter/2;
	}

	public void calcArea() {
		area = Math.sqrt(s*(s - a)*(s - b)*(s - c));
	}

	public void print() {
		System.out.print("The area of the triangle is " + area);
	}

}
