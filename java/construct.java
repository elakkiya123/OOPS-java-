class construct{
    Sting name;
    int id;
    construct(String name){
    }
    construct( int age,int id){
        this.name=name;
        this.id=id;
System.out.println("constructor called");
    }
    public static void main(String[] args){
construct c= new construct("elakkiya",100);
construct c1=new construct(c);
System.out.println(c.name + c.id);
    }
}

