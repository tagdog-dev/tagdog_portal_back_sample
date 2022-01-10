package io.tagdog.portal.common.utils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ValidUtil {

    /**
     * Object type 변수가 비어있는지 체크
     * @param obj 체크할 오브젝트
     * @return Boolean
     */
    public static Boolean isEmpty( Object obj ) {
        if ( obj instanceof String ) return "".equals( obj.toString().trim() );
        else if ( obj instanceof List ) return ( ( List<?> ) obj ).isEmpty();
        else if ( obj instanceof Map) return  ( ( Map<?, ?> ) obj ).isEmpty();
        else if ( obj instanceof Object[] ) return Array.getLength( obj ) == 0;
        else return obj == null;
    }

    /**
     * Object type 변수가 비어있지 않은지 체크
     * @param obj 체크할 오브젝트
     * @return Boolean
     */
    public static Boolean isNotEmpty( Object obj ) {
        return !isEmpty( obj );
    }

    /**
     * Object type 변수가 비어있지 않은지 체크
     * @param str1 비교할 문자열
     * @param str2 비교할 문자열
     * @return Boolean
     */
    public static Boolean isEquals( String str1, String str2 ) {
        return !isEmpty( str1 ) && !isEmpty( str2 ) && str1.equals( str2 );
    }

    /**
     * Object type 변수가 비어있지 않은지 체크
     * @param str1 비교할 문자열
     * @param str2 비교할 문자열
     * @return Boolean
     */
    public static Boolean isNotEquals( String str1, String str2 ) {
        return !isEquals( str1, str2 );
    }
}
