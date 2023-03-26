package com.example.board.dao;

import com.example.board.dto.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// 스프링이 관리하는 Bean
@Repository
public class UserDao {

    @Transactional
    public User addUser(String name, String email, String password) {
        // Service에서 이미 트랜잭션이 시작했기 때문에, 그 트랜잭션에 포함된다.
        // insert into user (email, name, password, regdate)
        // values (:email, :name , :password, now()); # user_id auto gen
        // select last_insert_id();
        return null;
    }

    @Transactional
    public void mappingUserRole(int userId) {
        // insert into user_role (user_id, role_id) values (?, 1);
    }

}

