package com.kh.swith.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kh.swith.dto.StudyDto;


public interface StudyDao {
	public String NAMESPACE = "swith.studymapper.";
	public List<StudyDto> selectStudyList();
	public StudyDto selectOneStudy(int study_group_id);
	public int insertStudy(StudyDto dto);
	public int updateStudy(StudyDto dto);
}