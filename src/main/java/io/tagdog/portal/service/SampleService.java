package io.tagdog.portal.service;

import io.tagdog.portal.common.service.BaseService;
import io.tagdog.portal.mapper.SampleMapper;
import io.tagdog.portal.model.domain.Sample;
import io.tagdog.portal.model.enums.ResultStatus;
import io.tagdog.portal.model.vo.Result;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Service("sampleService")
@Transactional
@Slf4j
@AllArgsConstructor
public class SampleService {


	/************ INJECTION ************/

	@Resource
	private SampleMapper sampleMapper;


	/************ SERVICE METHOD : Service business logic ************/

	/****** INSERT ******/

	/**
	 * @param sample insert sample data
	 * @return insert sample data
	 */
	public Sample insertSampleSingle( Sample sample ) {
		if ( sampleMapper.insertSampleSingle( sample ) > 0 ) return sample;
		else return null;
	}

	/****** SELECT ******/

	/**
	 * @param sample select sample data
	 * @return select sample data
	 */
	public Sample selectSampleSingle( Sample sample ) {
		return sampleMapper.selectSampleSingle( sample );
	}

	/****** UPDATE ******/

	/**
	 * @param sample update sample data
	 * @return update sample data
	 */
	public Sample updateSampleSingle( Sample sample ) {
		if ( sampleMapper.updateSampleSingle( sample ) > 0 ) return sample;
		else return null;
	}

	/****** DELETE : update delete_flag ******/

	/**
	 * @param sample delete sample data
	 * @return delete sample data
	 */
	public Sample deleteSampleSingle( Sample sample ) {
		if ( sampleMapper.deleteSampleSingle( sample ) > 0 ) return sample;
		else return null;
	}

	/****** ERASE ******/

	/**
	 * @param sample erase sample data
	 * @return erase sample data
	 */
	public Sample eraseSampleSingle( Sample sample ) {
		if ( sampleMapper.eraseSampleSingle( sample ) > 0 ) return sample;
		else return null;
	}


	/************ API METHOD : API end-point business logic ******/

	/****** INSERT ******/

	/**
	 * @param sample insert sample data
	 * @return result
	 */
	public Result insertSampleSingleApi( Sample sample ) {

		/*** init Object ***/
		Map<String, Object> data = new HashMap<String, Object>();

		/*** validation check : request ***/
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/*** business logic ***/
		data.put( "idea", this.insertSampleSingle( sample ) );
		/*** validation check : response ***/
		if ( ObjectUtils.isEmpty( data.get( "sample" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/*** return ***/
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/****** SELECT ******/

	/**
	 * @param sample select sample data
	 * @return result
	 */
	public Result selectSampleSingleApi( Sample sample ) {

		/*** init Object ***/
		Map<String, Object> data = new HashMap<String, Object>();

		/*** validation check : request ***/
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/*** business logic ***/
		data.put( "idea", this.selectSampleSingle( sample ) );
		/*** validation check : response ***/
		if ( ObjectUtils.isEmpty( data.get( "sample" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/*** return ***/
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/****** UPDATE ******/

	/**
	 * @param sample update sample data
	 * @return result
	 */
	public Result updateSampleSingleApi( Sample sample ) {

		/*** init Object ***/
		Map<String, Object> data = new HashMap<String, Object>();

		/*** validation check : request ***/
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/*** business logic ***/
		data.put( "idea", this.updateSampleSingle( sample ) );
		/*** validation check : response ***/
		if ( ObjectUtils.isEmpty( data.get( "sample" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/*** return ***/
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/****** DELETE : update delete_flag ******/

	/**
	 * @param sample delete sample data
	 * @return result
	 */
	public Result deleteSampleSingleApi( Sample sample ) {

		/*** init Object ***/
		Map<String, Object> data = new HashMap<String, Object>();

		/*** validation check : request ***/
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/*** business logic ***/
		data.put( "idea", this.deleteSampleSingle( sample ) );
		/*** validation check : response ***/
		if ( ObjectUtils.isEmpty( data.get( "sample" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/*** return ***/
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

}
