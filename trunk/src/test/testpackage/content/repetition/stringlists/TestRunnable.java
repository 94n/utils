package testpackage.content.repetition.stringlists;

/**
 * Created with IntelliJ IDEA.
 * User: makstitoff
 * Date: 27.03.13
 * Time: 2:12
 * To change this template use File | Settings | File Templates.
 */
public class TestRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i<100; i++){
            if(i%10 == 0){
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
    }

    public static void main(String [] args){
        new Thread(new TestRunnable()).start();
    }
}
