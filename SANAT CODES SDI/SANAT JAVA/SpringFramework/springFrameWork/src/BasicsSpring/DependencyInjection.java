package BasicsSpring;
//To over-ride tight coupling a loos coupling is needed which is known as dependency injection
class Cricket{
    int over;
    String Group_type;
    int date;
    String dayOrNight;

    public Cricket(int over, String group_type, int date) {
        this.over = over;
        Group_type = group_type;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Cricket{" +
                "over=" + over +
                ", Group_type='" + Group_type + '\'' +
                ", date=" + date +
                '}';
    }
}
class Player{
    Cricket cricket;
    String name;
    int match_played;

    public Player(Cricket cricket, String name, int match_played) {
        this.name = name;
        this.match_played = match_played;
        this.cricket=cricket;
    }

    @Override
    public String toString() {
        return "Player{" +
                "cricket=" + cricket +
                ", name='" + name + '\'' +
                ", match_played=" + match_played +
                '}';
    }
}
public class DependencyInjection {
    public static void main(String []args){
        Cricket cr = new Cricket(50,"Inter National",15);//This is known as dependency Injection.
        Player pr = new Player(cr,"Rahul",2500);
        System.out.println(pr);

    }
}
