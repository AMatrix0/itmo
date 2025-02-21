package items;

public class LearnableSubject extends AbstractItem {
    public LearnableSubject(String name) {
        super(name);
    }


    public void interact() {
        System.out.println(this.getName() + " выучена");
    }

}
