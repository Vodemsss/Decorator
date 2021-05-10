package pattetns;

public class Task {
    public static void main(String[] args) {
        Main main = new JavaTeamLead(new SeniorJavaDeveloper (new JavaDeveloper()));

       System.out.println(main.makeJob());

    }
}
