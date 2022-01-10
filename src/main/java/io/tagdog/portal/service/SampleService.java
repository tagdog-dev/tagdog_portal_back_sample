package io.tagdog.portal.service;

import io.tagdog.portal.mapper.SampleMapper;
import io.tagdog.portal.model.domain.Sample;
import io.tagdog.portal.model.enums.ResultStatus;
import io.tagdog.portal.model.vo.Result;
import io.tagdog.portal.model.vo.Search;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("sampleService")
@Transactional
@Slf4j
@AllArgsConstructor
public class SampleService {

	private static final Logger LOGGER = LoggerFactory.getLogger( SampleService.class );


	/* INJECTION */

	@Resource
	private SampleMapper sampleMapper;


	/* SERVICE METHOD : Service business logic */

	/* INSERT */

	/**
	 * @param sample insert sample data
	 * @return insert sample data
	 */
	public Sample insertMono(Sample sample ) {
		if ( sampleMapper.insertMono( sample ) > 0 ) return sample;
		else return null;
	}

	/* SELECT */

	/**
	 * @param sample select sample data
	 * @return select sample data
	 */
	public Sample selectMono( Sample sample ) {
		return sampleMapper.selectMono( sample );
	}

	/**
	 * @param search select sample data
	 * @return select sample data
	 */
	public List<Sample> selectFlux( Search<Sample> search ) {
		return sampleMapper.selectFlux( search );
	}

	/**
	 * @param search select sample data
	 * @return select sample data
	 */
	public int selectFluxCount( Search<Sample> search ) {
		return sampleMapper.selectFluxCount( search );
	}

	/* UPDATE */

	/**
	 * @param sample update sample data
	 * @return update sample data
	 */
	public Sample updateMono( Sample sample ) {
		if ( sampleMapper.updateMono( sample ) > 0 ) return sample;
		else return null;
	}

	/**
	 * @param sample update sample data
	 * @return update sample data
	 */
	public Sample updateMonoDelAt( Sample sample ) {
		if ( sampleMapper.updateMonoDelAt( sample ) > 0 ) return sample;
		else return null;
	}

	/* DELETE : update delete_flag */

	/**
	 * @param sample delete sample data
	 * @return delete sample data
	 */
	public Sample deleteMono( Sample sample ) {
		if ( sampleMapper.deleteMono( sample ) > 0 ) return sample;
		else return null;
	}


	/* API METHOD : API end-point business logic */

	/* INSERT */

	/**
	 * @param sample insert sample data
	 * @return result
	 */
	public Result insertMonoHandler( Sample sample ) {
		/* init Object */
		Map<String, Object> data = new HashMap<>();

		/* validation check : request */
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/* business logic */
		data.put( "sample", this.insertMono( sample ) );
		/* validation check : response */
		if ( ObjectUtils.isEmpty( data.get( "sample" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/* return */
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/* SELECT */

	/**
	 * @param sample select sample data
	 * @return result
	 */
	public Result selectMonoHandler( Sample sample ) {
		/* init Object */
		Map<String, Object> data = new HashMap<>();

		/* validation check : request */
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/* business logic */
		data.put( "mono", this.selectMono( sample ) );
		/* validation check : response */
		if ( ObjectUtils.isEmpty( data.get( "mono" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/* return */
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/**
	 * @param search select sample data
	 * @return result
	 */
	public Result selectFluxHandler( Search<Sample> search ) {
		/* init Object */
		Map<String, Object> data = new HashMap<>();

		/* validation check : request */
		if ( ObjectUtils.isEmpty( search ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/* business logic */
		data.put( "flux", this.selectFlux( search ) );

		/* return */
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/**
	 * @param search select sample data
	 * @return result
	 */
	public Result selectFluxCountHandler( Search<Sample> search ) {
		/* init Object */
		Map<String, Object> data = new HashMap<>();

		/* validation check : request */
		if ( ObjectUtils.isEmpty( search ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/* business logic */
		data.put( "count", this.selectFluxCount( search ) );

		/* return */
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/* UPDATE */

	/**
	 * @param sample update sample data
	 * @return result
	 */
	public Result updateMonoHandler( Sample sample ) {
		/* init Object */
		Map<String, Object> data = new HashMap<>();

		/* validation check : request */
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/* business logic */
		data.put( "mono", this.updateMono( sample ) );
		/* validation check : response */
		if ( ObjectUtils.isEmpty( data.get( "sample" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/* return */
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

	/* DELETE */

	/**
	 * @param sample delete sample data
	 * @return result
	 */
	public Result deleteMonoHandler( Sample sample ) {
		/* init Object */
		Map<String, Object> data = new HashMap<>();

		/* validation check : request */
		if ( ObjectUtils.isEmpty( sample ) ) return Result.builder().status( ResultStatus.INVALID_INPUT_VALUE ).build();

		/* business logic */
		data.put( "mono", this.deleteMono( sample ) );
		/* validation check : response */
		if ( ObjectUtils.isEmpty( data.get( "mono" ) ) ) return Result.builder().status( ResultStatus.SYSTEM_ERROR ).build();

		/* return */
		return Result.builder().status( ResultStatus.SUCCESS ).data( data ).build();
	}

}
