package items;

public class Phone extends AbstractItem {
    public Phone(String name) {
        super(name);
    }


    public void interact() {
        System.out.println(this.getName() + " зазвонил");
    }

}
