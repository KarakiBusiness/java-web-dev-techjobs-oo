package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import javax.print.attribute.standard.JobName;

import static org.junit.jupiter.api.Assertions.*;

public class JobTest {


    @Test
    public void testingEmptyConstructor(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job1.getId()==job1.getId());
        assertTrue(job1.getId() == job2.getId()-1);

    }


    @Test
    public void testJobConstructorSetsAllFields(){
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
          assertEquals("Product tester", job1.getName());
          assertTrue(job1 instanceof Job);
          assertEquals("Product tester", job1.getName());
          assertTrue(job1.getEmployer() instanceof Employer);
          assertEquals("ACME",job1.getEmployer().getValue());
          assertTrue(job1.getLocation() instanceof Location);
          assertEquals("Desert",job1.getLocation().getValue());
          assertTrue(job1.getPositionType() instanceof PositionType);
          assertEquals("Quality control", job1.getPositionType().getValue());
          assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
          assertEquals("Persistence",job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
       Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
       Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1 == job2);
    }

    @Test
    public void testForNewLinesBeforeAndAfter(){

    }



}