class stringfunction{
    public static void main(String[] args){
        //initialize a string
        String str1="hello world! ";
        //length of the string
        int length=str1.length();
       System.out.println(length); 
       //convert to uppercase and lower case
       System.out.println(str1.toUpperCase());
       System.out.println(str1.toLowerCase());
       //substring
       //String substring= str1.substring(3);
       System.out.println(str1.substring(5));
       //indexof and lastindexof
       System.out.println(str1.indexOf('!'));
       System.out.println(str1.lastIndexOf('l'));
       //replace
       System.out.println(str1.replace("world", "earth"));
       //trim
       String whitespace="     trim  me!  ";
       String trimmed=whitespace.trim();
       System.out.println(trimmed);
       //split
       String str="Java is a programming language";
       String[] words=str.split("");
       for(String word:words){
        System.out.println(word);
       }
       //concatenate
       String part1="hello";
       String part2="java";
       String combine= part1.concat(" ").concat(part2);
       System.out.println(combine);
       //startswith and endswith
       System.out.println(str.startsWith("java"));
       System.out.println(str.endsWith("languag"));
       
    }
}