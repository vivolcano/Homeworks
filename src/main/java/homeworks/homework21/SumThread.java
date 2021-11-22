package homeworks.homework21;

public class SumThread extends Thread {
    private int from;
    private int to;
    private int index;

    public SumThread(int from, int to, int index) {
        this.from = from;
        this.to = to;
        this.index = index;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = from; i < to; i++) {

        }

    }

}

