import java.lang.*; 
public class Die{

    public static int rollDie(){
        return (int) (Math.random() * 6) + 1;
    }
}