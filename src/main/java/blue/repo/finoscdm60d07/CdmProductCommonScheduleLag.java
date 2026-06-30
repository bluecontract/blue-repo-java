package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H52wAsRZktjp4tpCZgu6wnQMFaksvVT2T9gxSHdZjSbg")
public class CdmProductCommonScheduleLag {
    public static String blueId() {
        return "H52wAsRZktjp4tpCZgu6wnQMFaksvVT2T9gxSHdZjSbg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/Lag";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/Lag";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleLag.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeOffset firstObservationDateOffset;

    private CdmBaseDatetimeOffset lagDuration;

    public CdmBaseDatetimeOffset getFirstObservationDateOffset() {
        return firstObservationDateOffset;
    }

    public CdmProductCommonScheduleLag firstObservationDateOffset(CdmBaseDatetimeOffset firstObservationDateOffset) {
        this.firstObservationDateOffset = firstObservationDateOffset;
        return this;
    }

    public CdmBaseDatetimeOffset getLagDuration() {
        return lagDuration;
    }

    public CdmProductCommonScheduleLag lagDuration(CdmBaseDatetimeOffset lagDuration) {
        this.lagDuration = lagDuration;
        return this;
    }

}
