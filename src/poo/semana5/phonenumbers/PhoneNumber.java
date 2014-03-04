
package poo.semana5.phonenumbers;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Mauro Pinto
 */
public class PhoneNumber {

    private final int number;
    private final String name;
    private final Date createdDate;

    public PhoneNumber(int number, String name)
    {
        this.number = number;
        this.name = name;
        this.createdDate = Calendar.getInstance().getTime();
    }

    public PhoneNumber(String name, int number)
    {
        this.name = name;
        this.number = number;
        this.createdDate = Calendar.getInstance().getTime();
    }

    public PhoneNumber(String name, int number, Date date)
    {
        this.name = name;
        this.number = number;
        this.createdDate = date;
    }

    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

}
