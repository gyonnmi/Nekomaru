package com.example.board.service;

import com.example.board.dao.UserDao;
import com.example.board.dto.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// 트랜잭션 단위로 실행될 메소드를 선언하고 있는 클래스
// 스프링이 관리하는 Bean
@Service
@RequiredArgsConstructor // lombok이 final 필드를 초기화 하는 생성자를 자동으로 생성한다.
public class UserService {
    private final UserDao userDao;
    /* final 필드를 초기화 하는 생성자(반드시 필요)
    // 스프링이 UserService를 Bean으로 생성할 때 생성자를 이용해 생성을 하는데, 이때 UserDao Bean이 있는지 보고
    // 그 Bean을 주입한다. 생성자 주입.
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }
    */

    // 보통 서비스에서는 @Transactional을 붙여서 하나의 트랜잭션으로 처리하게 한다.
    // 스프링부트는 트랜잭션을 처리해주는 트랜잭션 관리자를 가지고 있다.
    @Transactional
    public User addUser(String name, String email, String password) {
        // 트랜잭션이 시작된다.
        User user = userDao.addUser(email, name, password);
        userDao.mappingUserRole(user.getUserId()); // 권한을 부여한다.
        return user;
        // 트랜잭션이 끝난다.
    }
}
