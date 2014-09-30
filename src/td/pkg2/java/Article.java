package td.pkg2.java;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Pierre Professionnel
 */
public class Article {
      private int reference; 
    private String designation;
    private double prix;
        public Article ()
        { super();
        }
    public Article(int reference)
    { this();
    setReference(reference);
    }
    
    public Article(int reference, String designation)
    { this();
    setDesignation(designation);
    setReference(reference);}
    
    public Article(int reference, String designation, double prix)
    { this();
    setPrix(prix);
    setDesignation(designation);
    setReference(reference);
    }
    
    public int getReference()
    { return this.reference;}
    
    public void setReference (int reference)
    {this.reference=reference;}
    
    public String getDesignation()
    {return this.designation;}
    
    public void setDesignation(String designation)
    {this.designation=designation;}
    
    public double getPrix()
    {return this.prix;}
    
    public void setPrix(double prix)
    {this.prix=prix;}
    
    public String toString()
    {
        return getReference()+""+getDesignation()+""+getPrix();
    }
}
