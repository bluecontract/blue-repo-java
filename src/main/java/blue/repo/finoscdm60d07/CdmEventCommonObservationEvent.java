package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3WyHtwLZQPjVJB4zC26ena33X6r2fxTfkWVEiZi6eH1Q")
public class CdmEventCommonObservationEvent {
    public static String blueId() {
        return "3WyHtwLZQPjVJB4zC26ena33X6r2fxTfkWVEiZi6eH1Q";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ObservationEvent";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ObservationEvent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonObservationEvent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonCorporateAction corporateAction;

    private CdmEventCommonCreditEvent creditEvent;

    public CdmEventCommonCorporateAction getCorporateAction() {
        return corporateAction;
    }

    public CdmEventCommonObservationEvent corporateAction(CdmEventCommonCorporateAction corporateAction) {
        this.corporateAction = corporateAction;
        return this;
    }

    public CdmEventCommonCreditEvent getCreditEvent() {
        return creditEvent;
    }

    public CdmEventCommonObservationEvent creditEvent(CdmEventCommonCreditEvent creditEvent) {
        this.creditEvent = creditEvent;
        return this;
    }

}
