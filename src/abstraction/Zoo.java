package abstraction;

public class Zoo {
    public static void main(String[] args) {
        // sol taraf reference sag taraf da obje
        // referans animaldan ama object catten

        /*
        memory
        ref animal --- > Lion

        ref cat ---> cat


         */
        // Animal animal= new Animal();
        Animal animal = new Cat();

        Cat cat=new Lion("Jo",4);
        cat.sound();
//        Animal animal1=new Dog("karabas",4);
//        animal1.eat();

//        Lion lion=new Dog("hhh",4);
//        lion.eat();  // bones
//        lion.sound(); // woof woof

        Lion l1=new Lion("www",4);
        l1.sound(); //roar
        l1.eat();  // deer









    }

    }