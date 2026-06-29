package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FjySLYZUdztPrBskVvWtnCvGs6KZVkZWrLsrrLpotMYG")
public class CdmObservableEventFieldWithMetaMarketDisruptionEnum {
    public static String blueId() {
        return "FjySLYZUdztPrBskVvWtnCvGs6KZVkZWrLsrrLpotMYG";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/FieldWithMetaMarketDisruptionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/FieldWithMetaMarketDisruptionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventFieldWithMetaMarketDisruptionEnum.json";
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

    private CdmObservableEventMarketDisruptionEnum val;

    public ComRosettaModelMetafieldsMetaFields getMeta() {
        return meta;
    }

    public CdmObservableEventFieldWithMetaMarketDisruptionEnum meta(ComRosettaModelMetafieldsMetaFields meta) {
        this.meta = meta;
        return this;
    }

    public CdmObservableEventMarketDisruptionEnum getVal() {
        return val;
    }

    public CdmObservableEventFieldWithMetaMarketDisruptionEnum val(CdmObservableEventMarketDisruptionEnum val) {
        this.val = val;
        return this;
    }

}
