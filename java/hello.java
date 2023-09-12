 class string{
    public static void main(String[] args){
        String message = "hello, world";  
        //String length
        int len= message.length();
        System.out.println("length of string is"+ len);
        //String concatenation
        String name= "elakkiya";
        String Title= "JFSJD";
        String Greetings="hello" +" " +name+" " + Title + " "+ "welcome";
        System.out.println(Greetings);
        //String comparision
        String Str1= "apple";
        String str2=  "Orange";
      int result= Str1.compareTo(str2);
     //Str1=equals.(str2)
System.out.println(result);
//String manipulation
String text=" java programming ";
String manipulate=text.trim();
System.out.println("manipulated data is  " + manipulate);
// String case conversion
String lowercase="elakkiya";
String uppercase="JFSJD";
System.out.println("Lowercase:" +lowercase.toUpperCase());
System.out.println("upper case:"+ uppercase.toLowerCase());
//String splitting
String spl="vineeth,usha,suraj,jgushf gjhrgj";
String[] names= spl.split(",");
//System.out.println(names);
for(String splitlm:names){
    System.out.println(splitlm);
}


    }
 } 
