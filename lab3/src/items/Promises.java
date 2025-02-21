package items;

public class Promises extends AbstractItem {
    public Promises(String name) {
        super(name);
    }


    public void interact() {
        System.out.println(this.getName() + " выданы");
    }

}
