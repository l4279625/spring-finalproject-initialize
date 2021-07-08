package com.kh.swith.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.swith.dto.StudyMemberDto;

@Repository
public class StudyMemberDaoImpl implements StudyMemberDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int selectMemberCount(int study_group_id) {
		int res = 0;
		try {
			res = sqlSession.selectOne("swith.studymembermapper.StudyMemberCount", study_group_id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return res;
	}
	
	
	@Override
	public String selectRole(StudyMemberDto dto) {
		String role = null;
		try {
			role = sqlSession.selectOne("swith.studymembermapper.selectOne", dto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return role;
	}

	@Override
	public List<StudyMemberDto> studyGetList(String studyId) {
		List<StudyMemberDto> list = new ArrayList<StudyMemberDto>();
		
		try {
			list = sqlSession.selectList("swith.studymembermapper.getList", studyId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("listlistlist : " + list);
		
		return list;
	}

}
