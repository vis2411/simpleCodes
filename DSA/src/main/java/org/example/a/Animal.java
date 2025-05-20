package org.example.a;

class Animal {
    public void m1(Animal animal){
        System.out.println("animal");
    }
}
class Monkey extends Animal{
    public void m1(Monkey monkey){
        System.out.println("monkey");
    }

}

class Test{
    public static void main(String[] args) {
       Animal animal = new Animal();
       animal.m1(animal);

       Monkey monkey = new Monkey();
       monkey.m1(monkey);

       Animal animal1 = new Monkey();
       animal1.m1(monkey);

    }
}
