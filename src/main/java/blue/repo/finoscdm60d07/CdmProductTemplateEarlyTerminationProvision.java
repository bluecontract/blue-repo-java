package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9csmPGMEApBwq59skjcTd6GWifTRXuEZhnahTwehoSpf")
public class CdmProductTemplateEarlyTerminationProvision {
    public static String blueId() {
        return "9csmPGMEApBwq59skjcTd6GWifTRXuEZhnahTwehoSpf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/EarlyTerminationProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/EarlyTerminationProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateEarlyTerminationProvision.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateMandatoryEarlyTermination mandatoryEarlyTermination;

    private CdmBaseDatetimePeriod mandatoryEarlyTerminationDateTenor;

    private CdmProductTemplateOptionalEarlyTermination optionalEarlyTermination;

    private CdmProductTemplateExercisePeriod optionalEarlyTerminationParameters;

    public CdmProductTemplateMandatoryEarlyTermination getMandatoryEarlyTermination() {
        return mandatoryEarlyTermination;
    }

    public CdmProductTemplateEarlyTerminationProvision mandatoryEarlyTermination(CdmProductTemplateMandatoryEarlyTermination mandatoryEarlyTermination) {
        this.mandatoryEarlyTermination = mandatoryEarlyTermination;
        return this;
    }

    public CdmBaseDatetimePeriod getMandatoryEarlyTerminationDateTenor() {
        return mandatoryEarlyTerminationDateTenor;
    }

    public CdmProductTemplateEarlyTerminationProvision mandatoryEarlyTerminationDateTenor(CdmBaseDatetimePeriod mandatoryEarlyTerminationDateTenor) {
        this.mandatoryEarlyTerminationDateTenor = mandatoryEarlyTerminationDateTenor;
        return this;
    }

    public CdmProductTemplateOptionalEarlyTermination getOptionalEarlyTermination() {
        return optionalEarlyTermination;
    }

    public CdmProductTemplateEarlyTerminationProvision optionalEarlyTermination(CdmProductTemplateOptionalEarlyTermination optionalEarlyTermination) {
        this.optionalEarlyTermination = optionalEarlyTermination;
        return this;
    }

    public CdmProductTemplateExercisePeriod getOptionalEarlyTerminationParameters() {
        return optionalEarlyTerminationParameters;
    }

    public CdmProductTemplateEarlyTerminationProvision optionalEarlyTerminationParameters(CdmProductTemplateExercisePeriod optionalEarlyTerminationParameters) {
        this.optionalEarlyTerminationParameters = optionalEarlyTerminationParameters;
        return this;
    }

}
