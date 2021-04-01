package za.ac.cput.group14;
// Devon Sherwyn May - 219168296
public class Car
{
    private String Make;
    private String Year;

    public String getMake()
    {
        return Make;
    }

    public void setMake(String make)
    {
        Make = make;
    }

    public String getYear()
    {
        return Year;
    }

    public void setYear(String year)
    {
        Year = year;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "Make='" + Make + '\'' +
                ", Year='" + Year + '\'' +
                '}';
    }
}
