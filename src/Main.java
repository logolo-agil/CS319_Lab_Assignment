import java.util.ArrayList;

public class Main {
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
        System.out.println("Result =>" + ArrayOrganizer.concatAndSort(ArrayList1, ArrayList2, ArrayList3));

        Player Tom = new Player("Tom");
        Player John = new Player("John");
        Player James = new Player("James");
        Player Henry = new Player("Henry");
        Die die = new Die();
        for(int i = 0; i<5; i++){
            Tom.addScore(Die.rollDie());
            John.addScore(Die.rollDie());
            James.addScore(Die.rollDie());
            Henry.addScore(Die.rollDie());
        }
        System.out.println(Tom);
        System.out.println(John);
        System.out.println(James);
        System.out.println(Henry);


    }
}