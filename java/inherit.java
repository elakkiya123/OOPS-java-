//base classor super class or parent class
class animal{
    String name;
    animal(String name){
        this.name=name;
    }
    void makesound(){
        System.out.println("Animal makes different sounds");
    }
}
//derived class or child class or sub class
class dog extends animal{
    String breed;
    dog(String name,String breed){
        super(name);
        this.breed=breed;}
        void makesound(){
            System.out.println("Bow bow");
        }
        void fetch(){
            System.out.println("dog is trained to fetch the ball");
        }
        
    }
public class d{
    public static void main(String[] args){
        dog d= new dog("Julie","Golden Retriever");
        d.makesound();
        d.fetch();
    }
}