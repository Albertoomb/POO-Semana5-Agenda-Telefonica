
package poo.semana5.phonenumbers.collections;

import java.util.ArrayList;
import java.util.Iterator;
import poo.semana5.phonenumbers.PhoneNumber;

/**
 *
 * @author Mauro Pinto
 */
public class ArrayListPhoneBook implements PhoneBook {

    private final ArrayList<PhoneNumber> phoneBook = new ArrayList<>();

    @Override
    public void addEntry(String name, int number)
    {
        phoneBook.add(new PhoneNumber(number, name));
    }

    /**
     * Can have many with same name, returns only one
     * @param number
     * @return
     */
    @Override
    public String getName(int number)
    {
        for (PhoneNumber phoneNumber : phoneBook) {
            if (phoneNumber.getNumber() == number) {
                return phoneNumber.getName();
            }
        }
        return null;
    }

    /**
     * Can have many with same number, returns only one
     * @param name
     * @return
     */
    @Override
    public int getNumber(String name)
    {
        for (PhoneNumber phoneNumber : phoneBook) {
            if (phoneNumber.getName().equals(name)) {
                return phoneNumber.getNumber();
            }
        }

        return -1;
    }

    @Override
    public void remove(String name)
    {
        for (Iterator<PhoneNumber> it = phoneBook.iterator(); it.hasNext();) {
            PhoneNumber phoneNumber = it.next();
            if (phoneNumber.getName().equals(name)) {
                it.remove();
            }
        }
    }

    @Override
    public boolean contains(int number)
    {
        return getName(number) != null;
    }


}
