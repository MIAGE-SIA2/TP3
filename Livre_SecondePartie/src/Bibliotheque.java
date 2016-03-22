import java.util.ArrayList;


/**
 * Write a description of class Bibliotheque here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bibliotheque
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Livre> l;
    /**
     * Constructor for objects of class Bibliotheque
     */
    public Bibliotheque()
    {
        // initialise instance variables
        x = 0;
        l = new ArrayList<Livre>();
        
    }
    
    public void setLivres(ArrayList<Livre> l)
    {
    	this.l = l;
    }
    
    public ArrayList<Livre> getLivres()
    {
    	return this.l;
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
    
    public int rendu_monnaie(int monnaie)
    {
    	int res;
    	int i;
    	res = 0;
    	for(i=0; i< this.l.size(); i++)
    	{
    		res = res + rendre_monnaie_Un_Livre(monnaie, i);
    	}
        return res;
    }
    
    public int rendre_monnaie_Un_Livre(int monnaie, int position)
    {
    	if (monnaie>= this.l.get(position).getPrix())
    	{
    		return (monnaie-this.l.get(position).getPrix());
    	}
    	else
    	{
    		return -1;
    	}
    }
    
    
    
    
    
    /*
     * public int rendu_monnaie(int monnaie)
    {
    	int res;
    	int i;
    	res = 0;
    	for(i=0; i< this.l.size(); i++)
    	{
    		res = res + (monnaie-this.l.get(i).augmenter_prix(2));
    	}
        return res;
    }
     * 
     */
}
