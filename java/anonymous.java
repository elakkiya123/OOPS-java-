class calculation{
    void add(int n){
        int add=1;
        for(int i=1;i<=n;i++){
            add=add*i;
        }
        System.out.println("factorial is"+add);
    }
    public static void main(String[] args){
        //classname objectname=new classname();
                new calculation().add(6);
        
    }
}