package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9t7RYd2VTVhGfo1qzS5dd7kK2zpc4TgpigJWQebhcChk")
public class DividendDateReference {
    public static String blueId() {
        return "9t7RYd2VTVhGfo1qzS5dd7kK2zpc4TgpigJWQebhcChk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DividendDateReference";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DividendDateReference";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DividendDateReference.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private DividendDateReferenceEnum dateReference;

    private Offset paymentDateOffset;

    public String getNamespace() {
        return namespace;
    }

    public DividendDateReference namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DividendDateReferenceEnum getDateReference() {
        return dateReference;
    }

    public DividendDateReference dateReference(DividendDateReferenceEnum dateReference) {
        this.dateReference = dateReference;
        return this;
    }

    public Offset getPaymentDateOffset() {
        return paymentDateOffset;
    }

    public DividendDateReference paymentDateOffset(Offset paymentDateOffset) {
        this.paymentDateOffset = paymentDateOffset;
        return this;
    }

}
