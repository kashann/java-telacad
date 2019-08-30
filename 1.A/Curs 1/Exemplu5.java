public class Exemplu5{
    public static void main(String [] args){
        int h1 = 4, m1 = 40, s1 = 50;
        int h2 = 3, m2 = 30, s2 = 30;
        
        if(s1 + s2 >= 60){
            s1 = s1 + s2 - 60;
            m1 = m1 + 1;
        }else{
            s1 += s2; // s1 = s1 + s2;
        }
        
        if(m1 + m2 >= 60){
            m1 = m1 + m2 - 60;
            h1 += 1; // h1 = h1 + 1;
        }else{
            m1 = m1 + m2;
        }
        
        h1 = h1 + h2;
        
        System.out.print(h1 + ":" + m1 + ":" + s1);
    }
}   