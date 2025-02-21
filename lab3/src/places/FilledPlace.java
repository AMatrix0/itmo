package places;

import java.util.ArrayList;

import items.AbstractItem;
import places.interfaces.IHasItems;

public class FilledPlace extends AbstractPlace implements IHasItems{
    
    private ArrayList<AbstractItem> items = new ArrayList<>();


    public FilledPlace(String name) {
        super(name);
    }


    @Override
    public void addItem(AbstractItem item) {
        System.out.println("в " + getName() + " появилось " + item.getName());
        items.add(item);
    }

    @Override
    public AbstractItem getItem(int id) {
        try {
            return items.get(id);
        }
        catch (IndexOutOfBoundsException e) {
            return null;
        }
    }


    public String getName() {
        String s = this.getPlaceName() + "[";
        for (AbstractItem item : items) {
            s += item.getName() + ", ";
        }
        return s + "]";
    }

}
