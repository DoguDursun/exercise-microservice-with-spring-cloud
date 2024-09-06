package com.exercise.microservice.user_service.Repository;

import com.exercise.microservice.user_service.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<User,Long> {
}
