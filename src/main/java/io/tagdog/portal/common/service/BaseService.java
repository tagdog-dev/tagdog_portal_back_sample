package io.tagdog.portal.common.service;

import java.util.List;

public interface BaseService<T> {

    /*
    insert, select, update, delete, erase
    serviceName + desc
    single, multi, all
     */


	/************ INSERT ************/

    /**
     * @param model
     * @return model
     */
	T insertTestSingle( T model );
	
	// select
    /**
     * @param model
     * @return int
     */
    int selectTestCountAll(T model);
    /**
     * @param model
     * @return model
     */
    T selectTestSingle(T model);
    /**
     * @param model
     * @return List<model>
     */
    List<T> selectTestMulti(T model);


    /************ UPDATE ************/

    /**
     * @param model
     * @return model
     */
    T updateSingle(T model);


    /************ DELETE ************/

    /**
     * @param model
     * @return model
     */
    T deleteSingle(T model);


    /************ ERASE ************/

    /**
     * @param model
     * @return model
     */
    T eraseSingle(T model);

}
