
package jblackjack.domain.Kortit;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author pyjopy
 */
public class Korttipakka extends KorttiKokoelma{
    
    /**
     *
     */
    public Korttipakka(){
        super();
        lisaaKortit();
    }
    
    /**
     * Lisää korttipakkaan kaikki 52 korttia.
     * 
     */

    private void lisaaKortit() {
        for (int i = 1; i < 14; i++) {
            lisaaKortti(new Kortti(i, Maa.RISTI));
        }
        for (int i = 1; i < 14; i++) {
            lisaaKortti(new Kortti(i, Maa.HERTTA));
        }
        for (int i = 1; i < 14; i++) {
            lisaaKortti(new Kortti(i, Maa.PATA));
        }
        for (int i = 1; i < 14; i++) {
            lisaaKortti(new Kortti(i, Maa.RUUTU));
        }
    }
    
    /**
     * Sekoittaa korttipakan.
     */
    public void sekoitaPakka(){
        Collections.shuffle(kortit);
    }
    
    /**
     *Palauttaa yhden kortin pakasta.
     * @return
     */
    public Kortti nostaKortti(){
        if(kortit.isEmpty()){
            return null;
        }
        Kortti nostettava = kortit.get(kortit.size() - 1);
        kortit.remove(kortit.size() - 1);
        return nostettava;
    }
}
