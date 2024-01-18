package com.fastcampus.projectboard.repository;

import com.fastcampus.projectboard.damain.UserAccount;
import com.fastcampus.projectboard.damain.projection.UserAccountProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = UserAccountProjection.class)
public interface UserAccountRepository extends JpaRepository<UserAccount, String> {
}