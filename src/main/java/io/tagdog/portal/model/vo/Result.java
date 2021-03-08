package io.tagdog.portal.model.vo;

import io.tagdog.portal.model.enums.ResultStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Result {

	private ResultStatus status;

	private Map<String, Object> data;

	public Result isSuccess() {
		this.status = ResultStatus.SUCCESS;
		return this;
	}

	public Result isFailed() {
		this.status = ResultStatus.FAILED;
		return this;
	}

}
