import java.util.Scanner;
class exceptionHandling{
    public static void main(String[] args)
{
Scanner a=new Scanner(System.in);
System.out.println("Enter a number:"); 
try{
    int number= a.nextInt();
    if(number==0){
       int result=0;
       System.out.println("the value is zero"+result);
    }else{
        int result= number/0;//catch block will be called
    } 
}catch(ArithmeticException b ){
    System.out.println("Error Division by 0 is not allowed");
}catch(Exception b){
    System.out.println("unexcepted error is occured");
}
finally{
    a.close();
    System.out.println("scanner closed");
}
System.out.println("Program gets continued");
}}
