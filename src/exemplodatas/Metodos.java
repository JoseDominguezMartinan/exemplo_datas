/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodatas;

import java.time.*;
import java.util.Date;


/**
 *
 * @author jdominguezmartinan
 */
public class Metodos
{
    
    TraballadorDate traballador=new TraballadorDate("David",new Date(115,3,2),new Date()); // o ano empeza en 1900, o mes en 0, e o dia en 1 , para meter os datos hay que restar estos valores para partir dende ahi 
    TraballadorTime traballador2=new TraballadorTime("Pedro",LocalDate.of(2005,Month.JANUARY,02),LocalDate.now());
  
    public void verDataDeAlta(){
        System.out.println(traballador.getDataAlta());
    }
    public void tempoEntreDatasDate(){
       int diferenza=(int)(traballador.getDataAlta().getTime()-traballador.getDataBaixa().getTime());
       // ir dividiendo para calcular anos meses e dias
       
    }
    public void anosAntiguedadeDate(){
        int anoAlta=traballador.getDataAlta().getYear();
        int anoBaixa=traballador.getDataBaixa().getYear();
        int anosAntiguedade=anoBaixa-anoAlta;
        System.out.println(anosAntiguedade);
    } 
    public void tempoEntreDatasTime(){
        Period diferenza = traballador2.getDataAlta().until(traballador2.getDataBaixa());
        System.out.println("trabajó durante "+diferenza.getYears()+" años "+diferenza.getMonths()+" meses "+diferenza.getDays()+" días.");
        
    }    
        
        
    
}
