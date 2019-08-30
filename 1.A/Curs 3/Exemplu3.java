public class Exemplu3{
    public static void main(String [] args){
        int [][] x = new int [3][];
        int c = 1;
        
        int [] a1 = new int [5];
        int [] a2 = new int [7];
        int [] a3 = new int [6];
        
        x[0] = a1;
        x[1] = a2;
        x[2] = a3;
        
        for(int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                x[i][j] = c++;
            }
        }
        
        for(int [] q:x){
            for(int p:q){
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}