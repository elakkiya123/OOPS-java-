public class person{
    private String name;
   private int age;
    //constructor
    public person(String name,int age){
        this.name=name;
        this.age=age;
    }
     public person(person other){
        this.name=other.name;
        this.age=other.age;
    }
public String getname(){
    return name;
}
public int getage(){
    return age;
}
}
 class main{
 public static void main(String[] args)
 {
    person person1=new person("elakkiya",29);
    person person2=new person(person1);//using copy constructor
System.out.println("1person="+ person1.getname()+person1.getage());
System.out.println("2person="+ person2.getname()+person2.getage()); 
}
}