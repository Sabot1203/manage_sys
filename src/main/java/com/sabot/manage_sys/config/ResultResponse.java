package com.sabot.manage_sys.config;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultResponse {

    private boolean isOk;
    private int code;
    private String message;
    private Object object;


    public static ResultResponse success(){
        ResultResponse ajaxResponse = new ResultResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        return ajaxResponse;
    }

    public static ResultResponse success(Object obj){
        ResultResponse ajaxResponse = new ResultResponse();
        ajaxResponse.setOk(true);
        ajaxResponse.setCode(200);
        ajaxResponse.setMessage("请求响应成功");
        ajaxResponse.setObject(obj);
        return ajaxResponse;
    }

    public static ResultResponse error(String message){
        ResultResponse ajaxResponse = new ResultResponse();
        ajaxResponse.setOk(false);
        ajaxResponse.setCode(400);
        ajaxResponse.setMessage(message);
        return ajaxResponse;
    }
}
