package enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Evegeny on 12/01/2017.
 */
@Getter
public enum MaritalStatus {
    SINGLE(1,"רווק"), MARRIED(2,"נשוי"), DIVORCED(7,"גרוש");

    private final int dbCode;
    private final String  hebrewDesc;

    MaritalStatus(int dbCode, String hebrewDesc) {
        System.out.println("blablablab");
        this.dbCode = dbCode;
        this.hebrewDesc = hebrewDesc;
    }


    public static MaritalStatus findByDbCode(int dbCode) {
        MaritalStatus[] maritalStatuses = values();
        for (MaritalStatus status : maritalStatuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
        throw new RuntimeException(dbCode + " not supported");
    }
}
