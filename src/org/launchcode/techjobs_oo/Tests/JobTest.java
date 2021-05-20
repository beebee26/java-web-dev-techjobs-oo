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
        assertEquals(newJob instanceof Employer,"ACME");
        assertEquals(newJob instanceof Location,"Desert");
        assertEquals(newJob instanceof PositionType,"Quality control");
        assertEquals(newJob instanceof CoreCompetency,"Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job newJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job newJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertFalse(testJob1.equals(testJob2));
    }
}
