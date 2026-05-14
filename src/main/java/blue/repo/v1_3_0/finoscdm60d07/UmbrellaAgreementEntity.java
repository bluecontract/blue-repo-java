package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CyzF7rdbDpnAh77ZEkFHjYfgtzFFKXo4QLiNWgx7i8Ke")
public class UmbrellaAgreementEntity {
    public static String blueId() {
        return "CyzF7rdbDpnAh77ZEkFHjYfgtzFFKXo4QLiNWgx7i8Ke";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "UmbrellaAgreementEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/UmbrellaAgreementEntity";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/UmbrellaAgreementEntity.json";
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

    private List<FieldWithMetaString> entityId;

    private String terms;

    public String getNamespace() {
        return namespace;
    }

    public UmbrellaAgreementEntity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getEntityId() {
        return entityId;
    }

    public UmbrellaAgreementEntity entityId(List<FieldWithMetaString> entityId) {
        this.entityId = entityId;
        return this;
    }

    public String getTerms() {
        return terms;
    }

    public UmbrellaAgreementEntity terms(String terms) {
        this.terms = terms;
        return this;
    }

}
