package poo.semana5.phonenumbers.collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Implementação de PhoneBook com dois HashMaps (como pedido no exercício)
 * @author Mauro Pinto
 */
public class DoubleHashMapPhoneBook implements PhoneBook
{

    private final Map<String, Integer> phoneBookStringInt = new HashMap<>();
    private final Map<Integer, String> phoneBookIntString = new HashMap<>();

    @Override
    public void addEntry(String name, int number)
    {
        if (!contains(number)) {
            phoneBookIntString.put(number, name);
            phoneBookStringInt.put(name, number);
        }
    }

    @Override
    public String getName(int number)
    {
        if (phoneBookIntString.containsKey(number)) {
            return phoneBookIntString.get(number);
        }

        return null;
    }

    @Override
    public int getNumber(String name)
    {
        if (phoneBookStringInt.containsKey(name)) {
            return phoneBookStringInt.get(name);
        }

        return -1;
    }

    @Override
    public void remove(String name)
    {
        if (phoneBookStringInt.containsKey(name)) {
            phoneBookStringInt.remove(name);

            for (Map.Entry<Integer, String> phoneBookEntry: phoneBookIntString.entrySet()) {
                if (phoneBookEntry.getValue().equals(name)) {
                    phoneBookIntString.remove(phoneBookEntry.getKey());
                    return;
                }
            }
        }
    }

    @Override
    public boolean contains(int number)
    {
        return phoneBookIntString.containsKey(number);
    }

}
