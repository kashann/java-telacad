public class Exemplu3{
    public static void main(String [] args){
        int zi = 4;
        
        switch (zi) {
            case 1:
                System.out.print("Luni");
                break;
            case 2:
                System.out.print("Marti");
                break;
            case 3:
                System.out.print("Miercuri");
                break;
            case 4:
                System.out.print("Joi");
                break;
            case 5:
                System.out.print("Vineri");
                break;
            case 6:
            case 7:
                System.out.print("Weekend");
                break;
            default: // optional
                System.out.print("Eroare!");
        }       
    }
}