package cn.pluss.platform.api;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";

    public static Result genSuccessResult() {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE);
    }
    
    public static Result genUndefindeEResult(String message) {
    	return new Result()
    			.setCode(ResultCode.UNDEFINDE)
    			.setMessage(message);
    }
    public static <T> Result<T> genSuccessResult(T data) {
        return new Result()
                .setCode(ResultCode.SUCCESS)
                .setMessage(DEFAULT_SUCCESS_MESSAGE)
                .setData(data);
    }
    public static <T> Result<T> genResult(T data) {
    	return new Result()
    			.setData(data);
    }

    public static Result genFailResult(String message) {
        return new Result()
                .setCode(ResultCode.FAIL)
                .setMessage(message);
    }
  
}
