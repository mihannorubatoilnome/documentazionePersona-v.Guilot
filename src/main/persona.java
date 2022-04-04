package main;

/**
 * La classe Persona aiuta la sviluppatore a creare oggetti Persona
 * @author Edmard Guilot
 * @version JDK1.0
 */
public class persona {
    private String nome;
    private String cognome;
    private String codice;

    /**
     * Costruisce un oggetto dato il nome, il cognome e il codice fiscale (trasformato in automatico in maiuscolo).
     * Se il codice fiscale non e' valido allora verra' creato un oggetto Persona con tutti gli attributi con stringa vuota.
     * CONTROLLO sul CODICE FISCALE:
     * - Il codice deve essere di 16 caratteri alfanumerici
     * Il codice non deve contenere spazi
     * I primi 6 caratteri devono essere consonanti
     * Settimo e ottavo carattere devono essere numeri
     * @param nome Stringa qualsiasi da assegnare come nome di un nuovo oggetto Persona
     * @param cognome Stringa qualsiasi da assegnare come cognome di un nuovo oggetto Persona
     * @param codice Stringa che rappresenta il nuovo codice fiscale dell'oggetto Persona
     */
    public persona(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice.toUpperCase().replaceAll("\\s", "");
        
        if(this.codice.length() != 16 || codice == null || !this.codice.matches("(?i)[b-df-hj-np-tv-z]{6}[0-9]{2}[a-z0-9]{8}")){
            this.nome = "";
            this.cognome = "";
            this.codice = "";
            System.out.println("Codice Fiscale NON valido!");
        }
        
    }

    /**
     * Ricostruisce un oggetto copiato dato un oggetto persona
     * @param p Oggetto qualsiasi da assegnare per la copia di un nuovo oggetto persona
     */
    public persona(persona p){
        this.nome = p.getNome();
        this.cognome = p.getCognome();
        this.codice = p.getCodice();
    }

    /**
     * Restituisce una Stringa contenente il nome della persona
     * @return Il nome di un oggetto Persona
     */
    public String getNome() {
        return nome;
    }

    /**
     * Assegna una Stringa come nome di una persona
     * @param nome Stringa da assegnare come nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Restituisce una Stringa contenente il cognome della persona
     * @return Il cognome di un oggetto Persona
     */
    public String getCognome() {
        return cognome;
    }

    /**
     * Assegna una Stringa come cognome di una persona
     * @param cognome Stringa da assegnare come cognome
     */
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * Restituisce una Stringa contenente il codice fiscale della persona
     * @return Il codice fiscale di un oggetto Persona
     */
    public String getCodice() {
        return this.codice;
    }

    /**
     * Assegna una Stringa come codice fiscale di una persona
     * @param codice Stringa da assegnare come codice fiscale
     */
    public void setCodice(String codice) {
        this.codice = codice.toUpperCase().replaceAll("\\s", "");
        if(this.codice.length() != 16 || codice == null || !this.codice.matches("(?i)[b-df-hj-np-tv-z]{6}[0-9]{2}[a-z0-9]{8}")){
            this.nome = "";
            this.cognome = "";
            this.codice = "";
            System.out.println("Codice Fiscale NON valido!");
        }
    }

    /**
     * Il metodo stabilisce se due persone sono omonime; Restituisce un booleano: VERO se le due persone hanno lo stesso nome (senza distinzione di maiuscole e minuscole) altrimenti FALSO
     * @param p Oggetto Persona
     * @return Vero se le due persone confrontate hanno lo stesso nome, altrimenti falso
     */
    public boolean isOmino(persona p){
        if(p.getNome().equals(nome)){
            return true;
        }
        return false;
    }

    /**
     * Restituisce una rappresentazione testuale di un oggetto Persona
     * @return La rappresentazione testuale di un oggetto Persona
     */
    @Override
    public String toString(){
        return ("\nNome : "+this.nome+
        "\nCognome : "+this.cognome+
        "\nCodice Fiscale : "+this.codice+
        "\n---------------------------------------------");
    }
}
