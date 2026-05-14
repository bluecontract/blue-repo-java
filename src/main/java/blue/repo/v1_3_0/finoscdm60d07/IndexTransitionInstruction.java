package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8sdpVbE19DFSDywL5jx1MoFbNwvZCdojPT5K1Y66dAZ5")
public class IndexTransitionInstruction {
    public static String blueId() {
        return "8sdpVbE19DFSDywL5jx1MoFbNwvZCdojPT5K1Y66dAZ5";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "IndexTransitionInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/IndexTransitionInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/IndexTransitionInstruction.json";
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

    private Transfer cashTransfer;

    private String effectiveDate;

    private List<PriceQuantity> priceQuantity;

    public String getNamespace() {
        return namespace;
    }

    public IndexTransitionInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Transfer getCashTransfer() {
        return cashTransfer;
    }

    public IndexTransitionInstruction cashTransfer(Transfer cashTransfer) {
        this.cashTransfer = cashTransfer;
        return this;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public IndexTransitionInstruction effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    public List<PriceQuantity> getPriceQuantity() {
        return priceQuantity;
    }

    public IndexTransitionInstruction priceQuantity(List<PriceQuantity> priceQuantity) {
        this.priceQuantity = priceQuantity;
        return this;
    }

}
