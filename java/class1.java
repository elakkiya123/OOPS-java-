class car{
String name;
String engine;
 String colour;
  int model;
void displaydetails(){
    System.out.println("Car name is:"+ name);
    System.out.println("engine name is:"+ engine);
    System.out.println("colour of car is:"+ colour);
    System.out.println("model of car:"+ model);

}

public static void main(String[] args){
    //create an object(instance) of the car class
    //classname create objectname= new classname(); 
    car test = new car();
    test.name="BMW";
    test.engine="Desel";
    test.colour="black";
    test.model=2020;
    test.displaydetails();//fn calling
    
}
}