package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9naeLEXLRWTumCrkSpeU3W9ou5dZxNFfPNSpUrCjWXbE")
public class CdmObservableEventObservationIdentifier {
    public static String blueId() {
        return "9naeLEXLRWTumCrkSpeU3W9ou5dZxNFfPNSpUrCjWXbE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/ObservationIdentifier";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/ObservationIdentifier";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventObservationIdentifier.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmObservableEventDeterminationMethodology determinationMethodology;

    private CdmObservableAssetInformationSource informationSource;

    private CdmObservableAssetObservable observable;

    private String observationDate;

    private CdmBaseDatetimeTimeZone observationTime;

    public CdmObservableEventDeterminationMethodology getDeterminationMethodology() {
        return determinationMethodology;
    }

    public CdmObservableEventObservationIdentifier determinationMethodology(CdmObservableEventDeterminationMethodology determinationMethodology) {
        this.determinationMethodology = determinationMethodology;
        return this;
    }

    public CdmObservableAssetInformationSource getInformationSource() {
        return informationSource;
    }

    public CdmObservableEventObservationIdentifier informationSource(CdmObservableAssetInformationSource informationSource) {
        this.informationSource = informationSource;
        return this;
    }

    public CdmObservableAssetObservable getObservable() {
        return observable;
    }

    public CdmObservableEventObservationIdentifier observable(CdmObservableAssetObservable observable) {
        this.observable = observable;
        return this;
    }

    public String getObservationDate() {
        return observationDate;
    }

    public CdmObservableEventObservationIdentifier observationDate(String observationDate) {
        this.observationDate = observationDate;
        return this;
    }

    public CdmBaseDatetimeTimeZone getObservationTime() {
        return observationTime;
    }

    public CdmObservableEventObservationIdentifier observationTime(CdmBaseDatetimeTimeZone observationTime) {
        this.observationTime = observationTime;
        return this;
    }

}
