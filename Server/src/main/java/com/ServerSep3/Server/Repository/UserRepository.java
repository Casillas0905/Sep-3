package com.ServerSep3.Server.Repository;

import com.ServerSep3.Server.Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    UserModel findById(int id);
    UserModel findByUsername(String username);
    List<UserModel> findByGender(String gender);
}
