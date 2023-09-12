class number{//parent super base
    int a,b;
number(int a,int b){
    this.a=a;
    this.b=b;
}
void add(int a,int b)
{
   
    int c;
    System.out.println("addition of to numbers"+ (c=a+b));
}
}
// child sub derived
class num extends number{
    int c;
    num(int a,int b){
        super(a,b);   
    }
    void add(){
System.out.println("repeating");
    }
    void sub(){
        int c=a-b;
        System.out.println("the subraction of two numbers "+ c);
    }
}
 class Main{
    public static void main(String[] args){
        //object creation
        num ob = new num(6,8);
        ob.add();
        ob.sub();
    }
 }