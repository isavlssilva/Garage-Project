/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.dev.isa.garage.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "veiculos")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;
    private String Marca;
    private String Modelo;
    private String Cor;
    private int Ano;
    private double KM;
    private String Avarias;

    @Column(name = "linkimagem")
    private String LinkImagem;

    @Column(name = "descricaocompleta")
    private String DescricaoCompleta;

    public long getId() {
        return ID;
    }

    public void setId(long ID) {
        this.ID = ID;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public double getKM() {
        return KM;
    }

    public void setKM(double KM) {
        this.KM = KM;
    }

    public String getAvarias() {
        return Avarias;
    }

    public void setAvarias(String Avarias) {
        this.Avarias = Avarias;
    }

    public String getLinkImagem() {
        return LinkImagem;
    }

    public void setLinkImagem(String LinkImagem) {
        this.LinkImagem = LinkImagem;
    }

    public String getDescricaoCompleta() {
        return DescricaoCompleta;
    }

    public void setDescricaoCompleta(String DescricaoCompleta) {
        this.DescricaoCompleta = DescricaoCompleta;
    }

    
     
    
    
    
}
