package abstractexample;

public class Circle extends Shape{
    Circle(double dimn){
        super(dimn,dimn);
    }
    @Override
    void area(){
        double area=Math.PI*Math.pow(dimen1, 2);
        System.out.println("Circle Area : "+area);
    }
}
