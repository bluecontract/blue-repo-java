package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("71SQ3pyckiJYBKQhdrg2QwBgmHU8ma4L1f9d2rwrG2Xn")
public class ResetInstruction {
    public static String blueId() {
        return "71SQ3pyckiJYBKQhdrg2QwBgmHU8ma4L1f9d2rwrG2Xn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ResetInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ResetInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ResetInstruction.json";
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

    private List<ReferenceWithMetaPayout> payout;

    private String rateRecordDate;

    private String resetDate;

    public String getNamespace() {
        return namespace;
    }

    public ResetInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<ReferenceWithMetaPayout> getPayout() {
        return payout;
    }

    public ResetInstruction payout(List<ReferenceWithMetaPayout> payout) {
        this.payout = payout;
        return this;
    }

    public String getRateRecordDate() {
        return rateRecordDate;
    }

    public ResetInstruction rateRecordDate(String rateRecordDate) {
        this.rateRecordDate = rateRecordDate;
        return this;
    }

    public String getResetDate() {
        return resetDate;
    }

    public ResetInstruction resetDate(String resetDate) {
        this.resetDate = resetDate;
        return this;
    }

}
