package factorymethod;

public class Piano implements IMusicalInstrument {

    @Override
    public String play() {
        return ("Playing piano.");
    }
}
