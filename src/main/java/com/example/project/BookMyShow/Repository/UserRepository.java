package com.example.project.BookMyShow.Repository;

import com.example.project.BookMyShow.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
