
package sistemvideoteka;

import java.util.HashMap;


public interface IVideoteka {
    
    HashMap<String,Ugovor>najboljeMusterije();
    HashMap<String,Radnik>najlosijeNovajlije();
    HashMap<String,Ugovor>najvrednijiUgovori();
    HashMap<String,Disk>diskoviSaNajvecimTrajanjem();
    int brojDiskovaZadatogZanra(String zanr);
    double prosecnaVrednostUgovora();
    int brojNovajlijaUgovora();
    HashMap<String,Ugovor>kupacSaNajduzimImenomUgovora();
    
    
}
