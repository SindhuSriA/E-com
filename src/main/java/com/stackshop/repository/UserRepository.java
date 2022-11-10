package com.stackshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackshop.model.UserModel;
@Repository
public interface UserRepository extends CrudRepository<UserModel, Long> {

}
