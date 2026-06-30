package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EzHXBDH1qMKUa8CRVwLbmHrSZZBEfZWvMNYyEnSuLLsF")
public class MerchantToCustomerPayNote extends PayNote {
    public static String blueId() {
        return "EzHXBDH1qMKUa8CRVwLbmHrSZZBEfZWvMNYyEnSuLLsF";
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
        return "blue/repo/definitions/PayNote/MerchantToCustomerPayNote.json";
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
