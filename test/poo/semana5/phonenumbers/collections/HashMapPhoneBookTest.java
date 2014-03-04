
package poo.semana5.phonenumbers.collections;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Thing
 */
public class HashMapPhoneBookTest
{

    private final HashMapPhoneBook phoneBook  = new HashMapPhoneBook();
    private static final String NAME    = "Name";
    private static final int NUMBER     = 123456789;

    /**
     * Test of addEntry method, of class HashMapPhoneBook.
     */
    @Test
    public void testAddEntry()
    {
        System.out.println("addEntry");
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.getNumber(NAME), NUMBER);
    }

    /**
     * Test of getName method, of class HashMapPhoneBook.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.getName(NUMBER), NAME);
    }

    /**
     * Test of getNumber method, of class HashMapPhoneBook.
     */
    @Test
    public void testGetNumber()
    {
        System.out.println("getNumber");
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.getNumber(NAME), NUMBER);
    }

    /**
     * Test of remove method, of class HashMapPhoneBook.
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
     * Test of contains method, of class HashMapPhoneBook.
     */
    @Test
    public void testContains()
    {
        System.out.println("contains");
        assertEquals(phoneBook.contains(0), false);
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.contains(NUMBER), true);
    }

}
