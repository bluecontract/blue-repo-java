package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8pTRZ8d4Ri1ECATE8XxQBSaJij5kGuLtCzx3iJjDHJ8K")
public class CdmObservableEventRestructuring {
    public static String blueId() {
        return "8pTRZ8d4Ri1ECATE8XxQBSaJij5kGuLtCzx3iJjDHJ8K";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/Restructuring";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/Restructuring";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventRestructuring.json";
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

    private Boolean multipleCreditEventNotices;

    private Boolean multipleHolderObligation;

    private CdmObservableEventFieldWithMetaRestructuringEnum restructuringType;

    public Boolean getApplicable() {
        return applicable;
    }

    public CdmObservableEventRestructuring applicable(Boolean applicable) {
        this.applicable = applicable;
        return this;
    }

    public Boolean getMultipleCreditEventNotices() {
        return multipleCreditEventNotices;
    }

    public CdmObservableEventRestructuring multipleCreditEventNotices(Boolean multipleCreditEventNotices) {
        this.multipleCreditEventNotices = multipleCreditEventNotices;
        return this;
    }

    public Boolean getMultipleHolderObligation() {
        return multipleHolderObligation;
    }

    public CdmObservableEventRestructuring multipleHolderObligation(Boolean multipleHolderObligation) {
        this.multipleHolderObligation = multipleHolderObligation;
        return this;
    }

    public CdmObservableEventFieldWithMetaRestructuringEnum getRestructuringType() {
        return restructuringType;
    }

    public CdmObservableEventRestructuring restructuringType(CdmObservableEventFieldWithMetaRestructuringEnum restructuringType) {
        this.restructuringType = restructuringType;
        return this;
    }

}
