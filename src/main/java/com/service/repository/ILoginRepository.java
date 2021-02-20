package com.service.repository;

import com.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ILoginRepository extends CrudRepository<User,Long> {

    @Query(value = "SELECT u FROM User u WHERE u.userId=:user_Id")
    public User findUserById(@Param("user_Id") Long userId);

    @Query(value="SELECT u from User u")
    public List<User> getAllUser();

}
