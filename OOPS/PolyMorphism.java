package OOPS;

public class PolyMorphism {
    public static class Dog{
        void speak(){
            System.out.println("bhow bhow");
        }
    }
    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }
    }
    public static class Pickachu{
        void speak(){
            System.out.println("pika pika");
        }
    }
    public static class Human{
        void speak(){
            System.out.println("hello");
        }
    }
    public static void main(String[] args){
           Dog d=new Dog();
           Cat c=new Cat();
           Pickachu p=new Pickachu();
           Human h=new Human();
         d.speak();
         c.speak();
         p.speak();
         h.speak();
    }
}
