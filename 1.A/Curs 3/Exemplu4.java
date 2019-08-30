public class Exemplu4{
    public static void main(String [] args){
        int [][] x = new int [3][4];
        int c = 1;
        
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                x[i][j] = c++;;
            }
        }
        
        for(int [] a : x){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
        
        System.out.println(x);
        
    }
}