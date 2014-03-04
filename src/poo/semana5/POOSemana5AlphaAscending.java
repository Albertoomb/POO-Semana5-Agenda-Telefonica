
package poo.semana5;

import java.util.Collections;
import poo.semana5.phonenumbers.PhoneNumber;
import poo.semana5.phonenumbers.collections.ArrayListPhoneBook;
import poo.semana5.phonenumbers.comparators.AlphabeticAscendingComparator;

/**
 *
 * @author Mauro Pinto
 */
public class POOSemana5AlphaAscending {

    public static void main(String[] args)
    {
        ArrayListPhoneBook phoneBook = new ArrayListPhoneBook();
        phoneBook.addEntry("Zorro", 969999999);
        phoneBook.addEntry("Joaquim", 969999991);
        phoneBook.addEntry("Andreia", 969999993);
        phoneBook.addEntry("Virgulino", 56565);
        Collections.sort(phoneBook.getPhoneBook(), new AlphabeticAscendingComparator());

        for (PhoneNumber phoneNumber : phoneBook.getPhoneBook()) {
            System.out.println(phoneNumber.getName());
        }
    }

}
