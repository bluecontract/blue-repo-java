package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4yxWX4KaRwP38DMnVL3j2evYvSrE7RBFmKHFXAtpRo9e")
public class FxInformationSource {
    public static String blueId() {
        return "4yxWX4KaRwP38DMnVL3j2evYvSrE7RBFmKHFXAtpRo9e";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxInformationSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxInformationSource";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/FxInformationSource.json";
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

    private BusinessCenterTime fixingTime;

    private FieldWithMetaString sourcePage;

    private String sourcePageHeading;

    private FieldWithMetaInformationProviderEnum sourceProvider;

    public String getNamespace() {
        return namespace;
    }

    public FxInformationSource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public FxInformationSource fixingTime(BusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public FieldWithMetaString getSourcePage() {
        return sourcePage;
    }

    public FxInformationSource sourcePage(FieldWithMetaString sourcePage) {
        this.sourcePage = sourcePage;
        return this;
    }

    public String getSourcePageHeading() {
        return sourcePageHeading;
    }

    public FxInformationSource sourcePageHeading(String sourcePageHeading) {
        this.sourcePageHeading = sourcePageHeading;
        return this;
    }

    public FieldWithMetaInformationProviderEnum getSourceProvider() {
        return sourceProvider;
    }

    public FxInformationSource sourceProvider(FieldWithMetaInformationProviderEnum sourceProvider) {
        this.sourceProvider = sourceProvider;
        return this;
    }

}
