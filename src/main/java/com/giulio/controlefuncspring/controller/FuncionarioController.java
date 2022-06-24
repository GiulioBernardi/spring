package com.giulio.controlefuncspring.controller;

import com.giulio.controlefuncspring.model.Funcionario;
import com.giulio.controlefuncspring.repository.FuncionarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Funcionario createFuncionario(@RequestBody Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public void deleteFuncionario(@PathVariable("id") Long id){
        funcionarioRepository.deleteById(id);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void updateFuncionario(@PathVariable("id") Funcionario funcionario){
        funcionarioRepository.save(funcionario);
    }



}
