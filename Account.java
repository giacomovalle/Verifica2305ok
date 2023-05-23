
public class Account implements Cloneable{
    private String nome;
    private String cognome;
    private int n_telefono;
    private boolean tipologia_abbonamento;//true annuale   false mensile

    /**
     * Costruttore degli oggetti di classe  Account
     */
    public Account(String nome,String cognome,int n_telefono,boolean tipologia_abbonamento)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.n_telefono=n_telefono;
        this.tipologia_abbonamento=tipologia_abbonamento;
        
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setN_telefono(int n_telefono){
        this.n_telefono=n_telefono;
    }
    public void setTipologia_abbonamento(boolean tipologia_abbonamento){
        this.tipologia_abbonamento=tipologia_abbonamento;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getN_telefono(){
        return n_telefono;
    }
    public boolean getTipologia_abbonamento(){
        return tipologia_abbonamento;
    }
    
    public Account clone () throws CloneNotSupportedException{
        return (Account)super.clone();
    }
    
    public String toString(){
        return "nome "+getNome()+", cognome " +getCognome()+", numero telefono " +getN_telefono()+", tipologia abbonamento"+getTipologia_abbonamento();
    }
}
