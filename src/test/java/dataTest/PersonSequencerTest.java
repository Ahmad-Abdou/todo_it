package dataTest;

import data.PersonSequencer;
import org.junit.Assert;
import org.junit.Test;

public class PersonSequencerTest {

    @Test
    public void test_nextPersonId(){
        int expected = 3;
        int actual = PersonSequencer.nextPersonId(2);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void resetTest(){
        int expected = 0;
        int actual = PersonSequencer.reset() ;
        Assert.assertEquals(expected,actual);
    }
}
