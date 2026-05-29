package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JDFk4bjDaXiaZiEkLkoPoa66bJWLrnTJB59D2KofE1yE")
public class CdmProductCommonScheduleObservationDate {
    public static String blueId() {
        return "JDFk4bjDaXiaZiEkLkoPoa66bJWLrnTJB59D2KofE1yE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/ObservationDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/ObservationDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleObservationDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String adjustedDate;

    private String observationReference;

    private String unadjustedDate;

    private Double weight;

    public String getAdjustedDate() {
        return adjustedDate;
    }

    public CdmProductCommonScheduleObservationDate adjustedDate(String adjustedDate) {
        this.adjustedDate = adjustedDate;
        return this;
    }

    public String getObservationReference() {
        return observationReference;
    }

    public CdmProductCommonScheduleObservationDate observationReference(String observationReference) {
        this.observationReference = observationReference;
        return this;
    }

    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    public CdmProductCommonScheduleObservationDate unadjustedDate(String unadjustedDate) {
        this.unadjustedDate = unadjustedDate;
        return this;
    }

    public Double getWeight() {
        return weight;
    }

    public CdmProductCommonScheduleObservationDate weight(Double weight) {
        this.weight = weight;
        return this;
    }

}
