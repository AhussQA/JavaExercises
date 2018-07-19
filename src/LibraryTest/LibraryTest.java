package LibraryTest;

import Library.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {


    @Test
    public void checkConstructors(){
        Library l = new Library();
        assertNotNull(l);

        assertSame("Not the same", l.getLibraryItems());

    }

    @Test
    public void checkFunctions(){
        Library l = new Library();
        LibraryItem li = new LibraryItem();
        Person p = new Person();
        assertEquals("Wrong person","",p.getName());
        assertEquals("Wrong person","",p.getID());
        assertEquals("Wrong person","",p.getBooksCheckedOut());
        assertEquals("Wrong person","",p.getName());
        assertEquals("Wrong person","",p.getName());

        assertSame("Wrong Item", li, l.checkOut(5,5));
        assertSame("Wrong Item", li, l.checkIn(1,5));
        assertSame("Wrong Item", li, l.addItem(li));

        assertTrue("Wrong Item", l.removeItem(li));
        assertNull("Not Null", l.checkOut(1,5));

        assertSame("Wrong Item", li, l.updateItem());
        assertSame("Wrong Item", li, l.registerPerson());
        assertSame("Wrong Item", li, l.deletePerson());
        assertSame("Wrong Item", li, l.updatePerson());
        assertEquals("Wrong Item","",li.toString());
        assertTrue(l.findItem(li));


    }
}
