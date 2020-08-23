package com.rsc.card.api.repo;

import org.springframework.stereotype.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.rsc.card.api.model.DAOUser;

@Repository
public interface UserDao extends JpaRepository<DAOUser, Integer> {
	DAOUser findByUsername(String username);
}
