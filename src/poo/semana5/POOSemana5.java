package poo.semana5;

import poo.semana5.phonenumbers.collections.ArrayListPhoneBook;
import poo.semana5.phonenumbers.collections.DoubleHashMapPhoneBook;
import poo.semana5.phonenumbers.collections.HashMapPhoneBook;
import poo.semana5.phonenumbers.collections.PhoneBook;

/**
 *
 * @author Mauro Pinto
 */
public class POOSemana5
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        PhoneBook phoneBook = new HashMapPhoneBook();
        phoneBook.addEntry("Qualquer Coisa", 969999999);
        phoneBook.addEntry("Qualquer Coisa 2", 969999991);
        phoneBook.addEntry("Qualquer Coisa 2", 969999996);

        System.out.println(phoneBook.getNumber("Qualquer Coisa"));
        System.out.println(phoneBook.getNumber("Qualquer Coisa 2"));
        System.out.println(phoneBook.getName(969999991));

        phoneBook = new ArrayListPhoneBook();
        phoneBook.addEntry("Qualquer Coisa", 969999999);
        phoneBook.addEntry("Qualquer Coisa 2", 969999991);
        phoneBook.addEntry("Qualquer Coisa 2", 969999993);

        System.out.println(phoneBook.getNumber("Qualquer Coisa"));
        System.out.println(phoneBook.getNumber("Qualquer Coisa 2"));
        System.out.println(phoneBook.getName(969999991));

        phoneBook = new DoubleHashMapPhoneBook();
        phoneBook.addEntry("Qualquer Coisa", 969999999);
        phoneBook.addEntry("Qualquer Coisa 2", 969999991);
        phoneBook.addEntry("Qualquer Coisa 2", 969999993);

        System.out.println(phoneBook.getNumber("Qualquer Coisa"));
        System.out.println(phoneBook.getNumber("Qualquer Coisa 2"));
        System.out.println(phoneBook.getName(969999991));
    }

}
