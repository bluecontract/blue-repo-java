package blue.repo.v1_3_0.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9svWm1o5mEHXiryFfhieELTRWENeUEsp1SivMWPmifXs")
public class MerchantToCustomerPayNote extends PayNote {
    public static String blueId() {
        return "9svWm1o5mEHXiryFfhieELTRWENeUEsp1SivMWPmifXs";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "Merchant To Customer PayNote";
    }

    public static String qualifiedName() {
        return "PayNote/Merchant To Customer PayNote";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/PayNote/MerchantToCustomerPayNote.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
