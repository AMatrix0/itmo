package places.interfaces;

import items.AbstractItem;

public interface IHasItems {
    void addItem(AbstractItem item);
    AbstractItem getItem(int id);
}
