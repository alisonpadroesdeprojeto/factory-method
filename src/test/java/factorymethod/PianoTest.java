package factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class PianoTest {

    @Test
    public void testPlayPiano() {
        IMusicalInstrument musicalInstrument = MusicalInstrumentFactory.getMusicalInstrument("Piano");
        Assert.assertEquals("Playing piano.", musicalInstrument.play());
    }
}