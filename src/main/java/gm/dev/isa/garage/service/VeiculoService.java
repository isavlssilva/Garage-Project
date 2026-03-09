/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.dev.isa.garage.service;

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
    
    public List<Veiculo> findAll(){
        
        List<Veiculo> result = veiculoRepository.findAll();
        return result;
    }
    
     public List<Veiculo> findByCor(String cor){
        
        List<Veiculo> result = veiculoRepository.findByCorIgnoreCase(cor);
        return result;
    }
    
}
