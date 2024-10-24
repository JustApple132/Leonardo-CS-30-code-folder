public class GeometryRunner {

    double length;
    double width;
    double PerimeterAnswer;
    double side;
    double SurfaceAreaAnswer;
    double radius;
    double AreaCircleAnswer;

    public void PerimeterRectangle(double length, double width) {
        PerimeterAnswer = 2 *(length + width);
        System.out.println(PerimeterAnswer);
    }
    public void SurfaceAreaCube(double side) {
        SurfaceAreaAnswer = 6 *(side*side);
        System.out.println(SurfaceAreaAnswer);
    }
    public void AreaCircle(double radius) {
        AreaCircleAnswer = Math.PI*(radius*radius);
        System.out.println(AreaCircleAnswer);
    }

}
