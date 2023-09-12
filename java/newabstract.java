abstract class animal{
    private String name;
    animal(String name){
        this.name=name;
    }
    public String getname(){
        return name;
    }
    //abstract method
    abstract void makesound();
    }
//concrete subclasses
class dog1 extends animal{
   public dog1(String name){
        super(name);
    }
    void makesound(){
        System.out.println(getname()+"bow bow");
    }
}
class cat1 extends animal{
    public cat1(String name){
        super(name);
    }
    void makesound(){
        System.out.println(getname()+"Meow Meow");
    }
}
class m{
    public static void main(String[] args){
animal d=new dog1("tiger");
animal e=new cat1("Angel");
d.makesound();
e.makesound();
    }
}