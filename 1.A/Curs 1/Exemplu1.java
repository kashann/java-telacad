public class Exemplu1{
    public static void main(String [] args){
        byte b1;
        b1 = 10;
        
        byte b2 = 10;
        short s1, s2, s3;
        s2 = 10;
        
        int i1 = 10, i2, i3, i4 = 40;
        
        int k1 = 10;
        int k2 = 040; // 0 de la inceput inseamna ca e in baza 8
        int k3 = 0xAF; // 0x sau 0X inseamna baza 16
        int k4 = 0XFF;
        int k5 = 0b00100111; // 0b inseamna binar
        int k6 = 1_000_000_000; // _ ca sa separam 
        // k5 & k6 incepand cu java 7
        
        long e1 = 10;
        long e2 = 10000000000L; // fiindca java se uita mai intai in dreapta si vede nr prea mare pt int, da eroare, asa ca punem l / L la sfarsit, sa stie ca e long
        
        float f1 = 10.5f; //idem, nu merge fara f
        float f2 = (float) 10.5; // (float) operator de casting, daca am 10.54321, se va pierde precizie, din zecimale
        
        char c1 = 'a';
        char c2 = '\n';
        char c3 = '\u0000'; // unicode
        char c4 = 90; // se afiseaza caracterul din spatele lui 90 in unicode
        
        boolean r1 = true;
        boolean r2 = false;
        
        //gata cu Primitivele
        
        String y1 = "Hello"; // String este sir de caractere
        String y2 = "Hello \n\n World \u1010";
    }
}