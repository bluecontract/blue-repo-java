package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("53nXrxiF8fJaQVQJPq8ZLoFTsgwHg1yDrtSh8HvFDoDC")
public class Lag {
    public static String blueId() {
        return "53nXrxiF8fJaQVQJPq8ZLoFTsgwHg1yDrtSh8HvFDoDC";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Lag";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Lag";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Lag.json";
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

    private Offset firstObservationDateOffset;

    private Offset lagDuration;

    public String getNamespace() {
        return namespace;
    }

    public Lag namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Offset getFirstObservationDateOffset() {
        return firstObservationDateOffset;
    }

    public Lag firstObservationDateOffset(Offset firstObservationDateOffset) {
        this.firstObservationDateOffset = firstObservationDateOffset;
        return this;
    }

    public Offset getLagDuration() {
        return lagDuration;
    }

    public Lag lagDuration(Offset lagDuration) {
        this.lagDuration = lagDuration;
        return this;
    }

}
