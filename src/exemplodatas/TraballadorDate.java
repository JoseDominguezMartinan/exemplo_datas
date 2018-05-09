/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodatas;

import java.util.Date;

/**
 *
 * @author jdominguezmartinan
 */
public class TraballadorDate
{
    /**
     * 1.ver data de alta
     * 2.tempo entre as duas datas
     * 3.anos de antiguidade hata hoxe
     */
    private String nome;
    private Date dataAlta;
    private Date dataBaixa;

    public TraballadorDate()
    {
    }

    public TraballadorDate(String nome,Date dataAlta,Date dataBaixa)
    {
        this.nome = nome;
        this.dataAlta = dataAlta;
        this.dataBaixa = dataBaixa;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Date getDataAlta()
    {
        return dataAlta;
    }

    public void setDataAlta(Date dataAlta)
    {
        this.dataAlta = dataAlta;
    }

    public Date getDataBaixa()
    {
        return dataBaixa;
    }

    public void setDataBaixa(Date dataBaixa)
    {
        this.dataBaixa = dataBaixa;
    }

    @Override
    public String toString()
    {
        return "TraballadorDate{"+"nome="+nome+", dataAlta="+dataAlta+", dataBaixa="+dataBaixa+'}';
    }
    
    
    
    
}
