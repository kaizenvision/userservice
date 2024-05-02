package com.user.userservice.repositary;

import com.user.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositary extends JpaRepository<User,Long> {
}
