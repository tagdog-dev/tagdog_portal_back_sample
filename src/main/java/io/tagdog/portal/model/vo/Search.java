package io.tagdog.portal.model.vo;

import io.tagdog.portal.model.enums.ResultStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.type.Alias;

import java.util.List;
import java.util.Map;

@Alias("search")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Search<T> {

	private String pagingTy;

	private int firstIndex = 0;
	private int lastIndex = 0;
	private int recordCountPerPage;

	private Map<String, Object> option;
	private T mono;
	private List<T> flux;

}
