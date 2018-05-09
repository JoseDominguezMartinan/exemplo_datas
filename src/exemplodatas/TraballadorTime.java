/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplodatas;

import java.time.*;

/**
 *
 * @author jdominguezmartinan
 */
public class TraballadorTime
{
    private String nome;
    private LocalDate dataAlta;
    private LocalDate dataBaixa;

    public TraballadorTime()
    {
    }

    public TraballadorTime(String nome,LocalDate dataAlta,LocalDate dataBaixa)
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

    public LocalDate getDataAlta()
    {
        return dataAlta;
    }

    public void setDataAlta(LocalDate dataAlta)
    {
        this.dataAlta = dataAlta;
    }

    public LocalDate getDataBaixa()
    {
        return dataBaixa;
    }

    public void setDataBaixa(LocalDate dataBaixa)
    {
        this.dataBaixa = dataBaixa;
    }

    @Override
    public String toString()
    {
        return "TraballadorTime{"+"nome="+nome+", dataAlta="+dataAlta+", dataBaixa="+dataBaixa+'}';
    }
    
    
}
