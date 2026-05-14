package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HHYX4QXieJa1FmraLpwHVMbmGdCQpJttJdR6zqdmscMq")
public class ReferenceSwapCurve {
    public static String blueId() {
        return "HHYX4QXieJa1FmraLpwHVMbmGdCQpJttJdR6zqdmscMq";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceSwapCurve";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceSwapCurve";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ReferenceSwapCurve.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private MakeWholeAmount makeWholeAmount;

    private SwapCurveValuation swapUnwindValue;

    public String getNamespace() {
        return namespace;
    }

    public ReferenceSwapCurve namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public MakeWholeAmount getMakeWholeAmount() {
        return makeWholeAmount;
    }

    public ReferenceSwapCurve makeWholeAmount(MakeWholeAmount makeWholeAmount) {
        this.makeWholeAmount = makeWholeAmount;
        return this;
    }

    public SwapCurveValuation getSwapUnwindValue() {
        return swapUnwindValue;
    }

    public ReferenceSwapCurve swapUnwindValue(SwapCurveValuation swapUnwindValue) {
        this.swapUnwindValue = swapUnwindValue;
        return this;
    }

}
