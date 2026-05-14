package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("A7PsnK1SF7G9rQa86XGPTPfgE3tmu2N5NMouhaCL4Jbk")
public class UmbrellaAgreement {
    public static String blueId() {
        return "A7PsnK1SF7G9rQa86XGPTPfgE3tmu2N5NMouhaCL4Jbk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "UmbrellaAgreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/UmbrellaAgreement";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/UmbrellaAgreement.json";
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

    private Boolean isApplicable;

    private String language;

    private List<UmbrellaAgreementEntity> parties;

    public String getNamespace() {
        return namespace;
    }

    public UmbrellaAgreement namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getIsApplicable() {
        return isApplicable;
    }

    public UmbrellaAgreement isApplicable(Boolean isApplicable) {
        this.isApplicable = isApplicable;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public UmbrellaAgreement language(String language) {
        this.language = language;
        return this;
    }

    public List<UmbrellaAgreementEntity> getParties() {
        return parties;
    }

    public UmbrellaAgreement parties(List<UmbrellaAgreementEntity> parties) {
        this.parties = parties;
        return this;
    }

}
