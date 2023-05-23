import java.util.*; 
class TroppiAbbonati extends Exception{
    
}
class AbbonatiEsistente extends Exception{
    
}
class AbbonatiInesistente extends Exception{
        
}

public class Abbonati{
    HashMap<Integer, Account> accounts; 
    
    public Abbonati(){
        accounts = new HashMap<Integer, Account>(100);
    }
    
    public void aggiungiAbbonati(Account account) throws AbbonatiEsistente, TroppiAbbonati {
        if(accounts.size() >= 100)
            throw new TroppiAbbonati();
        if(accounts.containsKey(account.getN_telefono()))
            throw new AbbonatiEsistente();
        
        accounts.put(account.getN_telefono(), account);
    }
    
    public void eliminaAbbonato(int telefono) throws AbbonatiInesistente{
        if(accounts.isEmpty() || !accounts.containsKey(telefono))
            throw new AbbonatiInesistente();
        accounts.remove(telefono);
    }
    
    public Account cercaAbbonato(int telefono) throws CloneNotSupportedException, AbbonatiInesistente{
        if(accounts.isEmpty() || !accounts.containsKey(telefono))
            throw new AbbonatiInesistente();
            
        return accounts.get(telefono).clone();
    }
    
    public Account[] elencaSpedizioni(){
        Account[] tmp = (Account[])accounts.values().toArray(new Account[accounts.size()]);
        
        return tmp;
    }
}