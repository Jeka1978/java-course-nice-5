package enums.lab;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Evegeny on 12/01/2017.
 */
@AllArgsConstructor
@Getter
public enum  HttpCode {
    INFO(100,199,new InfoHttpCodeHandler()),
    SUCCESS(200,299, new SuccessHttpCodeHandler()),
    ERROR(300,399, new ErrorHttpCodeHandler());

    private final int min;
    private final int max;
    private final HttpCodeHandler httpCodeHandler;


    public static HttpCode findByHttpCode(int code) {
        HttpCode[] httpCodes = values();
        for (HttpCode httpCode : httpCodes) {
            if (httpCode.min < code && httpCode.max > code) {
                return httpCode;
            }
        }
        throw new IllegalStateException(code + " not supported");
    }


}








