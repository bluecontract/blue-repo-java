package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8dyPbuKgNLYiqqf4ruP89bunfFdgzbDhbnoiP1MJBEX9")
public class CdmLegaldocumentationCommonClosedState {
    public static String blueId() {
        return "8dyPbuKgNLYiqqf4ruP89bunfFdgzbDhbnoiP1MJBEX9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/ClosedState";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/ClosedState";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonClosedState.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String activityDate;

    private String effectiveDate;

    private String lastPaymentDate;

    private CdmLegaldocumentationCommonClosedStateEnum state;

    public String getActivityDate() {
        return activityDate;
    }

    public CdmLegaldocumentationCommonClosedState activityDate(String activityDate) {
        this.activityDate = activityDate;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public CdmLegaldocumentationCommonClosedState effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public String getLastPaymentDate() {
        return lastPaymentDate;
    }

    public CdmLegaldocumentationCommonClosedState lastPaymentDate(String lastPaymentDate) {
        this.lastPaymentDate = lastPaymentDate;
        return this;
    }

    public CdmLegaldocumentationCommonClosedStateEnum getState() {
        return state;
    }

    public CdmLegaldocumentationCommonClosedState state(CdmLegaldocumentationCommonClosedStateEnum state) {
        this.state = state;
        return this;
    }

}
