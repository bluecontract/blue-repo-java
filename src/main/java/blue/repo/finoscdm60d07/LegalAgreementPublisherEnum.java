package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CtnMgDAuH7yfENUdBdpZmg4NCDL1Fa8aLT6BpFrau9eZ")
public class LegalAgreementPublisherEnum {
    public static String blueId() {
        return "CtnMgDAuH7yfENUdBdpZmg4NCDL1Fa8aLT6BpFrau9eZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LegalAgreementPublisherEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LegalAgreementPublisherEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/LegalAgreementPublisherEnum.json";
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

    public String getNamespace() {
        return namespace;
    }

    public LegalAgreementPublisherEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
