package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DWdjsHAuRVoiRCLvLpuzVLV1CMvzVLhNktBkLdXcEPPB")
public class CdmObservableEventGracePeriodExtension {
    public static String blueId() {
        return "DWdjsHAuRVoiRCLvLpuzVLV1CMvzVLhNktBkLdXcEPPB";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/GracePeriodExtension";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/GracePeriodExtension";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventGracePeriodExtension.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean applicable;

    private CdmBaseDatetimeOffset gracePeriod;

    public Boolean getApplicable() {
        return applicable;
    }

    public CdmObservableEventGracePeriodExtension applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public CdmBaseDatetimeOffset getGracePeriod() {
        return gracePeriod;
    }

    public CdmObservableEventGracePeriodExtension gracePeriod(CdmBaseDatetimeOffset gracePeriod) {
        this.gracePeriod = gracePeriod;
        return this;
    }

}
