package pattetns;

public class SeniorJavaDeveloper extends DeveloperDecorator {

    public SeniorJavaDeveloper(Main main) {
        super(main);
    }

    public String makeCodeReview(){
        return "Make code review.";

    }

    @Override
    public String makeJob() {
        return super.makeJob() + makeCodeReview();
    }
}
