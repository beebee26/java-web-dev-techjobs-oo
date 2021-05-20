package org.launchcode.techjobs_oo;

import javax.swing.text.Position;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private Job aJob;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    //@Override
    //public String toString() {
        //this.aJob = aJob;
       // return "\nId: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + "\n";
    //}

    @Override
    public String toString() {
        //String Name = "Data not available";
        //Employer thisEmployer = "Data not available";
        //Location thisLocation = "Data not available";
        //PositionType thisPositionType = "Data not available";
        //CoreCompetency thisCoreCompetency = "Data not available";

        if (this.name == "" || this.name == null) {
            this.name = "Data not available";
        }
        if (this.employer.getValue() == "" || this.employer.getValue() == null) {
            this.employer.setValue("Data not available");
        }
        if (this.location.getValue() == "" || this.location.getValue() == null) {
            this.location.setValue("Data not available");
        }
        if (this.positionType.getValue() == "" || this.positionType.getValue() == null) {
            this.positionType.setValue("Data not available");
        }
        if (this.coreCompetency.getValue() == "" || this.coreCompetency.getValue() == null) {
            this.coreCompetency.setValue("Data not available");
        }
            return "\nId: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + "\n";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && name.equals(job.name) && employer.equals(job.employer) && location.equals(job.location) && positionType.equals(job.positionType) && coreCompetency.equals(job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public Location getLocation() {
        return location;
    }

    public Employer getEmployer() {
        return employer;
    }

    public String getName() {
        return name;
    }
}
