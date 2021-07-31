package com.que.demo.h2AndJpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserInfo, Integer> {

}
