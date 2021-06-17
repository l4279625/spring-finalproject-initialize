package com.kh.swith.calendar.dao;

import java.util.List;

import com.kh.swith.calendar.dto.CalendarDto;

public interface CalendarDao {
	public List<CalendarDto> selectList();
	public CalendarDto selectOne(int calendar_id);
	public int insert(CalendarDto dto);
	public int update(CalendarDto dto);
	public int delete(int calendar_id);
}