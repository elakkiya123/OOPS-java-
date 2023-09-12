class animal{
   public void sound(){
        System.out.println("Animal makes different sounds");

    }
}
class dog extends animal{
   public void sound(){
     System.out.println("bow bow");   
    }
}
class cat extends animal{
   public void sound(){
        System.out.println("meow meow");
    }
} 
class poly{
    public static void main(String[] args){
        animal a=new dog();//animal a=new animal();
        animal b=new cat();
        animal c=new animal(); 
        a.sound();//calls dog class
        b.sound();//calls cat class
        c.sound();
    }
}