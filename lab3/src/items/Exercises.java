package items;

public class Exercises extends AbstractItem {
    public Exercises(String name) {
        super(name);
    }


    public void interact() {
        System.out.println(this.getName() + " решены");
    }

}
