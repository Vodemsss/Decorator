package pattetns;

public class DeveloperDecorator implements Main{

    Main main;

    public DeveloperDecorator(Main main) {
        this.main = main;
    }

    @Override
    public String makeJob() {
        return main.makeJob();

    }
}
