package com.educshare.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.educshare.entities.AppRole;
@RepositoryRestResource
public interface AppRoleRepository extends JpaRepository<AppRole, Long>{
	public AppRole findByRoleName(String roleName);
}
