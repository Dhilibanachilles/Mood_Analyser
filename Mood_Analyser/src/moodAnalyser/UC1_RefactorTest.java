package moodAnalyser;

import org.junit.Assert;
import org.junit.Test;

public class UC1_RefactorTest
{
    @Test
    public void givenSadMood_ShouldReturn_SAD() throws Exception {
    	UC1_Refactor moodAnalyser = new UC1_Refactor("This is a sad message.");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenHappyMood_ShouldReturn_HAPPY() throws Exception {
    	UC1_Refactor moodAnalyser = new UC1_Refactor("This is a Happy message.");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }

    @Test
    public void givenANyMood_ShouldReturn_HAPPY() throws Exception {
    	UC1_Refactor moodAnalyser = new UC1_Refactor("This is an Any message.");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",mood);
    }
}

