package Lession3;

public class Rectangle {
    double width,height;

    public Rectangle(){
     this.width = width;
     this.height = height;
    }
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return this.width *this.height;
    }
    public double getPerimeter(){
        return (this.width +this.height) *2;
    }
    public String display(){
        return  "Rectangle{Width="+ this.width + ", height=" +this.height + "}";
    }


}
