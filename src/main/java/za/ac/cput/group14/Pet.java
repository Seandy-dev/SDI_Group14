package za.ac.cput.group14;

/**
 * Name: Sindiswa Mbhele
 * student no: 219279616
 * Date: 30 March 2021
 * The
 */
public class Pet {
    private int cat;
    private int mice;

    public Pet(){
        this.cat = cat;
        this.mice = mice;
    }

    public int getCat() {
        return cat;
    }

    public void setCat(int cat) {
        this.cat = cat;
    }

    public int getMice() {
        return mice;
    }

    public void setMice(int mice) {
        this.mice = mice;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "cat=" + cat +
                ", mice=" + mice +
                '}';
    }
}
