import java.util.ArrayList;
 public class twod1{
public static void main(String[] args){
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
       int element=t.get(2).get(2);
       System.out.println(element);
       //iterting 2d arraylist
       for(ArrayList<Integer> row: t){
        for(int num:row){
            System.out.println(num);
        }
        System.out.println();
       }

    }
}