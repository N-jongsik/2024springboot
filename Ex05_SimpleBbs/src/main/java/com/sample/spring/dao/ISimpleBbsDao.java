package com.sample.spring.dao;

import java.util.List;

import com.sample.spring.dto.SimpleBbsDto;

public interface ISimpleBbsDao {
	public List<SimpleBbsDto> listDao();

	public Integer countDao();

	public SimpleBbsDto viewDao(String id);

	public int writeDao(String writer, String title, String content); // id는 자동으로 증가함

	public int delete(String id);

}
