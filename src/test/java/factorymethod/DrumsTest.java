package factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class DrumsTest {

    @Test
    public void testPlayDrums() {
        IMusicalInstrument musicalInstrument = MusicalInstrumentFactory.getMusicalInstrument("Drums");
        Assert.assertEquals("Playing drums.", musicalInstrument.play());
    }
}