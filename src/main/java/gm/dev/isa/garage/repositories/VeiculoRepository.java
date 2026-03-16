/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gm.dev.isa.garage.repositories;

import gm.dev.isa.garage.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author digma
 */
public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByCorIgnoreCase(String cor);

    List<Veiculo> findByAno(int ano);

    List<Veiculo> findById(int id);
}
