
package sistemvideoteka;

import java.util.HashMap;


public class Klijent extends Osoba {
    
    private HashMap<String,Disk>diskovi;
    private double ukupnaCenaZaPlacanje;
    private  double popust;

    public Klijent(HashMap<String, Disk> diskovi,double popust, String ime, String prezime, String jmbg, String adresa, String drzava, String datumRodjenja) {
        super(ime, prezime, jmbg, adresa, drzava, datumRodjenja);
        this.diskovi = diskovi;
        this.popust =popust ;
        this.ukupnaCenaZaPlacanje =RacunanjeUkupneCene() ;
       
    }

    private double RacunanjeUkupneCene(){
        double suma=0;
        for(Disk d:diskovi.values()){
            suma+=d.getCenaZaIznajmljivanje();
        }
        
            return suma;
    }
  
        
    public HashMap<String, Disk> getDiskovi() {
        return diskovi;
    }

    public void setDiskovi(HashMap<String, Disk> diskovi) {
        this.diskovi = diskovi;
    }

    @Override
    public String toString() {
        return "Klijent: Ime i prezime: " + super.ime+" "+super.prezime+", jmbg:"+super.jmbg+
                ",Adresa: "+super.adresa+", drzava: "+super.drzava+", datum rodjenja:"+super.datumRodjenja
                +", iznajmljeni diskovi:"+diskovi+ ", cena za placanje:"+ukupnaCenaZaPlacanje;
    }
    
    
    
    
}
