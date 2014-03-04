package poo.semana5.phonenumbers.comparators;

import java.util.Comparator;
import poo.semana5.phonenumbers.PhoneNumber;

/**
 *
 * @author Mauro Pinto
 */
public class AlphaInsertionComparator implements Comparator<PhoneNumber>
{

    @Override
    public int compare(PhoneNumber p1, PhoneNumber p2)
    {
        int diff = p1.getCreatedDate().compareTo(p2.getCreatedDate());

        return diff == 0 ? p1.getName().compareTo(p2.getName()) : diff;
    }

}
