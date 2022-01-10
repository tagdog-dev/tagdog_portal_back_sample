package io.tagdog.portal.model.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.apache.ibatis.type.Alias;

/**
 *   Sample
 */
@Alias("sample")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sample {

    private long idx;

    private String id;

    private String nm;

    private String dc;

    private String tyCode;

    private boolean useAt;

	private String regId, updId;

	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date regDt, updDt;

    private boolean delAt;
}