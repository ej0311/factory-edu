package com.factory.demo.service.impl;

import org.springframework.stereotype.Service;

import com.factory.demo.domain.sample.entity.Team;
import com.factory.demo.domain.sample.repository.TeamRepository;
import com.factory.demo.service.TeamService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TeamServiceImpl implements TeamService {
	private final TeamRepository teamRepository;
	
	@Override
	public void updateTeam(Team team) {
//		Optional<Team> team = teamRepository.findById(id);
//		team.ifPresent(saveTeam -> {
//			saveTeam.setName("New Team");
//			teamRepository.save(saveTeam);
//		});
		teamRepository.save(team);
	}
}
