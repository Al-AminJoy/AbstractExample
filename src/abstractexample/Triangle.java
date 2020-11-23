package abstractexample;

public class Triangle extends Shape {
    Triangle(double dimn1,double dimn2){
        super(dimn1,dimn2);
    }
     @Override
    void area(){
        double area=0.5*dimen1*dimen2;
        System.out.println("Triangle Area : "+area);
    }
}
