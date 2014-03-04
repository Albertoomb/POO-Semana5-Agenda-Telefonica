
package poo.semana5.phonenumbers;

/**
 *
 * @author Mauro Pinto
 */
public class PhoneNumber {

    int number;
    String name;

    public PhoneNumber(int number, String name)
    {
        this.number = number;
        this.name = name;
    }

    public PhoneNumber(String name, int number)
    {
        this.name = name;
        this.number = number;
    }

    public String getName()
    {
        return name;
    }

    public int getNumber()
    {
        return number;
    }

}
