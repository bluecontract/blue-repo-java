package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CiVeAe7TnVLFbXqzQuh8wfmVQXXt3SCFB8Ge4p4B7YpR")
public class ObservationDate {
    public static String blueId() {
        return "CiVeAe7TnVLFbXqzQuh8wfmVQXXt3SCFB8Ge4p4B7YpR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ObservationDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ObservationDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ObservationDate.json";
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

    private String adjustedDate;

    private String observationReference;

    private String unadjustedDate;

    private Double weight;

    public String getNamespace() {
        return namespace;
    }

    public ObservationDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public ObservationDate adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public String getObservationReference() {
        return observationReference;
    }

    public ObservationDate observationReference(String observationReference) {
        this.observationReference = observationReference;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public ObservationDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public ObservationDate weight(Double weight) {
        this.weight = weight;
        return this;
    }

}
