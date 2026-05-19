package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DrCjN2CgtkpRudLU46AtpyFcqCMchDGG3mXMRnp5SjgC")
public class PeriodRange {
    public static String blueId() {
        return "DrCjN2CgtkpRudLU46AtpyFcqCMchDGG3mXMRnp5SjgC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PeriodRange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PeriodRange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/PeriodRange.json";
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

    private PeriodBound lowerBound;

    private PeriodBound upperBound;

    public String getNamespace() {
        return namespace;
    }

    public PeriodRange namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PeriodBound getLowerBound() {
        return lowerBound;
    }

    public PeriodRange lowerBound(PeriodBound lowerBound) {
        this.lowerBound = lowerBound;
        return this;
    }

    public PeriodBound getUpperBound() {
        return upperBound;
    }

    public PeriodRange upperBound(PeriodBound upperBound) {
        this.upperBound = upperBound;
        return this;
    }

}
