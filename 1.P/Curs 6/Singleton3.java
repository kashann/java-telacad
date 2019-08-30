public class Singleton3{ //cel mai bun (si e si thread safe)
    private Singleton3(){
    }
    
    private static final class SingletonHolder{
        private static final Singleton3 instance = new Singleton3();
    }
    
    public static Singleton3 getInstance(){
        return SingletonHolder.instance;
    }
}