package enums.lab;

/**
 * Created by Evegeny on 12/01/2017.
 */
public class Main {
    public static void main(String[] args) {
        HttpCodeService httpCodeService = new HttpCodeServiceImpl();
        httpCodeService.handleHttpCode(253);
        httpCodeService.handleHttpCode(263);
        httpCodeService.handleHttpCode(247);
        httpCodeService.handleHttpCode(117);
        httpCodeService.handleHttpCode(387);

    }
}
