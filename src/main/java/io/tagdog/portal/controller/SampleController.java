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

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    /****** INSERT ******/

    @PostMapping( value = "" )
    public Result insertMonoHandler( @RequestBody Sample sample ) {
        return sampleService.insertMonoHandler( sample );
    }


    /****** SELECT ******/

    @GetMapping( value = "/id/{id}" )
    public Result selectMonoHandler( @PathVariable( "id" ) long id ) {
        return sampleService.selectMonoHandler( Sample.builder().id( id ).build() );
    }

    @PostMapping( value = "" )
    public Result selectFluxHandler( @RequestBody Sample sample ) {
        return sampleService.selectFluxHandler( sample );
    }


    /****** UPDATE ******/

    @PatchMapping( value = "" )
    public Result updateMonoHandler( @RequestBody Sample sample ) {
        return sampleService.updateMonoHandler( sample );
    }


    /****** DELETE ******/

    @DeleteMapping( value = "/id/{id}" )
    public Result deleteMonoHandler( @PathVariable( "id" ) long id ) {
        return sampleService.deleteMonoHandler( Sample.builder().id( id ).build() );
    }

}
