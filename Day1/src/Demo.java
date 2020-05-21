import java.util.Objects;

public class Demo {

    private int wight;
    private String marka;
    private  int vin;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return vin == demo.vin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(vin);
    }

    public Demo() {
    }

    public Demo(int vin,int wight, String marka) {
        this.wight = wight;
        this.marka = marka;
        this.vin = vin;
    }
}
