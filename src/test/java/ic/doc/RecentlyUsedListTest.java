package ic.doc;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RecentlyUsedListTest {

    @Test
    public void listIsEmptyWhenInitialised() {
        assertThat(new RecentlyUsedList().isEmpty(), is(true));
    }

    @Test
    public void itemAddedToList() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.add("Hayley Kwan");

        assertThat(list.contains("Hayley Kwan"), is(true));
    }

    @Test
    public void itemRetrievedFromList() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(928);

        assertThat(list.get(), is((Object) 928));
    }

    @Test
    public void mostRecentItemIsFirstInList() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.add("Concurrency");
        list.add("Labs");
        list.add("Software Engineering");

        assertThat(list.get(), is((Object) "Software Engineering"));
    }

    @Test
    public void duplicateItemsMovedToFrontOfListAndNotAdded() {
        RecentlyUsedList list = new RecentlyUsedList();
        list.add(1993);
        list.add(1994);
        list.add(1995);
        list.add(1996);
        list.add(1995);

        assertThat(list.get(), is((Object) 1995));
        assertThat(list.count(list.get()), is(1));
    }

}