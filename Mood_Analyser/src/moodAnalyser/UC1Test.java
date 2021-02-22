package moodAnalyser;

import static org.junit.Assert.assertTrue;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;


public class UC1Test
{
    UC1 moodAnalyser=new UC1();
 
    @Test
    public void shouldReturn_SAD_Mood() throws Exception {
        String mood = moodAnalyser.analyseMood("This is a sad message.");
        Assert.assertThat(mood, CoreMatchers.is("SAD"));
        Assert.assertEquals("SAD",mood);
    }
    @Test
    public void shouldReturn_HAPPY_Mood() throws Exception {
        String mood = moodAnalyser.analyseMood("This is a Happy message.");
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
        Assert.assertEquals("HAPPY",mood);
    }
}
