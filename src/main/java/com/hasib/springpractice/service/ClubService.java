package com.hasib.springpractice.service;

import com.hasib.springpractice.dto.ClubDto;
import com.hasib.springpractice.models.Club;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();

    Club saveClub(Club club);

    ClubDto findClubById(long clubId);

    void updateClub(ClubDto club);

    void deleteClub(long clubId);

    List<ClubDto> searchQuery(String query);
}
