/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.otaviolube.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alunolab05
 */
public interface SelecaoRepository extends JpaRepository<SelecaoModel, Long>{
    List<SelecaoModel> findSelecoes();
}
