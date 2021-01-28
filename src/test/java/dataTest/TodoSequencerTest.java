package dataTest;


import data.TodoSequencer;
import org.junit.Assert;
import org.junit.Test;

public class TodoSequencerTest {
    @Test
    public void test_nextPersonId(){
        int expected = 3;
        int actual = TodoSequencer.nextPersonId2();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void resetTest(){
        int expected = 0;
        int actual = TodoSequencer.reset2() ;
        Assert.assertEquals(expected,actual);
    }
}
