package src;

public interface Shape<T> {
    //returns runtime/dynamic object type
    default  Class<? extends Shape<T>> ShapeName() {
        return (Class<? extends Shape<T>>) this.getClass();
    }
    // return the Area of the shape
    public double ShapeArea();
    // return the Perimeter of the shape
    public double ShapePerimeter();
    
}
