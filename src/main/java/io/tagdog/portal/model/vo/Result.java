package io.tagdog.portal.model.vo;

import io.tagdog.portal.model.enums.ResultStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.Map;

@Alias("result")
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
