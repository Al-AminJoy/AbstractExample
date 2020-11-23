package abstractexample;

public abstract class Shape {
    double dimen1,dimen2;
    Shape(double dimen1,double dimen2){
        this.dimen1=dimen1;
        this.dimen2=dimen2;
    }
    abstract void area();
}
