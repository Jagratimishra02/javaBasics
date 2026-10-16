// polymorphism : many forms
public class Polymorphism {
    public static class Dog{                          //  class
        void speak(){                                 // methods inside the class 
            System.out.println("bhau bhau");          // work
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("hii");
        }
    }
    public static class Lion{
        void speak(){
            System.out.println("grr");
        }
    }
    public static void main(String[] args) {
        Dog tommy = new Dog();
        Cat kitty = new Cat();
        Human krapansh = new Human();
        Lion coco = new Lion();

        // all class contain a method having same name but had different work this is polymorphism.
        krapansh.speak();
        kitty.speak();
        tommy.speak();
        coco.speak();
    }
}
