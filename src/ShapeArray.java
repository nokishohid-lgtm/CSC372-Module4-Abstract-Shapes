public class ShapeArray {

    public static void main(String[] args) {

        Shape sphere = new Sphere(2.5);
        Shape cylinder = new Cylinder(2.0, 4.5);
        Shape cone = new Cone(3.5, 5.0);

        Shape[] shapeArray = {
                sphere,
                cylinder,
                cone
        };

        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
