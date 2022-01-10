package io.tagdog.portal.controller;

import io.tagdog.portal.model.domain.Sample;
import io.tagdog.portal.model.vo.Result;
import io.tagdog.portal.model.vo.Search;
import io.tagdog.portal.service.SampleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/sample")
@Slf4j
public class SampleController {


    /* INJECTION */

    private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }


    /* TEST */

    @GetMapping( value = "/test" )
    public Result test() {
        return sampleService.selectFluxHandler( Search.<Sample>builder().build() );
    }


    /* INSERT */

    @PostMapping( value = "" )
    public Result insertMonoHandler( @RequestBody Sample sample ) {
        return sampleService.insertMonoHandler( sample );
    }


    /* SELECT */

    @GetMapping( value = "/idx/{idx}" )
    public Result selectMonoHandler( @PathVariable( "idx" ) long idx ) {
        return sampleService.selectMonoHandler( Sample.builder().idx( idx ).build() );
    }

    @PostMapping( value = "/search" )
    public Result selectFluxHandler( @RequestBody Search<Sample> search ) {
        return sampleService.selectFluxHandler( search );
    }

    @PostMapping( value = "/search/count" )
    public Result selectFluxCountHandler( @RequestBody Search<Sample> search ) {
        return sampleService.selectFluxCountHandler( search );
    }


    /* UPDATE */

    @PatchMapping( value = "" )
    public Result updateMonoHandler( @RequestBody Sample sample ) {
        return sampleService.updateMonoHandler( sample );
    }


    /* DELETE */

    @DeleteMapping( value = "/idx/{idx}" )
    public Result deleteMonoHandler( @PathVariable( "idx" ) long idx ) {
        return sampleService.deleteMonoHandler( Sample.builder().idx( idx ).build() );
    }

}
