package io.tagdog.portal.common.mapper;

import java.util.List;

public interface BaseMapper<T> {

	// insert
	// insert.single
	int insertSingle(T model);
	// insert.multi
	int insertMulti(List<T> model);
	
	// select
    // select.count
    int selectCount(T model);
    // select.single
    T selectSingle(T model);
    // select.multi.by_single
    List<T> selectMulti(T model);
    // select.multi.by_multi
    List<T> selectMulti(List<T> model);
    // select.all
    List<T> selectAll();
    
	// update
    // update.single
    int updateSingle(T model);
    // update.multi
    int updateMulti(List<T> model);
    // update.all
    int updateAll(T model);
    
    // delete : UPDATE {table} SET delete = 'Y' ~;
    // delete.single
    int deleteSingle(T model);
    // delete.multi
    int deleteMulti(List<T> model);
    // delete.all
    int deleteAll();
    
    // erase : DELETE FROM {table} ~;
    // erase.single
    int eraseSingle(T model);
    // erase.multi
    int eraseMulti(List<T> model);
    // erase.all
    int eraseAll();

}
