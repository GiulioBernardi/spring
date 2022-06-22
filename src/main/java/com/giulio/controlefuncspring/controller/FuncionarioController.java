package com.giulio.controlefuncspring.controller;

import com.giulio.controlefuncspring.model.Funcionario;
import com.giulio.controlefuncspring.repository.FuncionarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
public class FuncionarioController {

    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }


    @GetMapping
    public List<Funcionario> list(){
        return funcionarioRepository.findAll();
    }

}
