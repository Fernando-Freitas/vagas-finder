package com.bbtutorials.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.bbtutorials.users.entity.Vaga;

@RepositoryRestResource()
public interface UsersRepository extends JpaRepository<Vaga, Integer>, JpaSpecificationExecutor<Vaga>, QuerydslPredicateExecutor<Vaga> {}
