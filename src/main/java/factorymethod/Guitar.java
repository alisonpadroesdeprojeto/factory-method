package factorymethod;

public class Guitar implements IMusicalInstrument {

    @Override
    public String play() {
        return ("Playing guitar.");
    }
}
