package poo.semana5.phonenumbers.collections;

/**
 *
 * @author Mauro Pinto
 */
public interface PhoneBook
{
    public void addEntry(final String name, int number);
    public String getName(int number);
    public int getNumber(final String name);
    public void remove(final String name);
    public boolean contains(int number);
    public String toString();
}
