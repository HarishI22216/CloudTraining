package com.vedam.usermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vedam.usermanagement.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
