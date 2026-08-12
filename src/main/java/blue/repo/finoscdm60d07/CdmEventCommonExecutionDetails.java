package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GXAR1SUGjpvZsUZvh3feCdkEXnfGS76pgRRAwtrV4BAA")
public class CdmEventCommonExecutionDetails {
    public static String blueId() {
        return "GXAR1SUGjpvZsUZvh3feCdkEXnfGS76pgRRAwtrV4BAA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ExecutionDetails";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ExecutionDetails";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonExecutionDetails.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonExecutionTypeEnum executionType;

    private CdmBaseStaticdataPartyLegalEntity executionVenue;

    private CdmBaseStaticdataIdentifierIdentifiedList packageReference;

    public CdmEventCommonExecutionTypeEnum getExecutionType() {
        return executionType;
    }

    public CdmEventCommonExecutionDetails executionType(CdmEventCommonExecutionTypeEnum executionType) {
        this.executionType = executionType;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExecutionVenue() {
        return executionVenue;
    }

    public CdmEventCommonExecutionDetails executionVenue(CdmBaseStaticdataPartyLegalEntity executionVenue) {
        this.executionVenue = executionVenue;
        return this;
    }

    public CdmBaseStaticdataIdentifierIdentifiedList getPackageReference() {
        return packageReference;
    }

    public CdmEventCommonExecutionDetails packageReference(CdmBaseStaticdataIdentifierIdentifiedList packageReference) {
        this.packageReference = packageReference;
        return this;
    }

}
