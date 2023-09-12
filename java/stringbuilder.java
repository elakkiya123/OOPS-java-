 class builder{
    public static void main(String[] args){
        //creating stringbuilder instance
        StringBuilder s= new StringBuilder();
        //Appending string
        s.append("Hello");
        s.append("java");
        s.append("programming");
        s.append("hi");
//conver stringbuilder to string
String result=s.toString();
        System.out.println(result);
        //insert characters at a specific index
        System.out.println(s.insert(7,"good"));
        //replacing characters
        System.out.println(s.replace(0,4,"hi"));
        //deleting characters
        System.out.println(s.delete(0,4));
        //reversing the string
        System.out.println(s.reverse());
        //getting length and capacity
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}


