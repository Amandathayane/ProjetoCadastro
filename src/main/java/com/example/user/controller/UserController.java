package com.example.user.controller;

import com.example.user.model.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author amanda
 *
 */

@RestController
@RequestMapping("/api/user")
public class UserController {


    @Autowired
    private UserService service;

    @GetMapping("/buscarUser")
    public List<User> getAlunos() {
        return this.service.pesquisaUser();
    }

    @GetMapping("/getAlunoNome")
    public User getAlunoNome(@RequestParam("nome") String nome) {
        return this.service.getByNome(nome);
    }

    @GetMapping("/curso")
    public User getCurso(@RequestParam("curso") String curso) {
        return this.service.getByCurso(curso);
    }

    @PostMapping("/cadastrarAluno")
    public void cadastroAluno(@RequestBody User user) {
        this.service.cadastroAluno(user);
    }

    @PutMapping("/alterarAluno")
    public User alterarUser(@RequestBody User user) {
        return this.service.alterarUser(user);
    }

    @DeleteMapping("/{matricula}")
    public void removerUser(@PathVariable("matricula") Integer id) {
        this.service.excluirUser(id);
    }
}
