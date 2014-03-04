
package poo.semana5.phonenumbers.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mauro Pinto
 */
public class HashMapPhoneBook implements PhoneBook {

    private final Map<String, Integer> phoneBook = new HashMap<>();

    @Override
    public void addEntry(String name, int number)
    {
        phoneBook.put(name, number);
    }

    @Override
    public String getName(int number)
    {
        for (Map.Entry<String, Integer> phoneBookEntry: phoneBook.entrySet()) {
            if (phoneBookEntry.getValue() == number) {
                return phoneBookEntry.getKey();
            }
        }

        return null;
    }

    @Override
    public int getNumber(String name)
    {
        return phoneBook.containsKey(name) ? phoneBook.get(name) : -1;
    }

    @Override
    public void remove(String name)
    {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        }
    }

    @Override
    public boolean contains(int number)
    {
        return getName(number) != null;
    }



}
