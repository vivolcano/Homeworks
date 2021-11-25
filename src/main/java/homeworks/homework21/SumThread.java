package homeworks.homework21;

public class SumThread extends Thread {
    private int from;
    private int to;
    private int[] array;


    public SumThread(int from, int to, int [] array) {
        this.from = from;
        this.to = to;
        this.array = array;
    }

    @Override
    public void run () {
        Main.sum = 0;
        for (int i = this.from; i <= this.to; i++) {
            if(i < this.array.length)
                Main.sum += this.array[i];
        }
    }
}

