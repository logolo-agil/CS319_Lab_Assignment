import java.util.ArrayList;
import java.util.Collections;

public class ArrayOrganizer {
        public static void main(String[] args) {
        ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
        ArrayList1.add(100);
        ArrayList1.add(500);
        ArrayList1.add(900);
        ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
        ArrayList2.add(800);
        ArrayList2.add(600);
        ArrayList2.add(300);
        ArrayList<Integer> ArrayList3 = new ArrayList<Integer>();
        ArrayList3.add(400);
        ArrayList3.add(700);
        ArrayList3.add(200);
        System.out.println("Result =>"+concatAndSort(ArrayList1, ArrayList2, ArrayList3));
    }

    public ArrayList<Integer> concatAndSort(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3) {
        ArrayList<Integer> result = new ArrayList<>();
        result.addAll(list1);
        result.addAll(list2);
        result.addAll(list3);
        Collections.sort(result, Collections.reverseOrder());
        return result;
    }

}
