package org.launchcode.techjobs_oo.Tests;
import java.lang.Object

package guru99.junit;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

public class JobTest {
    @Before
    Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job testJob2 = new Job("Web Developer", new Employer("LaunchCode"), new Location("St. Louis"), new PositionType("Front-end developer"), new CoreCompetency("JavaScript"));


    @Test
    public void testSettingJobId() {
        testJob1
        assertEquals(10,10,.001);
    }


}
