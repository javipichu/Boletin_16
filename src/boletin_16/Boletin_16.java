/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin_16;

/**
 *
 * @author jalvarezotero
 */
public class Boletin_16 {

    /**
     * @param args the command line arguments
     */
    
           public static void main(String[] args) {
        //crear obxectos
       Persoa per=new Persoa();
       Canario car=new Canario();
       Galo gal=new Galo();
       Tenor ten=new Tenor();
       //metodos
       per.cantar();
       car.cantar();
       gal.cantar();
       ten.cantar();
       //IPodeCantar obx=new Persoa();
       //System.out.println("*********************");
       //obx.cantar();

    }
    
}

