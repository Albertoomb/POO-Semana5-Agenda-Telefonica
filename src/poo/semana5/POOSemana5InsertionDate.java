package poo.semana5;

import java.util.Calendar;
import java.util.Collections;
import poo.semana5.phonenumbers.PhoneNumber;
import poo.semana5.phonenumbers.collections.ArrayListPhoneBook;
import poo.semana5.phonenumbers.comparators.InsertionDateComparator;

/**
 *
 * @author Mauro Pinto
 */
public class POOSemana5InsertionDate
{

    public static void main(String[] args) throws InterruptedException
    {
        Calendar calendar = Calendar.getInstance();

        ArrayListPhoneBook phoneBook = new ArrayListPhoneBook();
        phoneBook.addEntry("Zorro", 969999999);
        calendar.add(Calendar.HOUR, 1);
        phoneBook.addEntry(new PhoneNumber("Joaquim", 9191, calendar.getTime()));
        calendar.add(Calendar.HOUR, -10);
        phoneBook.addEntry(new PhoneNumber("Bruna", 1010, calendar.getTime()));
        phoneBook.addEntry("Virgulino", 56565);
        Collections.sort(phoneBook.getPhoneBook(), new InsertionDateComparator());

        for (PhoneNumber phoneNumber : phoneBook.getPhoneBook()) {
            System.out.println(phoneNumber.getName() + ": " + phoneNumber.getCreatedDate());
        }
    }

}
