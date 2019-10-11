
package sistemvideoteka;

import java.util.HashMap;

public class Ugovor implements IUgovor{
    
    private Radnik radnik;
    private Klijent klijent;
    private HashMap<String,Disk>listaDiskova;
    private double ukupnaCena;
    private double popust;
    private String brojUgovora;

    public Ugovor(Radnik radnik, Klijent klijent, HashMap<String, Disk> listaDiskova, double popust,String brojUgovora) {
        this.radnik = radnik;
        this.klijent = klijent;
        this.listaDiskova = listaDiskova;
        this.popust = popust; 
        this.ukupnaCena = ukupnaCena();
        this.brojUgovora=brojUgovora;
       
    }
    
    private double ukupnaCena(){
        double suma=0;
        for(Disk d:listaDiskova.values()){
            suma+=d.getCenaZaIznajmljivanje();
        }
        for(Disk d:listaDiskova.values()){
            if(listaDiskova.size()>5){
                suma+=d.getCenaZaIznajmljivanje()*popust;
            }
        }
        return suma;
    }

    public Radnik getRadnik() {
        return radnik;
    }

    public void setRadnik(Radnik radnik) {
        this.radnik = radnik;
    }

    public Klijent getKlijent() {
        return klijent;
    }

    public void setKlijent(Klijent klijent) {
        this.klijent = klijent;
    }

    public HashMap<String, Disk> getListaDiskova() {
        return listaDiskova;
    }

    public void setListaDiskova(HashMap<String, Disk> listaDiskova) {
        this.listaDiskova = listaDiskova;
    }

    public double getUkupnaCena() {
        return ukupnaCena;
    }

    public void setUkupnaCena(double ukupnaCena) {
        this.ukupnaCena = ukupnaCena;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    
    public String getBrojUgovora(){
        return brojUgovora;
    }
    
    public void setBrojUgovora(String brojUgovora){
        this.brojUgovora=brojUgovora;
    }

    @Override
    public HashMap<String, Disk> iznajmljivanjeDiska(String ID) {
        for(Disk d:listaDiskova.values()){
            if(d.getID().equals(ID)){
                System.out.println("Disk je vec iznajmljen!");
                break;
            }
        }
        HashMap<String,Disk>iznajmljeniDiskovi=new HashMap<String,Disk>(10);
        for(Disk d:listaDiskova.values()){
            if(!d.getID().equals(ID)){
            iznajmljeniDiskovi.put(ID, d);
             }
        }   
        return iznajmljeniDiskovi;
    }

    @Override
    public void ispisSvihDiskova() {
        for(Disk d:listaDiskova.values()){
            System.out.println(d);
        }
    }

    @Override
    public int brojIznajmljenihDiskova() {
        int brojac=0;
        for(Disk d:listaDiskova.values()){
            brojac++;
        }
        return brojac;
    }

    @Override
    public HashMap<String, Disk> vracanjeDiskova(String ID) {
        
        for(Disk d:listaDiskova.values()){
            if(!d.getID().equals(ID)){
                System.out.println("Disk nije iznajmljivan!"); 
               break; 
            }
        }
        HashMap<String,Disk>vraceniDiskovi=new HashMap<String,Disk>(10) ;
        for(Disk d:listaDiskova.values()){
            if(d.getID().equals(ID)){
             vraceniDiskovi.remove(ID);
            }
        }
        return vraceniDiskovi;
    }

    @Override
    public String toString() {
        return "Ugovor{" + "radnik=" + radnik + ", klijent=" + klijent + ", listaDiskova=" + listaDiskova + ", ukupnaCena=" + ukupnaCena + ", popust=" + popust + ", brojUgovora=" + brojUgovora + '}';
    }
    
    
    
    
    
    
    
    
}
