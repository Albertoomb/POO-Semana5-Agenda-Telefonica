
package poo.semana5.phonenumbers.collections;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Thing
 */
public class ArrayListPhoneBookTest
{

    private final ArrayListPhoneBook phoneBook = new ArrayListPhoneBook();
    private static final String NAME  = "Name";
    private static final int NUMBER   = 123456789;

    /**
     * Test of addEntry method, of class ArrayListPhoneBookCollection.
     */
    @Test
    public void testAddEntry()
    {
        System.out.println("addEntry");
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.getName(NUMBER), NAME);
        assertEquals(phoneBook.getNumber(NAME), NUMBER);
    }

    /**
     * Test of getName method, of class ArrayListPhoneBookCollection.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        assertEquals(phoneBook.getName(NUMBER), null);
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.getName(NUMBER), NAME);
    }

    /**
     * Test of getNumber method, of class ArrayListPhoneBookCollection.
     */
    @Test
    public void testGetNumber()
    {
        System.out.println("getNumber");
        assertEquals(phoneBook.getNumber(NAME), -1);
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.getNumber(NAME), NUMBER);
    }

    /**
     * Test of remove method, of class ArrayListPhoneBookCollection.
     */
    @Test
    public void testRemove()
    {
        System.out.println("remove");
        phoneBook.addEntry(NAME, NUMBER);
        phoneBook.remove(NAME);
        assertEquals(phoneBook.getNumber(NAME), -1);
    }

    /**
     * Test remove many method, of class ArrayListPhoneBookCollection
     */
    @Test
    public void testRemoveMany()
    {
        System.out.println("remove many");
        phoneBook.addEntry(NAME, NUMBER);
        phoneBook.addEntry(NAME, NUMBER);
        phoneBook.addEntry("SomethingElse", 911);
        phoneBook.remove(NAME);
        assertEquals(phoneBook.getNumber(NAME), -1);
        assertEquals(phoneBook.getNumber("SomethingElse"), 911);
    }

    /**
     * Test of contains method, of class ArrayListPhoneBookCollection.
     */
    @Test
    public void testContains()
    {
        System.out.println("contains");
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.contains(NUMBER), true);
        assertEquals(phoneBook.contains(0), false);
    }

}
