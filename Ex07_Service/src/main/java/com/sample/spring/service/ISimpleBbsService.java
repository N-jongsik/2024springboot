package com.sample.spring.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sample.spring.dto.SimpleBbsDto;

public interface ISimpleBbsService {
	public List<SimpleBbsDto> listDao();

	public Integer countDao();

	public SimpleBbsDto viewDao(String id);

	public int writeDao(String writer, String title, String content); // id는 자동으로 증가함

	public int delete(@Param("_id") String id);
}
