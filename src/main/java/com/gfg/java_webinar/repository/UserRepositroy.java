package com.gfg.java_webinar.repository;

import com.gfg.java_webinar.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
public interface UserRepositroy extends JpaRepository<User, String> {

}
