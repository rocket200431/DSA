public class Abstraction {
    public static void main(String[] args) {
        Horse horsy=new Horse();
        horsy.colour();
        
    }
    
}


abstract class Animal{

    Animal(){
        System.out.println("animal construtor is called");
    }
   void colour(){
        System.out.println("colour is brown of most of animal");
    }
    abstract void walk();

    
}

class Horse extends Animal{

    Horse(){
        System.out.println("horse construtor is called");
    }
    void  colour(){
        System.out.println("colour is biscuit of most of horse");
    

    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class Hen extends Animal{

    
    Hen(){
        System.out.println("hen construtor is called");
    }
    void  colour(){
        System.out.println("colour is yellow of most of hen");
    

    }
    void walk(){
        System.out.println("walks on two legs");
    }
}