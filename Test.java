
/**
 * Aggiungi qui una descrizione della classe Test
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Test
{
    public static void main (String[] args){
        Account a1 = new Account ("Giacomo", "Valle", 345678990, true);
        Account a2 = new Account ("Riccardo", "Farinati", 231231337, false);
        Account a3 = new Account ("a", "b", 546378, false);
        
        Abbonati abbonato = new Abbonati();
        
        try{
            abbonato.aggiungiAbbonati(a1);
            abbonato.aggiungiAbbonati(a2);
            abbonato.aggiungiAbbonati(a3);
        }catch (AbbonatiEsistente|TroppiAbbonati e){
            System.out.println (e); 
        }
        
        for (Account a : abbonato.elencaSpedizioni()){
            System.out.println (a);
        }; 
        
        try{
            abbonato.eliminaAbbonato (345678990); 
        }catch (AbbonatiInesistente e){
            System.out.println (e); 
        }
        
        for (Account a : abbonato.elencaSpedizioni()){
            System.out.println (a);
        }; 
        
        try{
            System.out.println (abbonato.cercaAbbonato(231231337));
        }catch (CloneNotSupportedException|AbbonatiInesistente e){
            System.out.println (e); 
        }
        
    }
}
