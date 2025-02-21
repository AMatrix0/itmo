package items;

public abstract class AbstractItem {
    private String name;

    protected AbstractItem(String name) {
        super();
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public abstract void interact();

}
