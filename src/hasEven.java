import java.util.*;


/**
 * Created by Jakob on 31-08-2016.
 */
public class hasEven {

    public static void main (String[] args) {

        Set<Integer> set= new HashSet<Integer>();
        set.addAll(Arrays.asList(9, 7, 5, 8, 11, 1, 13));


        System.out.println(hasEvens(set));

    }

    public static boolean hasEvens (Set<Integer> set){

        Iterator itr = set.iterator();

        int count = 0;

        while (itr.hasNext()){
            int temp = (Integer)itr.next();
            if(temp%2 == 0){
                count++;
            }
        }

        if(count > 0){
            return true;

        }
        else {
            return false;
        }
    }




}

