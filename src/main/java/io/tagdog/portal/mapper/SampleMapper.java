package io.tagdog.portal.mapper;

import io.tagdog.portal.model.domain.Sample;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {

	/****** INSERT ******/
	int insertMono( Sample sample );

	/****** SELECT ******/
	Sample selectMono( Sample sample );
	Sample selectFlux( Sample sample );
	int selectFluxCount( Sample sample );

	/****** UPDATE ******/
	int updateMono( Sample sample );

	/****** DELETE : update delete_flag ******/
	int deleteMono( Sample sample );

}
