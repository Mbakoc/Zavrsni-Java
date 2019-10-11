
package sistemvideoteka;


public class Disk extends DiskKonf {
    
    private String ID;
    private String tip;
    private int trajanje;
    private String zanr;
    private double cenaZaIznajmljivanje;
    private String nazivFilma;

    public Disk(String ID, String tip, int trajanje, String zanr, double cenaZaIznajmljivanje, String nazivFilma) {
        if(ValidacijaID(ID)){
        this.ID = ID;
        }else{
            System.out.println("Greska!");
            this.ID="-1";
        }
        this.tip = tip;
        this.trajanje = trajanje;
        this.zanr = zanr;
        if(ValidacijaCene(cenaZaIznajmljivanje)){
        this.cenaZaIznajmljivanje = cenaZaIznajmljivanje;
        }else{
            System.out.println("Greska!");
            this.cenaZaIznajmljivanje=-1;
        }
        this.nazivFilma = nazivFilma;
    }

    public String getID() {
        return ID;
    }

    public void setID(String noviID) {
        if(ValidacijaID(noviID)){
        this.ID = noviID;
    }else{
            System.out.println("Greska!");   
        }
    }
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public int getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(int trajanje) {
        this.trajanje = trajanje;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public double getCenaZaIznajmljivanje() {
        return cenaZaIznajmljivanje;
    }

    public void setCenaZaIznajmljivanje(double novaCenaZaIznajmljivanje) {
        if(ValidacijaCene(novaCenaZaIznajmljivanje)){
        this.cenaZaIznajmljivanje = novaCenaZaIznajmljivanje;
        }else{
            System.out.println("Greska!");
        }
    }

    public String getNazivFilma() {
        return nazivFilma;
    }

    public void setNazivFilma(String nazivFilma) {
        this.nazivFilma = nazivFilma;
    }

    @Override
    public String toString() {
        return "Naziv diska:"+nazivFilma+",ID:"+ID+", tip:"+tip+", zanr:"+zanr+
                ", trajanje:"+trajanje+", cena:"+cenaZaIznajmljivanje;
    }

    @Override
    public void ispisTrajanjaUMinutima() {
        double trajanjeMin;
        trajanjeMin=this.trajanje/60;
        System.out.println("Trajanje filma je "+trajanjeMin+" min.");
        
    }

    @Override
    public int prebrojavanjeRecinaziva() {
        String []pom=nazivFilma.split(" ");
            int brojac=0;
        for(int i=0;i<pom.length;i++){
           brojac++; 
        }
        return brojac;
    }
    
    private boolean ValidacijaCene(double cenaZaIznajmljivanje){
        if(cenaZaIznajmljivanje<0){
            return false;
        }
        return true;
    }
    private boolean ValidacijaID(String ID){
        if(ID.length()==0){
            return false;
        }
        for(int i=0;i<ID.length();i++){
            if(!Character.isLetterOrDigit(ID.charAt(i))){
                return false;
            }
        }
        return true;
    }
    
}
