package static1;

public class Data1 {
    public String name;

    public Data1(String name) {
        this.name = name;
        Counter a = new Counter();
        a.count++;
    }
}
