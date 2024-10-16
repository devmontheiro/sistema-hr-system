package br.com.monterio.userapi.service;

import br.com.monterio.userapi.domain.User;

import java.util.List;



public interface UserService  {

    User findById(Long id);
    List<User> findAll();
}
