//define your interface

//implement the interface in dog class
class dog implements Animal{
   public void sound(){
        System.out.println("bow bow");
    }
}
//implement the interface in cat class
class cat implements Animal{
    public void sound(){
        System.out.println("Meow Meow");
    }
}
 class one{
    public  static void main(String[] args){
        //create instance;
        Animal d=new dog();
        Animal c=new cat();
        c.sound();
        d.sound();
    }
}