package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HFVsjPq4dbaRXVa8vrWUTPdSo8R4CoRFz275RuCiohR7")
public class CdmEventCommonReset {
    public static String blueId() {
        return "HFVsjPq4dbaRXVa8vrWUTPdSo8R4CoRFz275RuCiohR7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/Reset";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/Reset";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonReset.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateAveragingCalculation averagingMethodology;

    private List<CdmObservableEventMetafieldsReferenceWithMetaObservation> observations;

    private String rateRecordDate;

    private String resetDate;

    private CdmObservableAssetPrice resetValue;

    public CdmProductTemplateAveragingCalculation getAveragingMethodology() {
        return averagingMethodology;
    }

    public CdmEventCommonReset averagingMethodology(CdmProductTemplateAveragingCalculation averagingMethodology) {
        this.averagingMethodology = averagingMethodology;
        return this;
    }

    public List<CdmObservableEventMetafieldsReferenceWithMetaObservation> getObservations() {
        return observations;
    }

    public CdmEventCommonReset observations(List<CdmObservableEventMetafieldsReferenceWithMetaObservation> observations) {
        this.observations = observations;
        return this;
    }

    public String getRateRecordDate() {
        return rateRecordDate;
    }

    public CdmEventCommonReset rateRecordDate(String rateRecordDate) {
        this.rateRecordDate = rateRecordDate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public CdmEventCommonReset resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

    public CdmObservableAssetPrice getResetValue() {
        return resetValue;
    }

    public CdmEventCommonReset resetValue(CdmObservableAssetPrice resetValue) {
        this.resetValue = resetValue;
        return this;
    }

}
