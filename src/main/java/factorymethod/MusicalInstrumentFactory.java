package factorymethod;

import java.lang.reflect.InvocationTargetException;

public class MusicalInstrumentFactory {

    public static IMusicalInstrument castMusicalInstrument(Object object) {
        if (object instanceof IMusicalInstrument) {
            return (IMusicalInstrument) object;
        } else {
            throw new IllegalArgumentException("Invalid musical instrument.");
        }
    }

    public static IMusicalInstrument getMusicalInstrument(String name) {
        try {
            Class<?> musicalInstrumentClass = Class.forName("factorymethod." + name);
            Object musicalInstrumentObject = musicalInstrumentClass.getDeclaredConstructor().newInstance();
            return castMusicalInstrument(musicalInstrumentObject);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 IllegalArgumentException | NoSuchMethodException | InvocationTargetException ex) {
            throw new IllegalArgumentException("Musical instrument not implemented.");
        }
    }
}
