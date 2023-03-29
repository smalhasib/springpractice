package com.hasib.springpractice.service.impl;

import com.hasib.springpractice.dto.ClubDto;
import com.hasib.springpractice.mapper.ClubMapper;
import com.hasib.springpractice.models.Club;
import com.hasib.springpractice.repository.ClubRepository;
import com.hasib.springpractice.service.ClubService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static com.hasib.springpractice.mapper.ClubMapper.mapToClub;
import static com.hasib.springpractice.mapper.ClubMapper.mapToClubDto;

@Service
public class ClubServiceImpl implements ClubService {

    private final ClubRepository clubRepository;

    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        return clubRepository.findAll().stream().map(ClubMapper::mapToClubDto).collect(Collectors.toList());
    }

    @Override
    public Club saveClub(Club club) {
        return clubRepository.save(club);
    }

    @Override
    public ClubDto findClubById(long clubId) {
        Club club = clubRepository.findById(clubId).get();
        return mapToClubDto(club);
    }

    @Override
    public void updateClub(ClubDto club) {
        clubRepository.save(mapToClub(club));
    }

    @Override
    public void deleteClub(long clubId) {
        clubRepository.deleteById(clubId);
    }

    @Override
    public List<ClubDto> searchQuery(String query) {
        return clubRepository.searchClubs(query).stream().map(ClubMapper::mapToClubDto).collect(Collectors.toList());
    }
}
