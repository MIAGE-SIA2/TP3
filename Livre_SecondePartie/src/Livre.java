
/**
 * Write a description of class Livre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Livre
{
    // instance variables - replace the example below with your own
    private int x;
    private String auteur;
    private String titre;
    private int prix;
    private Bibliotheque b;

    /**
     * Constructor for objects of class Livre
     */
    public Livre()
    {
        // initialise instance variables
        x = 0;
        b = new Bibliotheque();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public String getAuteur()
    {
        return this.auteur;
    }
    public void setAuteur(String auteur)
    {
        this.auteur = auteur;
    }
    
    public String getTitre()
    {
        return this.titre;
    }
    
    public void setTitre(String titre)
    {
        this.titre = titre;
    }
    
    public int getPrix()
    {
        return this.prix;
    }
    
    public void setPrix(int prix)
    {
        this.prix = prix;
    }
    public int augmenter_prix (int coeff)
    {
        return this.prix*coeff;
    }
}
