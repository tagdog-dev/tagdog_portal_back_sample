package io.tagdog.portal.controller;

import io.tagdog.portal.model.domain.Sample;
import io.tagdog.portal.model.vo.Result;
import io.tagdog.portal.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/sample")
@Slf4j
public class SampleController {


    /************ INJECTION ************/

    @Autowired
    private SampleService sampleService;


    /****** INSERT ******/

    @PostMapping( value = "" )
    public Result insertSampleSingleApi( @RequestBody Sample sample ) {
        return sampleService.insertSampleSingleApi( sample );
    }


    /****** SELECT ******/

//    @GetMapping( value = "/idx/{idx}" )
//    public Result selectSampleSingleApi( @PathVariable( "sampleIdx" ) long sampleIdx ) {
//        return sampleService.selectSampleSingleApi( Sample.builder().sampleIdx( sampleIdx ).build() );
//    }

    @GetMapping( value = "/restcode/{restCode}" )
    public Result selectSampleSingleApi( @PathVariable( "restCode" ) String restCode ) {
        return sampleService.selectSampleSingleApi( Sample.builder().restCode( restCode ).build() );
    }


    /****** UPDATE ******/

    @PutMapping( value = "" )
    public Result updateSampleSingleApi( @RequestBody Sample sample ) {
        //
        return sampleService.updateSampleSingleApi( sample );
    }


    /****** DELETE ******/

//    @DeleteMapping( value = "/idx/{idx}" )
//    public Result deleteSampleSingleFromIdxApi( @PathVariable( "sampleIdx" ) long sampleIdx ) {
//        return sampleService.deleteSampleSingleApi( Sample.builder().sampleIdx( sampleIdx ).build() );
//    }

//    @DeleteMapping( value = "/idx/{idx}/force" )
//    public Result eraseSampleSingleFromIdxApi( @PathVariable( "sampleIdx" ) long sampleIdx ) {
//        return sampleService.eraseSampleSingleApi( Sample.builder().sampleIdx( sampleIdx ).build() );
//    }

    @DeleteMapping( value = "/restCode/{restCode}" )
    public Result deleteSampleSingleFromRestCodeApi( @PathVariable( "restCode" ) String restCode ) {
        return sampleService.deleteSampleSingleApi( Sample.builder().restCode( restCode ).build() );
    }


}
