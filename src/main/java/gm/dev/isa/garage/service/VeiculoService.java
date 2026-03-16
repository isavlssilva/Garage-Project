/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.dev.isa.garage.service;

import gm.dev.isa.garage.Veiculo.DTO.VeiculoMinDTO;
import gm.dev.isa.garage.entities.Veiculo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import gm.dev.isa.garage.repositories.VeiculoRepository;

/**
 *
 * @author digma
 */
@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    //EndPoint todos os caros
    public List<Veiculo> findAll() {

        List<Veiculo> result = veiculoRepository.findAll();
        return result;
    }

    //EndPoint Id
    public List<Veiculo> findByID(int id) {

        List<Veiculo> result = veiculoRepository.findById(id);
        return result;
    }

    //EndPoint cor
    public List<Veiculo> findByCor(String cor) {

        List<Veiculo> result = veiculoRepository.findByCorIgnoreCase(cor);
        return result;
    }

    //EndPoint ano
    public List<VeiculoMinDTO> findByAno(int ano) {
        List<Veiculo> resultVeiculo = veiculoRepository.findByAno(ano);

        List<VeiculoMinDTO> resultDTO = resultVeiculo.stream().map(x -> new VeiculoMinDTO(x)).toList();

        return resultDTO;
    }

    public Veiculo salvarVeiculo(Veiculo novoVeiculo) {
        Veiculo veiculo = veiculoRepository.save(novoVeiculo);
        return veiculo;
    }
}
