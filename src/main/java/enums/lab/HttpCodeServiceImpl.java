package enums.lab;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class HttpCodeServiceImpl implements HttpCodeService {
    @Override
    public void handleHttpCode(int httpCode) {
        HttpCode.findByHttpCode(httpCode).getHttpCodeHandler().handle();
    }
}
