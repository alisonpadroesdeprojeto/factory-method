package factorymethod;

public class Banjo implements IMusicalInstrument {

    @Override
    public String play() {
        return ("Playing banjo.");
    }
}
