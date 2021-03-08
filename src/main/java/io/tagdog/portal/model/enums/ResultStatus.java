package io.tagdog.portal.model.enums;

public enum ResultStatus {

    // 이상 없음
      SUCCESS               ( 200, "E200-0000", " Success " )
    , DATA_NOT_FOUND        ( 200, "E200-0001", " Success But Data Not Found " )

    // 잘못된 요청 분류
    , INVALID_INPUT_VALUE   ( 400, "E400-0000", " Invalid Input Value" )
    , DUPLICATION_ITEM      ( 400, "E400-0001", " Duplication Item " )
    , ALREADY_REGISTED_ITEM ( 400, "E400-0002", " Already Registed Item " )
    , ITEM_HAS_CHIDREN      ( 400, "E400-0003", " The Item Has Children " )

    // 허용되지 않은 인증 분류
    , ACCESS_DENIED         ( 401, "E401-0000", " Access is Denied " )
    , LOGIN_REQUIRED        ( 401, "E401-0001", " Login is Required " )

    // 결제 필요 분류
    , IS_NOT_PAID_CALL      ( 402, "E402-0000", " Access is Denied " )

    // 허용되지 않은 인가 분류
    , HANDLE_ACCESS_DENIED  ( 403, "E403-0000", " Access is Denied " )

    // 잘못된 URI
    , ILLEGAL_REQUEST       ( 404, "E404-0000", " Illegal Request " )

    // 허용되지 않은 메소드 분류
    , METHOD_NOT_ALLOWD     ( 405, "E405-0000", " Invalid Input Value " )

    // SYSTEM ERROR
    , SYSTEM_ERROR          ( 424, "E424-0000", " System Error " )

    // 비지니스 오류
    , FAILED                ( 500, "E500-0000", " Failed " )

    , DEVELOP_NOT_YET       ( 900, "E900-0000", " Develop Not Yet " )

    ;

    private final String code;
    private final String message;
    private int status;

    ResultStatus( final int status, String code, String message ) {

        this.status = status;
        this.code = code;
        this.message = message;

    }
}
