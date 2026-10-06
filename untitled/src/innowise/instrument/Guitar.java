package innowise.instrument;

public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }
    @Override
    public void play() {
        System.out.println("Играет гитара, количество струн: " + numberOfStrings + ", тональность: " + KEY);
    }
}
