
package sistemvideoteka;




public class Radnik extends Osoba {
    
    private double plata;
    private int godineStaza;
    private int smena;
    private boolean novajlija;
    private int brojIzdatihDiskova;

    public Radnik(double plata, int godineStaza, int smena,int brojIzdatihDiskova,String ime, String prezime, String jmbg, String adresa, String drzava, String datumRodjenja) {
        super(ime, prezime, jmbg, adresa, drzava, datumRodjenja);
        this.plata = plata;
        this.godineStaza = godineStaza;
        if(ValidacijaSmene(smena)){
        this.smena =smena;
        }else{
            System.out.println("Greska pri unosu smene");
            this.smena=-1;
        }
        this.brojIzdatihDiskova =brojIzdatihDiskova ;
        this.novajlija = Novajlija();
        
    }
    private boolean Novajlija(){
        if(brojIzdatihDiskova<50){
            return true;
        }else{
            return false;
        }
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getGodineStaza() {
        return godineStaza;
    }

    public void setGodineStaza(int godineStaza) {
        this.godineStaza = godineStaza;
    }

    public int getSmena() {
        return smena;
    }

    public void setSmena(int smena) {
        this.smena = smena;
    }

    public boolean isNovajlija() {
        return novajlija;
    }

    public void setNovajlija(boolean novajlija) {
        this.novajlija = novajlija;
    }

    public int getBrojIzdatihDiskova() {
        return brojIzdatihDiskova;
    }

    public void setBrojIzdatihDiskova(int brojIzdatihDiskova) {
        this.brojIzdatihDiskova = brojIzdatihDiskova;
    }

    @Override
    public String toString() {
        return "Radnik:Ime i prezime: " + super.ime+" "+super.prezime+", jmbg:"+super.jmbg+
                ", Adresa:"+super.adresa+", drzava: "+super.drzava+", datum rodjenja:"+super.datumRodjenja+
                ", plata: "+plata+", godine staza:"+godineStaza+", smena:"+smena+", novajlija;"+Novajlija()+", broj izdatih diskova:"+
                brojIzdatihDiskova;
             
    }    


    private boolean ValidacijaSmene(int smena){
        if(smena==1){
            System.out.println("Prva smena");
            return true;
        }else if(smena==2){
            System.out.println("Druga smena");
            return true;
        }else if(smena==3){
            System.out.println("Treca smena");
            return true;
        }else{
            System.out.println("Greska,nepostojeca smena!");
            return false;
        }
    }
    
       
}      
       
   
    
    

