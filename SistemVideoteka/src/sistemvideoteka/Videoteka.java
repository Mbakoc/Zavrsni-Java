
package sistemvideoteka;

import java.util.HashMap;


public class Videoteka implements IVideoteka{
    
    private HashMap<String,Radnik>radnici;
    private HashMap<String,Klijent>klijenti;
    private HashMap<String,Disk>diskovi;
    private HashMap<String,Ugovor>ugovori;

    public Videoteka(HashMap<String, Radnik> radnici, HashMap<String, Klijent> klijenti, HashMap<String, Disk> diskovi, HashMap<String, Ugovor> ugovori) {
        this.radnici = radnici;
        this.klijenti = klijenti;
        this.diskovi = diskovi;
        this.ugovori = ugovori;
    }

    public HashMap<String, Radnik> getRadnici() {
        return radnici;
    }

    public void setRadnici(HashMap<String, Radnik> radnici) {
        this.radnici = radnici;
    }

    public HashMap<String, Klijent> getKlijenti() {
        return klijenti;
    }

    public void setKlijenti(HashMap<String, Klijent> klijenti) {
        this.klijenti = klijenti;
    }

    public HashMap<String, Disk> getDiskovi() {
        return diskovi;
    }

    public void setDiskovi(HashMap<String, Disk> diskovi) {
        this.diskovi = diskovi;
    }

    public HashMap<String, Ugovor> getUgovori() {
        return ugovori;
    }

    public void setUgovori(HashMap<String, Ugovor> ugovori) {
        this.ugovori = ugovori;
    }

    @Override
    public HashMap<String,Ugovor> najboljeMusterije() {
       double max=0;
       for(Ugovor u:ugovori.values()){
           max=u.getUkupnaCena();
           break;
       }
       for(Ugovor u:ugovori.values()){
           if(u.getUkupnaCena()>max){
               max=u.getUkupnaCena();
           }
       }
       HashMap<String,Ugovor>najboljeMusterije=new HashMap<String,Ugovor>();
       for(Ugovor u:ugovori.values()){
           if(u.getUkupnaCena()==max){
               najboljeMusterije.put(u.getKlijent().jmbg, u);
           }
       }
       return najboljeMusterije;
    }

    @Override
    public HashMap<String, Radnik> najlosijeNovajlije() {
        int min=0;
        for(Radnik r:radnici.values()){
            if(r.isNovajlija()){
                min=r.getBrojIzdatihDiskova();
                break;
            }
        }
        for(Radnik r:radnici.values()){
            if(r.getBrojIzdatihDiskova()<min&&r.isNovajlija()){
                min=r.getBrojIzdatihDiskova();
            }
        }
        
        HashMap<String,Radnik>najlosijeNovajlije=new HashMap<String,Radnik>();
        for(Radnik r:radnici.values()){
            if(r.getBrojIzdatihDiskova()<min&&r.isNovajlija()){
                najlosijeNovajlije.put(r.getJmbg(), r);
            }
        }
        return najlosijeNovajlije;
    }

    @Override
    public HashMap<String, Ugovor> najvrednijiUgovori() {
       double max=0;
       for(Ugovor u:ugovori.values()){
           max=u.getUkupnaCena();
           break;
       }
       for(Ugovor u:ugovori.values()){
           if(u.getUkupnaCena()>max){
               max=u.getUkupnaCena();
           }
       }
       HashMap<String,Ugovor>najskupljiUgovori=new HashMap<String,Ugovor>();
       for(Ugovor u:ugovori.values()){
           if(u.getUkupnaCena()==max){
               najskupljiUgovori.put(u.getBrojUgovora(), u);
           }
       }
       return najskupljiUgovori;
    }

    @Override
    public HashMap<String, Disk> diskoviSaNajvecimTrajanjem() {
       int max=0;
       for(Disk d:diskovi.values()){
           max=d.getTrajanje();
           break;
       }
       for(Disk d:diskovi.values()){
           if(d.getTrajanje()>max){
               max=d.getTrajanje();
           }
       }
       HashMap<String,Disk>najduziDiskovi=new HashMap<String,Disk>();
       for(Disk d:diskovi.values()){
           if(d.getTrajanje()==max){
               najduziDiskovi.put(d.getID(), d);
           }
       }
       return najduziDiskovi;
    }

    @Override
    public int brojDiskovaZadatogZanra(String zanr) {
        int brojac=0;
        for(Disk d:diskovi.values()){
            if(d.getZanr().equals(zanr)){
                brojac++;
            }
        }
        return brojac;
    }

    @Override
    public double prosecnaVrednostUgovora() {
        double suma=0;
        double prosek=0;
        for(Ugovor u:ugovori.values()){
            suma+=u.getUkupnaCena();
        }
        return prosek=suma/ugovori.size();
    }

    @Override
    public int brojNovajlijaUgovora() {
        int brojac=0;
       for(Ugovor u:ugovori.values()){
           if(u.getRadnik().isNovajlija()&&ugovori.size()>0){
               brojac++;
           }
       }
       return brojac;
    }

    @Override
    public HashMap<String, Ugovor> kupacSaNajduzimImenomUgovora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
