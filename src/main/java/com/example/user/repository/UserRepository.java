package com.example.user.repository;
import com.example.user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author amanda
 *
 */

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByNome(String nome);
    User findByCurso(String curso);
}
