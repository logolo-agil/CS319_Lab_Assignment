
public class Player {
    private int score;
    private String name;


    public Player(String name){
        this.name = name;
        this.score = 0;
    }

    public String getName(){
        return name;
    }

    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }

    public void addScore(int point){
        this.score += point;

    }
    public String toString(){
        return name+" has "+score+" points.";
    }
}