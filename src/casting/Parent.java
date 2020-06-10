package casting;

public class Parent {

    public void show() {
        System.out.println("parent");
    }

    public static void showNonStatic() {
        System.out.println("parent-static");
    }
}

class Child extends Parent {
    public void show() {
        System.out.println("child");  // override a non-static method

    }

    public static void showNonStatic() {
        System.out.println("child-static");
    }

    public void childShow() {
        System.out.println("childShow");
    }
}

class Baby extends Parent {
    public void show() {
        System.out.println("baby");
    }

    public void childShow() {
        System.out.println("babyShow");
    }
}

class Test {
    public static void main(String[] args) {
        Parent parent = new Child();  //polymorphism ve show methodunu override yapti
        parent.show(); // child is output
        parent.showNonStatic();  // method hiding, static method override yapilamayacagi icin referans nerdense ordaki static methodu veriyor

        Child child = new Child();
        child.showNonStatic();  // childdakini verecek

        Parent parent1 = new Parent();

        if (parent1 instanceof Child) {
            Child c = (Child) parent1;  // down casting
            c.childShow();
        }
        int a = 9;
        int b = 10;
        System.out.println(a + b);

        Parent p = new Baby();

        Child child1 = (Child) p;
        
        child1.childShow();


    }
}