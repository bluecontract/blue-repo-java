package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BYznx4LTYbPtRKfdQhomF2y7EFmy1KW8hh7yoTpMo45w")
public class InformationSource {
    public static String blueId() {
        return "BYznx4LTYbPtRKfdQhomF2y7EFmy1KW8hh7yoTpMo45w";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InformationSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InformationSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InformationSource.json";
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

    private FieldWithMetaString sourcePage;

    private String sourcePageHeading;

    private FieldWithMetaInformationProviderEnum sourceProvider;

    public String getNamespace() {
        return namespace;
    }

    public InformationSource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getSourcePage() {
        return sourcePage;
    }

    public InformationSource sourcePage(FieldWithMetaString sourcePage) {
        this.sourcePage = sourcePage;
        return this;
    }

    public String getSourcePageHeading() {
        return sourcePageHeading;
    }

    public InformationSource sourcePageHeading(String sourcePageHeading) {
        this.sourcePageHeading = sourcePageHeading;
        return this;
    }

    public FieldWithMetaInformationProviderEnum getSourceProvider() {
        return sourceProvider;
    }

    public InformationSource sourceProvider(FieldWithMetaInformationProviderEnum sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }

}
