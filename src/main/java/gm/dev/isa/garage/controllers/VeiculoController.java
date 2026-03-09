/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gm.dev.isa.garage.controllers;

import gm.dev.isa.garage.entities.Veiculo;
import gm.dev.isa.garage.service.VeiculoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author digma
 */

@RestController
public class VeiculoController {
    
    @Autowired
    private VeiculoService veiculoService;
    
    @GetMapping("/forsale")
    public List<Veiculo> findAll(){
        List<Veiculo> result = veiculoService.findAll();
        return result;
        
    }
    
}
