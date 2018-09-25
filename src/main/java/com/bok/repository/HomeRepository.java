package com.bok.repository;

import com.bok.entity.user.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HomeRepository extends JpaRepository<UserInfo,String> {



}
