class StaEx {
    static int count = 0;
    StaEx() {
        count++;
    }

    static int getCount() {
        return count;
    }
}
public class StaticKeyEx {
    public static void main(String[] args) {
        StaEx obj1 = new StaEx();
        StaEx obj2 = new StaEx();
        StaEx obj3 = new StaEx();

        System.out.println("Count: " + StaEx.getCount());
    }
}
