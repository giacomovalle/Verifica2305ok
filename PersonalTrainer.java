
public class PersonalTrainer
{
    private String nome;
    private String cognome;
    private int n_appuntamenti;
    
    public PersonalTrainer(String nome,String cognome,int n_appuntamenti)
    {
        this.nome=nome;
        this.cognome=cognome;
        this.n_appuntamenti=n_appuntamenti; 
        Coda <Account> coda = new Coda <Account> (); 
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setN_appuntamenti(int n_appuntamenti){
        this.n_appuntamenti=n_appuntamenti;
    }
    
    
    public String getNome(){
        return nome;
    }
    public String getCognome(){
        return cognome;
    }
    public int getN_appuntamenti(){
        return n_appuntamenti;
    }
    
    
    public Account clone () throws CloneNotSupportedException{
        return (Account)super.clone();
    }
    
    public String toString(){
        return "nome "+getNome()+", cognome " +getCognome()+", numero di appuntamenti " +getN_appuntamenti();
    }
}
