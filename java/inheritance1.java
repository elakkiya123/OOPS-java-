//parent class or super class or base class
class animal{
     public String name;
     animal(String name){
        this.name=name;
     }
     void sound(){
        System.out.println("Animal makes different sounds");
     }
}
//child class or sub class or derived class
class dog extends animal{
    String breed;
    dog(String name,String breed){
        super(name);//call the constructor of your super class
        this.breed=breed;
    }
    void sound(){
        System.out.println("bow bow");
    }
    void fetch(){
        System.out.println("dog is trained to fetch the ball");
    }
}
public class Main{
    public static void main(String[] args){
        dog mydog= new dog("tiger ","bull dog" );
        System.out.println(mydog.name);
        mydog.sound();
        mydog.fetch();
    }
}