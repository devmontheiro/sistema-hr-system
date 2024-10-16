package br.com.monterio.userapi.service.impl;

import br.com.monterio.userapi.domain.User;
import br.com.monterio.userapi.repositories.UserRepository;
import br.com.monterio.userapi.service.UserService;
import br.com.monterio.userapi.service.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(()-> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }
}