package ss4_classes_and_objects_in_java.practice.rectangle_class;

public class Rectangle_class {
    double width, height;

    public Rectangle_class(double width,double height){
        this.width = width;
        this.height = height;
    }
    public double Area(){
        return this.width * this.height;
    }
    public double getPerimeter(){
        return (this.height + this.height)/2;
    }
    public String display(){
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

}
