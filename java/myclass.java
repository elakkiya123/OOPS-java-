class rectangle {
    int l;
    int w;
    void insert(int m,int n){
l=m;
w=n;
    }
    void measure(){
     System.out.println(l*w);
    }

public static void main(String[] args){
    rectangle len= new rectangle();
    rectangle obj= new rectangle();
    obj.insert(10,12);
    obj.measure();
    len.insert(5,2);
    len.measure();
    len.insert(6,4);
    len.measure();
}}
