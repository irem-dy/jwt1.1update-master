package com.jwtexample.jwt11.repo;
import com.jwtexample.jwt11.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String username);

    User findByRole(String role);
}