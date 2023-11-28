package lesson31.hw3;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Developer junior = new JuniorDeveloper();
        System.out.println("Junior: " + junior.develop());

        Developer middle = new MiddleDeveloperDecorator(junior);
        System.out.println("Middle: " + middle.develop());

        Developer senior = new SeniorDeveloperDecorator(middle);
        System.out.println("Senior: " + senior.develop());

        Developer teamLead = new TeamLeadDeveloperDecorator(senior);
        System.out.println("Team Lead: " + teamLead.develop());
    }
}