import java.util.*;

public class Aplicatie{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Fir f1 = new Fir();
        f1.start();
        while(true){
            System.out.print("Comanda: ");
            String cmd = s.nextLine();
            String[] v = cmd.split("\\s+");
            switch(v[0]){
                case "exit":{
                    System.out.println("Pa pa!");
                }return;
                case "adauga_curs":{
                    try{
                        switch(v[1]){
                            case "programare":{
                                Programare p = new Programare();
                                p.denumire = v[2];
                                p.pret = Double.parseDouble(v[3]);
                                Institutie.getInstance().adaugaCurs(p);
                            }break;
                            case "limbi_straine":{
                                LimbiStraine ls = new LimbiStraine();
                                ls.denumire = v[2];
                                ls.pret = Double.parseDouble(v[3]);
                                Institutie.getInstance().adaugaCurs(ls);
                            }break;
                        }
                    }catch(PreaMulteCursuriException e){
                        System.out.println(e.getMessage());
                    }
                }break;
                case "afisare":{
                    Institutie.getInstance().afiseazaCursuri();
                }break;
                case "afisare_cursuri_programare":{
                    Institutie.getInstance().afiseazaCursuriProgramare();
                }break;
                case "afisare_cursuri_limbi_straine":{
                    Institutie.getInstance().afiseazaCursuriLimbiStraine();
                }break;
                case "sterge_curs":{
                    int i = Integer.parseInt(v[1]);
                    Institutie.getInstance().stergeCurs(i);
                }break;
            }
        }
    }
}