import java.beans.Customizer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        customer c1=new customer("ank","java");
        customer c2=new customer("kes","java");
        customer c3=new customer("osh","java");
        customer c4=new customer("mehu","java");
        customer c5=new customer("kauk","java");
        customer c6=new customer("fuck","java");
        customer c7=new customer("love","java");
        customer c8=new customer("mess","java");
        customer c9=new customer("peace","java");
        customer c10=new customer("khushi","java");
        customer c11=new customer("success","java");

        ArrayList<customer> listOfCust= new ArrayList<>();
        listOfCust.add(c1);
        listOfCust.add(c2);
        listOfCust.add(c3);
        listOfCust.add(c4);
        listOfCust.add(c5);
        listOfCust.add(c6);
        listOfCust.add(c7);
        listOfCust.add(c8);
        listOfCust.add(c9);
        listOfCust.add(c10);
        listOfCust.add(c11);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        listOfCust.stream().forEach((i)->{
            TriggerEmail triggerEmail=new TriggerEmail(i);
                executorService.execute(triggerEmail);
        });


    }



}