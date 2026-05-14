package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BmhRgPv2e795UAZJ8GC5Ejo1przTRvidLtLSimQmWxjv")
public class QuasiGovernmentIssuerType {
    public static String blueId() {
        return "BmhRgPv2e795UAZJ8GC5Ejo1przTRvidLtLSimQmWxjv";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuasiGovernmentIssuerType";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuasiGovernmentIssuerType";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/QuasiGovernmentIssuerType.json";
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

    private Boolean sovereignEntity;

    private Boolean sovereignRecourse;

    public String getNamespace() {
        return namespace;
    }

    public QuasiGovernmentIssuerType namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getSovereignEntity() {
        return sovereignEntity;
    }

    public QuasiGovernmentIssuerType sovereignEntity(Boolean sovereignEntity) {
        this.sovereignEntity = sovereignEntity;
        return this;
    }

    public Boolean getSovereignRecourse() {
        return sovereignRecourse;
    }

    public QuasiGovernmentIssuerType sovereignRecourse(Boolean sovereignRecourse) {
        this.sovereignRecourse = sovereignRecourse;
        return this;
    }

}
