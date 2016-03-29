package ic.doc;

import java.util.ArrayList;
import java.util.List;

public class RecentlyUsedList {

    private List<String> content = new ArrayList<>();

    public void add(String element){
        if(content.contains(element)){
            content.remove(element);
        }
        content.add(0, element);
    }

    public int size(){
        return content.size();
    }

    public boolean isEmpty() {
        return content.isEmpty();
    }

    public String get(int i) {
        return content.get(i);
    }
}