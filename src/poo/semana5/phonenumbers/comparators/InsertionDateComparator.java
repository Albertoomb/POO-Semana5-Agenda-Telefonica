
package poo.semana5.phonenumbers.comparators;

import java.util.Comparator;
import poo.semana5.phonenumbers.PhoneNumber;

/**
 *
 * @author Mauro Pinto
 */
public class InsertionDateComparator implements Comparator<PhoneNumber> {

    @Override
    public int compare(PhoneNumber p1, PhoneNumber p2)
    {
        return p1.getCreatedDate().compareTo(p2.getCreatedDate());
    }

}
