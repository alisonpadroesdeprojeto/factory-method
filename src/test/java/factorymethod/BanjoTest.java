package factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class BanjoTest {

    @Test
    public void testPlayBanjo() {
        IMusicalInstrument musicalInstrument = MusicalInstrumentFactory.getMusicalInstrument("Banjo");
        Assert.assertEquals("Playing banjo.", musicalInstrument.play());
    }
}