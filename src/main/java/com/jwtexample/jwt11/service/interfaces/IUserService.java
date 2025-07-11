package com.jwtexample.jwt11.service.interfaces;

import com.jwtexample.jwt11.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface IUserService extends UserDetailsService {
    void save(User user);
    List<User> findAll();
    User findById(Long id);
    void update(User user);
    void delete(Long id);

    // User yerine UserDetails dönmeli
    @Override
    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
