package factorymethod;

public class Drums implements IMusicalInstrument {

    @Override
    public String play() {
        return ("Playing drums.");
    }
}
