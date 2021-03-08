package io.tagdog.portal.mapper;

import io.tagdog.portal.common.mapper.BaseMapper;
import io.tagdog.portal.model.domain.Sample;
import io.tagdog.portal.model.enums.ResultStatus;
import io.tagdog.portal.model.vo.Result;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface SampleMapper {

	/****** INSERT ******/
	int insertSampleSingle( Sample sample );

	/****** SELECT ******/
	Sample selectSampleSingle( Sample sample );

	/****** UPDATE ******/
	int updateSampleSingle( Sample sample );

	/****** DELETE : update delete_flag ******/
	int deleteSampleSingle( Sample sample );

	/****** ERASE ******/
	int eraseSampleSingle( Sample sample );

}
