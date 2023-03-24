package factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class MusicalInstrumentFactoryTest {

    @Test
    public void testReturnNonExistingMusicalInstrument() {
        try {
            IMusicalInstrument musicalInstrument = MusicalInstrumentFactory.getMusicalInstrument("Harp");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Musical instrument not implemented.", e.getMessage());
        }
    }

    @Test
    public void testReturnExceptionInvalidMusicalInstrument() {
        try {
            Voice voice = new Voice();
            IMusicalInstrument musicalInstrument = MusicalInstrumentFactory.castMusicalInstrument(voice);
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertEquals("Invalid musical instrument.", e.getMessage());
        }
    }
}