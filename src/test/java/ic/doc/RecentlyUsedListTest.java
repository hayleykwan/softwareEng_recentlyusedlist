package ic.doc;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class RecentlyUsedListTest {

    RecentlyUsedList list = new RecentlyUsedList();

	@Test
	public void isInitialisedListEmpty() {
		assertTrue(list.isEmpty());
	}

    @Test
    public void canAddItemsToList(){
        list.add("hello");
        assertFalse(list.isEmpty());
        assertThat(list.size(), is(1));
        list.add("goodbye");
        assertThat(list.size(), is(2));
    }

    @Test
    public void keepMostRecentItemAtTopOfList(){
        list.add("cat");
        list.add("dog");
        assertThat(list.get(1), is("cat"));
        assertThat(list.get(0), is("dog"));
    }

    @Test
    public void noDuplicateItems(){
        list.add("cat");
        list.add("cat");
        assertThat(list.size(), is(1));
    }

    @Test
    public void moveDuplicateItemsToTop(){
        list.add("cat");
        list.add("dog");
        list.add("cat");
        assertThat(list.size(), is(2));
        assertThat(list.get(0), is("cat"));
    }
}