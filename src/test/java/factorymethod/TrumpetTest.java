package factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class TrumpetTest {

    @Test
    public void testPlayTrumpet() {
        IMusicalInstrument musicalInstrument = MusicalInstrumentFactory.getMusicalInstrument("Trumpet");
        Assert.assertEquals("Playing trumpet.", musicalInstrument.play());
    }
}