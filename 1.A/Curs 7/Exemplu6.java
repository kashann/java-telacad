public class Exemplu6{
    
    public static void main(String [] args){
        
        try(
            Door d1 = new Door();
            Door d2 = new Door();
        ){
            //se foloseste usa
            throw new RuntimeException("A");
        }catch(Exceptio e){
            System.out.println(e.getMessage());
            
            Throwable [] t = e.getSuppressed();
            for(Throwable x : t){
                System.out.println(x.getMessage());
            }  
        }finally{
            System.out.println("Finally");
        }
    }
        
        /*Door d1 = null;           VARIANTA VECHE
        Door d2 = null;
        try{
            d1 = new Door();
            d2 = new Door();
            // se foloseste usa
        }finally{
            try{
                if(d1 != null){
                    d1.close();
                }
            }catch (Exception e){
                
            }
            try{
                if(d2!= null){
                    d2.close();
                }
            }
    }*/
}