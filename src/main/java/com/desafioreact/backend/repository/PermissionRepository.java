package com.desafioreact.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafioreact.backend.model.UserPermission;

@Repository
public interface PermissionRepository extends JpaRepository<UserPermission, Long>{ 
}
