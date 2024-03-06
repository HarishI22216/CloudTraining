package com.vedam.usermanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vedam.usermanagement.model.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {

}
