import java.util.ArrayList;
import java.util.List;

public class ShapeObjects {
    public static void main(String[] args) {
        List<Shapes> ShapeList = new ArrayList<>();
        //double squareArea = Calculators.rectangleSquareCalc(4);
        Square square = new Square("Square", Calculators.rectangleSquareCalc(4), 4);
        Rectangle rectangle = new Rectangle("Rectangle", Calculators.rectangleSquareCalc(3, 5), 5, 3);
        Triangle triangle = new Triangle("Triangle", Calculators.triangleCalc(5, 4), 5, 4);
        Circle circle = new Circle("Circle", Calculators.circleCalc(4), 4);

        Cube cube = new Cube("Cube", Calculators.cubeAndOidCalc(4), 4);
        Cuboid cuboid = new Cuboid("Cuboid", Calculators.cubeAndOidCalc(4, 5, 3), 4, 5, 3);
        Cylinder cylinder = new Cylinder("Cylinder", Calculators.cylinderCalc(7, 3), 3, 7);
        Pyramid pyramid = new Pyramid("Pyramid", Calculators.pyramidCalc(7, 3), 3, 7);
        Sphere sphere = new Sphere("Sphere", Calculators.sphereCalc(8), 8);

        ShapeList.add(square);
        ShapeList.add(rectangle);
        ShapeList.add(triangle);
        ShapeList.add(circle);
        ShapeList.add(cube);
        ShapeList.add(cuboid);
        ShapeList.add(cylinder);
        ShapeList.add(pyramid);
        ShapeList.add(sphere);

        for(Shapes s : ShapeList){
            s.getInfo();
        }
    }
}


abstract class Shapes{
    protected String name;
    public Shapes(String name){
        this.name = name;
    }
    public void getInfo(){
    }
    public abstract double CalcAreaVol();

}

abstract class ThreeDimensionalShapes extends Shapes{
    protected double volumeCubed;

    public ThreeDimensionalShapes(String name, double volumeCubed) {
        super(name);
        this.name = name;
        this.volumeCubed = volumeCubed;
    }
    public void getInfo(){
    }
    public abstract double CalcAreaVol();
}

abstract class TwoDimensionalShapes extends Shapes{
    protected double areaSquared;

    public TwoDimensionalShapes(String name, double areaSquared) {
        super(name);
        this.name = name;
        this.areaSquared = areaSquared;
    }
    public void getInfo(){
    }
    public abstract double CalcAreaVol();
}

class Square extends TwoDimensionalShapes{
    protected double length;
    public Square(String name, double areaSquared, double length){
        super(name, areaSquared);
        this.length = length;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Area Squared: " + this.areaSquared);
        System.out.println("Length: " + this.length);
    }
    @Override
    public double CalcAreaVol() {
        return 0;
    }
}

class Rectangle extends TwoDimensionalShapes{
    protected double width;
    protected double length;
    public Rectangle(String name, double areaSquared, double width, double length){
        super(name, areaSquared);
        this.width = width;
        this.length = length;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Area Squared: " + this.areaSquared);
        System.out.println("Width: " + this.width);
        System.out.println("Length: " + this.length);
    }
    public double CalcAreaVol() {
        return 0;
    }
}

class Triangle extends TwoDimensionalShapes{
    protected double base;
    protected double height;
    public Triangle(String name, double areaSquared, double base, double height){
        super(name, areaSquared);
        this.base = base;
        this.height = height;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Area Squared: " + this.areaSquared);
        System.out.println("Base: " + this.base);
        System.out.println("Height: " + this.height);
    }
    public double CalcAreaVol() {
        return 0;
    }
}

class Circle extends TwoDimensionalShapes{
    protected double radius;
    public Circle(String name, double areaSquared, double radius){
        super(name, areaSquared);
        this.radius = radius;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Area Squared: " + this.areaSquared);
        System.out.println("Radius: " + this.radius);
    }
    public double CalcAreaVol() {
        return 0;
    }    
}

class Cube extends ThreeDimensionalShapes{
    protected double length;
    public Cube(String name, double volumeCubed, double length){
        super(name, volumeCubed);
        this.length = length;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Volume Cubed: " + this.volumeCubed);
        System.out.println("Length: " + this.length);
    }
    public double CalcAreaVol() {
        return 0;
    }    
}
class Cuboid extends ThreeDimensionalShapes{
    protected double length;
    protected double width;
    protected double height;

    public Cuboid(String name, double volumeCubed, double length, double width, double height){
        super(name, volumeCubed);
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Volume Cubed: " + this.volumeCubed);
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }
    public double CalcAreaVol() {
        return 0;
    }    
}

class Cylinder extends ThreeDimensionalShapes{
    protected double radius;
    protected double height;

    public Cylinder(String name, double volumeCubed, double radius, double height){
        super(name, volumeCubed);
        this.height = height;
        this.radius = radius;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Volume Cubed: " + this.volumeCubed);
        System.out.println("Radius: " + this.radius);
        System.out.println("Height: " + this.height);
    }
    public double CalcAreaVol() {
        return 0;
    }    
}

class Pyramid extends ThreeDimensionalShapes{
    protected double base;
    protected double height;

    public Pyramid(String name, double volumeCubed, double base, double height){
        super(name, volumeCubed);
        this.height = height;
        this.base = base;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Volume Cubed: " + this.volumeCubed);
        System.out.println("Base: " + this.base);
        System.out.println("Height: " + this.height);
    }
    public double CalcAreaVol() {
        return 0;
    }    
}

class Sphere extends ThreeDimensionalShapes{
    protected double radius;

    public Sphere(String name, double volumeCubed, double radius){
        super(name, volumeCubed);
        this.radius = radius;
    }
    public void getInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Volume Cubed: " + this.volumeCubed);
        System.out.println("Radius: " + this.radius);
    }
    public double CalcAreaVol() {
        return 0;
    }    
}


class Calculators{
    public static double rectangleSquareCalc(double length, double width){
        double area = length * width;
        return area;
    }
 
    public static double rectangleSquareCalc(double length){
        double area = length * length;
        return area;
    }

    public static double triangleCalc(double base, double height){
        double baseheight = base * height;
        double area = 0.5 * baseheight;
        return area;
    }

    public static double circleCalc(double radius){
        double radiussquared = radius * radius;
        double area = Math.PI * radiussquared;
        return area;
    }
    //3D
    public static double cubeAndOidCalc(double length, double width, double height){
        double area = length * width * height;
        return area;
    }
 
    public static double cubeAndOidCalc(double length){
        double area = length * length * length;
        return area;
    }

    public static double cylinderCalc(double height, double radius){
        double radiusheight = radius * height;
        double area = 2 * Math.PI * radius * radiusheight;
        return area;
    }

    public static double pyramidCalc(double height, double base){
        double basepower = base * base;
        double area = 0.333 * basepower * height;
        return area;
    }
    public static double sphereCalc(double radius){
        double radiuspowered = radius * radius * radius;
        double area = 1.333 * Math.PI * radiuspowered;
        return area;
    }
    public static void CalcAreaVol(){
    }
}
