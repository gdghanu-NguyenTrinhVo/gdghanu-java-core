package Generic;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

abstract class Shape {
    abstract void draw();
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Circle");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw Rectangle");
    }
}
