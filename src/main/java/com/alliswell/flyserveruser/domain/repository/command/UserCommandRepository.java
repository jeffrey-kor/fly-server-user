package com.alliswell.flyserveruser.domain.repository.command;

import com.alliswell.flyserveruser.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserCommandRepository extends JpaRepository<User, UUID> {}
