package ic.doc;

import java.util.ArrayList;

import java.util.Iterator;

public class RecentlyUsedList {

    ArrayList<Object> list = new ArrayList<Object>();

    public Boolean isEmpty() {
        return list.isEmpty();
    }

    public void add(Object o) {
        if (list.contains(o)) {
            list.remove(o);
        }
        list.add(0, o);
    }

    public Boolean contains(Object o) {
        return list.contains(o);
    }

    public Object get() {
        return list.get(0);
    }

    public Integer count(Object o) {
        int count = 0;
        Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(o)) {
                count++;
            }
        }
        return count;
    }


}