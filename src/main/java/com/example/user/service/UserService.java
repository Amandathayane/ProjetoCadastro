package com.example.user.service;

import com.example.user.model.User;
import com.example.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author amanda
 *
 */

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> pesquisaUser() {
        return this.repository.findAll();
    }

    public User getByNome(String nome) {
        return this.repository.findByNome(nome);
    }

    public User getByCurso(String curso) {
        return this.repository.findByCurso(curso);
    }

    public void cadastroAluno(User user) {
        this.repository.save(user);
    }

    public User alterarUser(User cadastro) {
        return this.repository.save(cadastro);
    }

    public void excluirUser(Integer matricula) {
        this.repository.deleteById(matricula);
    }
}
