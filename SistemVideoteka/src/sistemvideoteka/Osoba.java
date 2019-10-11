
package sistemvideoteka;


public class Osoba implements IOsoba{
    
    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected String adresa;
    protected String drzava;
    protected String datumRodjenja;

    public Osoba(String ime, String prezime, String jmbg, String adresa, String drzava, String datumRodjenja) {
        if(ValidacijaImena(ime)){
        this.ime = ime;
        }else{
            System.out.println("Greska pri unosu imena!");
            this.ime="-1";
        }
        if(ValidacijaPrezimena(prezime)){
        this.prezime = prezime;
        }else{
            System.out.println("Greska pri unosu prezimena!");
            this.prezime="-1";
        }
        if(ValidacijaJmbg(jmbg)){
            this.jmbg=jmbg;
        }else{
            System.out.println("Greska pri unosu jmbg!");
        this.jmbg = "-1";
        }
        if(ValidacijaAdrese(adresa)){
        this.adresa = adresa;
        }else{
            System.out.println("Greska pri unosu adrese!");
            this.adresa="-1";
        }
        if(ValidacijaDrzave(drzava)){
        this.drzava = drzava;
        }else{
            System.out.println("Greska pri unosu drzave!");
            this.drzava="-1";
        }
        if(ValidacijaDatuma(datumRodjenja)){
        this.datumRodjenja = datumRodjenja;
        }else{
            System.out.println("Greska pri unosu datuma rodjenja!");
            this.datumRodjenja="-1";
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String novoIme) {
        if(ValidacijaImena(novoIme)){
        this.ime = novoIme;
        }else{
            System.out.println("Greska pri unosu imena!");
        }
    }
    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String novoPrezime) {
        if(ValidacijaPrezimena(novoPrezime)){
        this.prezime = novoPrezime;
    }else{
            System.out.println("Greska pri unosu prezimena!");
    }
}
    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String noviJmbg) {
        if(ValidacijaJmbg(noviJmbg)){
        this.jmbg = noviJmbg;
        }else{
            System.out.println("Greska pri unosu jmbg!");
        }
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String novaAdresa) {
        if(ValidacijaAdrese(novaAdresa)){
        this.adresa = novaAdresa;
    }else{
            System.out.println("Greska pri unosu adrese!");
        }
    }    
    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String novaDrzava) {
        if(ValidacijaDrzave(novaDrzava)){
        this.drzava = novaDrzava;
    }else{
            System.out.println("Greska pri upisu drzave!");   
         }
    }
    public String getDatumRodjenja() {
        return datumRodjenja;
    }

    public void setDatumRodjenja(String noviDatumRodjenja) {
        if(ValidacijaDatuma(noviDatumRodjenja)){
        this.datumRodjenja = noviDatumRodjenja;
        }else{
            System.out.println("Greska pri unosu datuma rodjenja"); 
        }
    }

    @Override
    public String toString() {
        return  "Ime i prezime: " + ime + " " + prezime + ", jmbg: " + jmbg + ", adresa: " + adresa + ", drzava:" + drzava + ", datumRodjenja: " + datumRodjenja ;
    }

    @Override
    public boolean ValidacijaDatuma(String datum) {
        if(datum.length()!=10){
         return false;   
        }
        for(int i=0;i<datum.length();i++){
            if(!Character.isDigit(datum.charAt(i))&&!Character.isUnicodeIdentifierPart(datum.charAt(i))){
                return false;
            }
        }
         int brojac=0;
        for(int i=0;i<datum.length();i++){
            if(Character.isDigit(datum.charAt(i))){
                brojac ++;
                
            }
        }
        if(brojac!=8){
            return false;
        }
        
     return true;   
    }

    @Override
    public  boolean ValidacijaImena(String ime) {
        if(ime.length()==0||Character.isLowerCase(ime.charAt(0))){
            return false;
        }
      
       String []pom=ime.split(" ");
       for(int i=0;i<pom.length;i++){
           if(Character.isLowerCase(pom[i].charAt(0))){
               return false;
           }
       }
       
       for(int i=0;i<pom.length;i++){
        for(int j=1;j<pom[i].length();j++){
         if(Character.isUpperCase(pom[i].charAt(j))){
             return false;
         }   
        }   
       }
       
        return true;
    }

    @Override
    public boolean ValidacijaPrezimena(String prezime) {
        if(prezime.length()==0||Character.isLowerCase(prezime.charAt(0))){
            return false;
        }
        String []pom=prezime.split(" ");
        for(int i=0;i<pom.length;i++){
            if(Character.isLowerCase(pom[i].charAt(0))){
                return false;
            }
        }
         for(int i=0;i<pom.length;i++){
        for(int j=1;j<pom[i].length();j++){
         if(Character.isUpperCase(pom[i].charAt(j))){
             return false;
         }   
        }   
       }
        return true;
    }

    @Override
    public boolean ValidacijaDrzave(String drzava) {
      if(drzava.length()==0||Character.isLowerCase(drzava.charAt(0))){
            return false;
        }
        String []pom=drzava.split(" ");
        for(int i=0;i<pom.length;i++){
            if(Character.isLowerCase(pom[i].charAt(0))){
                return false;
            }
        }
         for(int i=0;i<pom.length;i++){
        for(int j=1;j<pom[i].length();j++){
         if(Character.isUpperCase(pom[i].charAt(j))){
             return false;
         }   
        }   
       }
        return true;  
    }
   private boolean ValidacijaJmbg(String jmbg){
       if(jmbg.length()!=13){
           return false;
       }
       for(int i=0;i<jmbg.length();i++){
           if(!Character.isDigit(jmbg.charAt(i))){
               return false;
           }
       }
       return true;
   }
   private boolean ValidacijaAdrese(String adresa){
       if(adresa.length()==0||Character.isLowerCase(adresa.charAt(0))){
           return false;
       }
       for(int i=0;i<adresa.length();i++){
           if(!Character.isLetterOrDigit(adresa.charAt(i))&&!Character.isWhitespace(adresa.charAt(i))){
               return false;
           }
       }
       return true;
   }
   
   
} 

   
  

    

    
    
    
    

