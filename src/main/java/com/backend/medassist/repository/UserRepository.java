package com.backend.medassist.repository;

import com.backend.medassist.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String> {
}
