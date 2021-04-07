package com.factory.demo.domain.sample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factory.demo.domain.sample.entity.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
	List<Team> findAllByIdAndName(Long id, String name);

}