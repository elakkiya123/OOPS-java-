class builder{
    public static void main(String[] args){
        //creating a stringbuilder instance
        StringBuilder s=new StringBuilder();
        //Append strings
        s.append("Hello");
        s.append(",");
        s.append("java");
        s.append("programming");
        //converting stringbuilder to string
        System.out.println(s.toString());
        //insert characters at a specific index
        System.out.println(s.insert(6,"hi"));
        //replace characters
        System.out.println(s.replace(0,5,"good"));
        //delete a character
        System.out.println(s.delete(2,4));
        //reverse
        System.out.println(s.reverse());
        //geting the length and capacity
        System.out.println(s.length());
        System.out.println(s.capacity());
    }
}