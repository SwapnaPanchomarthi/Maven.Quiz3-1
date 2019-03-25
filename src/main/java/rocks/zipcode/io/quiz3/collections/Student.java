package rocks.zipcode.io.quiz3.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 10/12/2018.
 */
public class Student {

    private Map<Lab, LabStatus> map;
    private String labName;
    private LabStatus labStatus;
    public void setLabName(String labName) {
        this.labName = labName;
    }


    public Student() {
        this(new HashMap<>());
    }

    public Student(Map<Lab, LabStatus> map) {
        Lab lab = new Lab();
        this.map =  map;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Lab key: map.keySet()) {
            sb.append(labName + " "+'>'+" " + labStatus);
           // duplicate deleter > COMPLETED
            //learner lab > PENDING
            //sb.append(map.get(key));

        }
        return sb.toString();
    }

    public Lab getLab(String labName) {

        Lab lab = new Lab(labName);
        for(Lab key: map.keySet())
        {
            if(key.getName().equals(labName))
                return key;

        }
        return null;
    }

    public void setLabStatus(String labName, LabStatus labStatus) {
        this.labName = labName;
        this.labStatus=labStatus;


    }


    public void forkLab(Lab lab) {
        map.put(lab, labStatus.PENDING);
        map.put(lab,labStatus.INCOMPLETE );
        map.put(lab, labStatus.COMPLETED);


    }

    public LabStatus getLabStatus(String labName) {
        return LabStatus.PENDING;
    }
}
