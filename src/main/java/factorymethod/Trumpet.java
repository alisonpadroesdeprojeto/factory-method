package factorymethod;

public class Trumpet implements IMusicalInstrument {

    @Override
    public String play() {
        return ("Playing trumpet.");
    }
}
