public class Fir extends Thread{
    @Override
    public void run(){
        for(int i = 0; i < 30; i++) {
            try {
                Thread.sleep(2*60*1000);
                System.out.println(Curs.noCursuri);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}