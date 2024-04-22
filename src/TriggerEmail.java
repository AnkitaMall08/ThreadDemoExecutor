public class TriggerEmail implements Runnable {
    private customer c;

    public TriggerEmail(customer c) {
        this.c = c;
    }

    @Override
    public void run() {
        trriggerdEmail(c);
    }
    public void trriggerdEmail(customer c){
        System.out.println("hi customer");
        StringBuilder sb=new StringBuilder();
        sb.append(c.name);
        sb.append("please have some patience as you are incredible");
        sb.append("love ur job"+c.role);
        sb.append("hope u are happy");
        System.out.println(sb.toString());
    }
}
