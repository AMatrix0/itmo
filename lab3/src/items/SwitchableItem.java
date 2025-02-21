package items;

public class SwitchableItem extends AbstractItem {
    private boolean state = false;

    public SwitchableItem(String name) {
        super(name);
    }


    private void turnOn() {
        this.state = true;
        System.out.println(this.getName() + " включилось");
    }

    private void turnOff() {
        this.state = true;
        System.out.println(this.getName() + " выключилось");
    }


    public void interact() {
        if (state) turnOff();
        else turnOn();
    }

}
