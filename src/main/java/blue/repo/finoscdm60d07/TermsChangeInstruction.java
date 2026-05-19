package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("D1BiT1GRmKWtpKmF9y3yHV6hE9frJtiZ2TKZ9NYLgvKF")
public class TermsChangeInstruction {
    public static String blueId() {
        return "D1BiT1GRmKWtpKmF9y3yHV6hE9frJtiZ2TKZ9NYLgvKF";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TermsChangeInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TermsChangeInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TermsChangeInstruction.json";
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

    private NotionalAdjustmentEnum adjustment;

    private List<AncillaryParty> ancillaryParty;

    private NonTransferableProduct product;

    public String getNamespace() {
        return namespace;
    }

    public TermsChangeInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public NotionalAdjustmentEnum getAdjustment() {
        return adjustment;
    }

    public TermsChangeInstruction adjustment(NotionalAdjustmentEnum adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public List<AncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public TermsChangeInstruction ancillaryParty(List<AncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public NonTransferableProduct getProduct() {
        return product;
    }

    public TermsChangeInstruction product(NonTransferableProduct product) {
        this.product = product;
        return this;
    }

}
