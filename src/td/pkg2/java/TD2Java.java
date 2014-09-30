/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td.pkg2.java;

/**
 *
 * @author Pierre Professionnel
 */
public class TD2Java {
  
    public static void main(String[] args) {
        Article a1,a2;
        a1=new Article();
            a1.setReference(100);
            a1.setDesignation("La Programation en Java");
            a1.setPrix(20.5);
            
        a2=new Article(110, "Les Méthodes d'agile", 25.5);
        
        test(a1);
        System.out.println(a1.toString());
        
        test(a2);
        System.out.println(a2.toString());
    }
    public static void test(Article a)
    {
        System.out.println("reference:" + a.getReference());
        System.out.println("designation:" + a.getDesignation());
        System.out.println("prx:" + a.getPrix()+"€");
    }
  }
