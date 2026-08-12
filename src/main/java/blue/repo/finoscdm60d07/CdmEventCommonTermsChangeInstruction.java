package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("C8Sjni3j8bLknVwpMay25HnSbgy2TRcMj1Ahs4y7obpE")
public class CdmEventCommonTermsChangeInstruction {
    public static String blueId() {
        return "C8Sjni3j8bLknVwpMay25HnSbgy2TRcMj1Ahs4y7obpE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/TermsChangeInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/TermsChangeInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonTermsChangeInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductCommonNotionalAdjustmentEnum adjustment;

    private List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty;

    private CdmProductTemplateNonTransferableProduct product;

    public CdmProductCommonNotionalAdjustmentEnum getAdjustment() {
        return adjustment;
    }

    public CdmEventCommonTermsChangeInstruction adjustment(CdmProductCommonNotionalAdjustmentEnum adjustment) {
        this.adjustment = adjustment;
        return this;
    }

    public List<CdmBaseStaticdataPartyAncillaryParty> getAncillaryParty() {
        return ancillaryParty;
    }

    public CdmEventCommonTermsChangeInstruction ancillaryParty(List<CdmBaseStaticdataPartyAncillaryParty> ancillaryParty) {
        this.ancillaryParty = ancillaryParty;
        return this;
    }

    public CdmProductTemplateNonTransferableProduct getProduct() {
        return product;
    }

    public CdmEventCommonTermsChangeInstruction product(CdmProductTemplateNonTransferableProduct product) {
        this.product = product;
        return this;
    }

}
