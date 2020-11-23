package abstractexample;

public class AbstractExample {
  
    public static void main(String[] args) {
     Shape shape;
     shape=new Triangle(5,5);
     shape.area();
     
     shape=new Circle(10);
     shape.area();
    }
    
}
