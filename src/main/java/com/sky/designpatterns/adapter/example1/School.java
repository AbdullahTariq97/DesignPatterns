package com.sky.designpatterns.adapter.example1;

// In order to charge an iphone with samsung cable you need an adaptor between the samsumg cable and the iphone socket
public class School {
    public static void main(String[] args) {

        AssignmentWork assignmentWork = new AssignmentWork();
        PenAdaptor penAdaptor = new PenAdaptor();
        assignmentWork.setPen(penAdaptor);
        assignmentWork.writeAssignment("I'm a bit tired to write an assignment ");
    }
}
