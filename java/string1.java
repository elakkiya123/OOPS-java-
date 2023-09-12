class stringone{
public static void main(String[] args){
    //initialize a string
    String str=" Hello world! ";
    //length of the string
    System.out.println(str.length());
    //convert uppercase and lowercase
   System.out.println(str.toUpperCase()); 
   System.out.println(str.toLowerCase());
   //substring
   System.out.println(str.substring(5));  
   //indexof and lastindexof
   System.out.println(str.indexOf("o"));
   System.out.println(str.lastIndexOf("o"));
   //replace
   System.out.println(str.replace("Hello", "hi"));
   //trim
   System.out.println(str.trim());
   
}
}