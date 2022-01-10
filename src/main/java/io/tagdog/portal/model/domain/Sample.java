package io.tagdog.portal.model.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *   Sample
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sample {

    private long id;

    private String nm;

    private String cn;

	private String registerId, updusrId;

	@JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
	private Date registDt, updtDt;
}