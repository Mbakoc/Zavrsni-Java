
package sistemvideoteka;

import java.util.HashMap;

public interface IUgovor {
    
    HashMap<String,Disk>iznajmljivanjeDiska(String ID);
    void ispisSvihDiskova();
    int brojIznajmljenihDiskova();
    HashMap<String,Disk>vracanjeDiskova(String ID);
    
    
}
