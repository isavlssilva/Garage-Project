/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.dev.isa.garage.Veiculo.DTO;

import gm.dev.isa.garage.entities.Veiculo;

/**
 *
 * @author digma
 */
public class VeiculoMinDTO {
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;

    public VeiculoMinDTO() {
    }

    public VeiculoMinDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
    }

    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }
    
}



