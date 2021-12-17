package com.sky.designpatterns.adapter.example1;

public class AssignmentWork {

    private Pen pen;

    public Pen getPen() {
        return pen;
    }

    public void setPen(Pen p) {
        this.pen = p;
    }

    public void writeAssignment(String text){
        pen.write(text);
    }
}
