package com.example.demo.repository;



import com.example.demo.model.AppUser;
import org.springframework.data.repository.CrudRepository;

public interface IAppUserRepository extends CrudRepository<AppUser, Long> {
    AppUser findByUsername(String username);
}
