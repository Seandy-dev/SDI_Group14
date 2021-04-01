package za.ac.cput.group14;
//Author Devon May - 219168296

public class grp
{
    private String GroupYear;
    private String GroupSize;

    public String getGroupSize()
    {

        return GroupSize;
    }

    public void setGroupSize(String groupSize) {
        GroupSize = groupSize;
    }

    public String getGroupYear() {
        return GroupYear;
    }

    public void setGroupYear(String groupYear) {
        GroupYear = groupYear;
    }

    @Override
    public String toString() {
        return "grp{" +
                "GroupSize='" + GroupSize + '\'' +
                ", GroupYear='" + GroupYear + '\'' +
                '}';
    }
}
