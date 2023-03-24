package factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class GuitarTest {

    @Test
    public void testPlayGuitar() {
        IMusicalInstrument musicalInstrument = MusicalInstrumentFactory.getMusicalInstrument("Guitar");
        Assert.assertEquals("Playing guitar.", musicalInstrument.play());
    }
}