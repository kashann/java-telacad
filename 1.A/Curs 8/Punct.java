public class Punct<T extends Number>{
    
    T x;
    T y;
    
    public Punct(){
    }
    
    public Punct(T x, T y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(T x){
        this.x = x;
    }
    
    public T getX(){
        return x;
    }
    
}