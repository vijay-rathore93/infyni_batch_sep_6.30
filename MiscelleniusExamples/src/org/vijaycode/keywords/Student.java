package org.vijaycode.keywords;

/*public class Student extends FinalClass{*/ // can not be inherited

public class Student {

    private final String NAME;

    public Student(String name) {
        this.NAME = name;
    }

    public String getName() {
        return NAME;
    }

    public final void show(){
        System.out.println("++++++++");
    }


}
