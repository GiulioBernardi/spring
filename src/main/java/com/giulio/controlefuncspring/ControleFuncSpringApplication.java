package com.giulio.controlefuncspring;

import com.giulio.controlefuncspring.model.Funcionario;
import com.giulio.controlefuncspring.repository.FuncionarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ControleFuncSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleFuncSpringApplication.class, args);
    }

    @Bean
    CommandLineRunner initDatabase(FuncionarioRepository funcionarioRepository){
        return args -> {
            funcionarioRepository.deleteAll();

            Funcionario f = new Funcionario();

            f.setNome("Carlos");
            f.setIdade(20);

            funcionarioRepository.save(f);
        };
    }

}
