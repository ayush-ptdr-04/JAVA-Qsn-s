

public class oops {
    public static void main(String[] args) {
        // Laporde l1 = new Laporde();
        // l1.run();
        // Python p1 = new Python();
        // p1.blackMagic();
        Beer b1 = new Beer();
        b1.eatVeg();
        b1.eatNonVeg();
    }
}

interface herbivore{
   public void eatVeg();
}

interface carnivore{
   public void eatNonVeg();
}

class Beer implements herbivore, carnivore{
public void eatVeg(){
    System.out.println("Beer easts veg");
}
public void eatNonVeg(){
    System.out.println("Beer eats non veg");
}
}

//base class
class Animal{
String name;
int maxAge;
    void sound(){
        System.out.println("Animal makes sound");
    }
}

//Derived class
class Dog extends Animal{
    void ability(){
        System.out.println("Dog can find thing using deep smell");
    }
}

// Derived class
class Laporde extends Dog{
    void run(){
        System.out.println("laporde can run fast");
    }
}

// Derived class2
class Cat extends Animal{
    void blackMagic(){
        System.out.println("people can not cross the  line");
    }
}
//Derive class2
class Python extends Cat{
    void poison(){
        System.out.println("Python produce poistion");
    }
}