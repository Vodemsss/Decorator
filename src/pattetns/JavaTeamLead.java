package pattetns;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Main main) {
        super(main);
    }

    public String sendWeekReport(){
        return "Send week report to customer.";
    }
    @Override
    public String makeJob() {
        return super.makeJob() + sendWeekReport();
    }
}
