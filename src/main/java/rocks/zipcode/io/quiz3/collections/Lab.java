package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    public void setLabName(String labName) {
        this.labName = labName;
    }

    private String labName;
    public Lab() {
        this("");
    }

    public Lab(String labName) {
        this.labName=labName;
    }


    public String getName() {
        return labName;
    }
}
