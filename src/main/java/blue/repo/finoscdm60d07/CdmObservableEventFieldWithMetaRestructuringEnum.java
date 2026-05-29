package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AC3PM4jKm7VmikNz82bjYakbRp3nsfZKTWXn8qiK7cM8")
public class CdmObservableEventFieldWithMetaRestructuringEnum {
    public static String blueId() {
        return "AC3PM4jKm7VmikNz82bjYakbRp3nsfZKTWXn8qiK7cM8";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/FieldWithMetaRestructuringEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/FieldWithMetaRestructuringEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventFieldWithMetaRestructuringEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelMetafieldsMetaFields meta;

    private CdmObservableEventRestructuringEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableEventFieldWithMetaRestructuringEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableEventRestructuringEnum getVal() {
        return val;
    }

    public CdmObservableEventFieldWithMetaRestructuringEnum val(CdmObservableEventRestructuringEnum val) {
        this.val = val;
        return this;
    }

}
