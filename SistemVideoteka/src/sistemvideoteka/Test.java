
package sistemvideoteka;

import java.util.HashMap;


public class Test {
    
    public static void main (String []args){
        
        Osoba o1=new Osoba("Marko","Bakoc","1801901230081","Partizanskih baza 4","Srbija","18_08_1981");
        
        System.out.println(o1);
        o1.setIme("Petar Pera");
        o1.getIme();
        System.out.println(o1);
        
        Disk d1=new Disk("1234A231","DVD",7800,"Akcioni",120,"Umri muski");
        Disk d2=new Disk("32er454","DVD",7500,"Akcioni",130,"Bilo jednom u Meksiku");
        Disk d3=new Disk("23498012","Blu ray",9120,"Horor",125,"Drakula");
        Disk d4=new Disk("54rfe432","DVD",8220,"Triler",140,"Dezurni krivci");
        Disk d5=new Disk("321123","Blu rey",7920,"Komedija",130,"Balkanski spijun");
        Disk d6=new Disk("2109872","DVD",8950,"Drama",150,"Bolje od bekstva");
        d1.ispisTrajanjaUMinutima();
        d1.informacijeODisku();
        HashMap<String,Disk>diskovi=new HashMap<String,Disk>();
        diskovi.put(d1.getID(), d1);
        diskovi.put(d2.getID(), d2);
        diskovi.put(d3.getID(), d3);
        diskovi.put(d4.getID(), d4);
        diskovi.put(d5.getID(), d5);
        
        Klijent k1=new Klijent(diskovi,1,"Marko","Bakoc","1801901230081","Partizanskih baza 4","Srbija","18_08_1981");
        Klijent k2=new Klijent(diskovi,1,"Nenad","Komlenic","2808984210976","Dalmatinska 12","Srbija","28_08_1984");
        Klijent k3=new Klijent(diskovi,1,"Milan","Markov","2806984090731","Radnicka 23","Srbija","28_06_1984");
        Klijent k4=new Klijent(diskovi,0.3,"Petar","Stanisic","2312943215609","Pavla Papa 3","Srbija","21_12_1987");
        System.out.println(k3);
        
        
        Radnik r1=new Radnik(32400,8,2,21,"Petar","Nikolic","1235420098711","Nova 2","Srbija","23_09_1987");
        Radnik r2=new Radnik(42000,12,1,132,"Rade","Radic","2304976120103","Lozionicka 4","Srbija","23_04_1976");
        Radnik r3=new Radnik(37900,7,3,325,"Goran","Miric","1207969001123","Nova 4","Srbija","12_07_1969");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        HashMap<String,Disk>listaDiskova=new HashMap<String,Disk>(10);
        listaDiskova.put(d1.getID(), d1);
        listaDiskova.put(d2.getID(), d2);
        listaDiskova.put(d3.getID(), d3);
        
        
        
        Ugovor u1=new Ugovor(r1,k2,listaDiskova,1,"12387YU");
        Ugovor u2=new Ugovor (r1,k1,listaDiskova,1,"11334221");
        Ugovor u3=new Ugovor(r3,k4,listaDiskova,1,"12Bf342");
        u1.iznajmljivanjeDiska(d4.getID());
       
        u1.ispisSvihDiskova();
        System.out.println(u1.iznajmljivanjeDiska(d4.getID()));
        System.out.println(u1.brojIznajmljenihDiskova());
        
        HashMap<String,Radnik>radnici=new HashMap<String,Radnik>();
        radnici.put(r1.getJmbg(), r1);
        radnici.put(r2.getJmbg(), r2);
        radnici.put(r3.getJmbg(), r3);
        
        HashMap<String,Klijent>klijenti=new HashMap<String,Klijent>();
        klijenti.put(k1.getJmbg(), k1);
        klijenti.put(k2.getJmbg(), k2);
        klijenti.put(k3.getJmbg(), k3);
        klijenti.put(k4.getJmbg(), k4);
        
         
        HashMap<String,Ugovor>ugovori=new HashMap<String,Ugovor>();
        ugovori.put(u1.getBrojUgovora(), u1);
        ugovori.put(u2.getBrojUgovora(), u2);
        ugovori.put(u3.getBrojUgovora(), u3);
        
        
        Videoteka v1=new Videoteka(radnici,klijenti,diskovi,ugovori);
        
        v1.brojDiskovaZadatogZanra("Akcioni");
        System.out.println(v1.brojDiskovaZadatogZanra("Akcioni"));
        System.out.println(v1.brojNovajlijaUgovora());
       
         v1.najboljeMusterije();
        System.out.println(v1.diskoviSaNajvecimTrajanjem());
        System.out.println(v1.brojNovajlijaUgovora());
        System.out.println(v1.prosecnaVrednostUgovora());
        System.out.println(v1.najvrednijiUgovori());
        System.out.println(v1.najboljeMusterije());
        
        
        
       
      
        
        
    }
    
}
