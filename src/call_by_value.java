class Updater{
    void update(Counter i){
        i.count++;
    }
}

class Counter{
    int count;
}

public class call_by_value {
    public static void main(String[] args){
        Counter counter = new Counter();
        Updater updater = new Updater();
        counter.count = 0;
        updater.update(counter);
        System.out.println(counter.count);
    }
}
