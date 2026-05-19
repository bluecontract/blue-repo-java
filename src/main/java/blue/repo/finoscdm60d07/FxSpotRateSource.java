package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HcS1NSBYjFJGhKb3zX1JsfFJtnQxXFzAXHaK4xB9CFGV")
public class FxSpotRateSource {
    public static String blueId() {
        return "HcS1NSBYjFJGhKb3zX1JsfFJtnQxXFzAXHaK4xB9CFGV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxSpotRateSource";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxSpotRateSource";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FxSpotRateSource.json";
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

    private InformationSource primarySource;

    private InformationSource secondarySource;

    public String getNamespace() {
        return namespace;
    }

    public FxSpotRateSource namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public InformationSource getPrimarySource() {
        return primarySource;
    }

    public FxSpotRateSource primarySource(InformationSource primarySource) {
        this.primarySource = primarySource;
        return this;
    }

    public InformationSource getSecondarySource() {
        return secondarySource;
    }

    public FxSpotRateSource secondarySource(InformationSource secondarySource) {
        this.secondarySource = secondarySource;
        return this;
    }

}
