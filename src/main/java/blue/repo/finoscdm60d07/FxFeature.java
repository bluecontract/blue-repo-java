package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5YdyCjLAe8G3254EizBaSqFHMqHcLkHE69iZL39qyER6")
public class FxFeature {
    public static String blueId() {
        return "5YdyCjLAe8G3254EizBaSqFHMqHcLkHE69iZL39qyER6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FxFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FxFeature";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FxFeature.json";
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

    private Composite composite;

    private Composite crossCurrency;

    private Quanto quanto;

    private FieldWithMetaString referenceCurrency;

    public String getNamespace() {
        return namespace;
    }

    public FxFeature namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Composite getComposite() {
        return composite;
    }

    public FxFeature composite(Composite composite) {
        this.composite = composite;
        return this;
    }

    public Composite getCrossCurrency() {
        return crossCurrency;
    }

    public FxFeature crossCurrency(Composite crossCurrency) {
        this.crossCurrency = crossCurrency;
        return this;
    }

    public Quanto getQuanto() {
        return quanto;
    }

    public FxFeature quanto(Quanto quanto) {
        this.quanto = quanto;
        return this;
    }

    public FieldWithMetaString getReferenceCurrency() {
        return referenceCurrency;
    }

    public FxFeature referenceCurrency(FieldWithMetaString referenceCurrency) {
        this.referenceCurrency = referenceCurrency;
        return this;
    }

}
