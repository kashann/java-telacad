public class Consumator extends Thread{
    public Consumator(String nume){
        super(nume);
    }
    
    @Override
    public void run(){
        try{
            while(true){
                synchronized(Exemplu3.list){
                    if(!Exemplu3.list.isEmpty()){
                        int x = Exemplu3.list.get(0);
                        Exemplu3.list.remove(0);
                        Exemplu3.list.notifyAll();
                        System.out.println("A fost eliminat numarul " + x);
                    } else {
                        Exemplu3.list.wait();
                    }
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}