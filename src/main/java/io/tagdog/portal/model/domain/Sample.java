package io.tagdog.portal.model.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude( JsonInclude.Include.NON_NULL )
@Alias( "Sample" )
public class Sample {

    // pk
    private long sampleIdx;

    // restCode
    private String restCode;

    // data
    private String sampleData;

    // common
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date insDate, updDate, delDate;
    private String delFlag;

}
