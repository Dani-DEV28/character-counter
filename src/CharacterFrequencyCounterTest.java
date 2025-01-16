import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CharacterFrequencyCounterTest {

    @Test
    public void testLAppersThreeTimesInHelloWorld(){
        // Arrange 
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("Hello World");
        // Act 
        int actualCount = counter.getFrequency('z');
        // Assert 
        assertEquals(3, actualCount);
    }

    @Test
    public void testNonOccurringCharacterPercentageIsZero(){
        CharacterFrequencyCounter counter = new CharacterFrequencyCounter("hi there");
        double actualPercentage = counter.getRelativePercentage(' ');
        assertEquals(0.0, actualPercentage, 0.0001);
    }
    
}