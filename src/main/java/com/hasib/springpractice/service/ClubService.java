package com.hasib.springpractice.service;

import com.hasib.springpractice.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
