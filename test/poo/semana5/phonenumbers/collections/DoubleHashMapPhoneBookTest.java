
package poo.semana5.phonenumbers.collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author Thing
 */
public class DoubleHashMapPhoneBookTest
{

    private final DoubleHashMapPhoneBook phoneBook = new DoubleHashMapPhoneBook();
    private static final String NAME = "Nome";
    private static final int NUMBER = 987654321;

    /**
     * Test of addEntry method, of class DoubleHashMapPhoneBook.
     */
    @Test
    public void testAddEntry()
    {
        System.out.println("addEntry");
        phoneBook.addEntry(NAME, NUMBER);
        assertNotNull(phoneBook.getName(NUMBER));
        assertEquals(phoneBook.getNumber(NAME), NUMBER);
    }

    /**
     * Test of getName method, of class DoubleHashMapPhoneBook.
     */
    @Test
    public void testGetName()
    {
        System.out.println("getName");
        phoneBook.addEntry(NAME, NUMBER);
        assertNotNull(phoneBook.getName(NUMBER));
    }

    /**
     * Test of getNumber method, of class DoubleHashMapPhoneBook.
     */
    @Test
    public void testGetNumber()
    {
        System.out.println("getNumber");
        phoneBook.addEntry(NAME, NUMBER);
        assertEquals(phoneBook.getNumber(NAME), NUMBER);
    }

    /**
     * Test of remove method, of class DoubleHashMapPhoneBook.
     */
    @Test
    public void testRemove()
    {
        System.out.println("remove");
        phoneBook.addEntry(NAME, NUMBER);
        phoneBook.remove(NAME);
        assertEquals(phoneBook.getNumber(NAME), -1);
        assertFalse(phoneBook.contains(NUMBER));
    }

    @Test
    public void testRemoveMany()
    {
        System.out.println("removeMany");
        phoneBook.addEntry(NAME, NUMBER);
        phoneBook.addEntry(NAME, NUMBER);
        phoneBook.addEntry("Outro", 123456);
        phoneBook.remove(NAME);
        assertEquals(phoneBook.getNumber(NAME), -1);
        assertEquals(phoneBook.getNumber("Outro"), 123456);
        assertFalse(phoneBook.contains(NUMBER));
    }


    /**
     * Test of contains method, of class DoubleHashMapPhoneBook.
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
