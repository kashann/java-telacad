public class Exemplu4{
    public static void main(String [] args){
        char a = 'p'; //p,t,v,i
        
        switch (a) {
            case 'p':
            case 't':
                System.out.print("Ploua!");
                break;
            case 'v':
                System.out.print("Este cald!");
                break;
            case 'i':
                System.out.print("Este frig!");
        }
    }
}