package io.tagdog.portal.mapper;

import io.tagdog.portal.model.domain.Sample;
import io.tagdog.portal.model.vo.Search;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SampleMapper {

	/****** INSERT ******/
	int insertMono( Sample sample );

	/****** SELECT ******/
	Sample selectMono( Sample sample );
	List<Sample> selectFlux( Search<Sample> search );
	int selectFluxCount( Search<Sample> search );

	/****** UPDATE ******/
	int updateMono( Sample sample );
	int updateMonoDelAt( Sample sample );

	/****** DELETE : update delete_flag ******/
	int deleteMono( Sample sample );

}
