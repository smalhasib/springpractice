package com.hasib.springpractice.mapper;

import com.hasib.springpractice.dto.ClubDto;
import com.hasib.springpractice.models.Club;

import java.util.stream.Collectors;

public class ClubMapper {

    public static Club mapToClub(ClubDto clubDto) {
        return Club.builder()
                .id(clubDto.getId())
                .title(clubDto.getTitle())
                .photoUrl(clubDto.getPhotoUrl())
                .content(clubDto.getContent())
                .createdOn(clubDto.getCreatedOn())
                .updatedOn(clubDto.getUpdatedOn())
                .build();
    }

    public static ClubDto mapToClubDto(Club club) {
        return ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreatedOn())
                .updatedOn(club.getUpdatedOn())
                .events(club.getEvents().stream().map(EventMapper::mapToEventDto).collect(Collectors.toList()))
                .build();
    }
}
