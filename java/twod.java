import java.util.ArrayList;
 class twod{
    public static void main(string[] args){
        ArrayList<ArrayList<Integer>> t=new ArrayList<>();
       //Add rows to the arraylist
       t.add(new ArrayList<>());//row 0
       t.add(new ArrayList<>());//row 1
       t.add(new ArrayList<>());//row 2
       //add elements to the row
       t.get(0).add(1);
       t.get(0).add(2);
       t.get(0).add(3);

       t.get(1).add(4);
       t.get(1).add(5);
       t.get(1).add(6);

       t.get(2).add(7);
       t.get(2).add(8);
       t.get(2).add(9);
       //accessing the 2d arraylist
       int element=t.get(1).get(1);
       System.out.println(element);

    }
}