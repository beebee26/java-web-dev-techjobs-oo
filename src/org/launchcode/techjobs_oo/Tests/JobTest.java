package org.launchcode.techjobs_oo.Tests;


import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    @Before
    Job testJob1 = new Job();
    Job testJob2 = new Job();

    @Test
    public void testSettingJobId() {

        assertEquals(testJob1+1,testJob2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job newJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertEquals(newJob.getName(),"Product tester");
        assertTrue(newJob.getEmployer() instanceof Employer);
        assertTrue(newJob.getLocation() instanceof Location);
        assertTrue(newJob.getPositionType() instanceof PositionType);
        assertTrue(newJob.getCoreCompetency() instanceof  CoreCompetency);
        assertEquals("Product tester", newJob.getName());
        assertEquals("ACME", newJob.getEmployer().toString());
        assertEquals("Desert", newJob.getLocation().toString());
        assertEquals("Quality control", newJob.getPositionType().toString());
        assertEquals("Persistence", newJob.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job newJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJob1.equals(testJob2));
    }

    @Test
    public void testToString() {
        Job stringJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: 1\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence", stringJob1.toString());
    }

    @Test
    public void emptyString() {
        Job stringJob2 = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));
        assertEquals("\nID: 1\nName: Data not available\nEmployer: Data not available\nLocation: Data not available\nPosition Type: Data not available\nCore Competency: Data not available", stringJob2.toString());
    }
}
