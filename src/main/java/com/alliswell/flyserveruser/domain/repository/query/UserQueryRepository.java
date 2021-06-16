package com.alliswell.flyserveruser.domain.repository.query;

import com.alliswell.flyserveruser.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserQueryRepository extends JpaRepository<User, UUID> {}
