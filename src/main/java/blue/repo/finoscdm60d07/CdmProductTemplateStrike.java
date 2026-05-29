package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("CKT3kyXaVq6SVyuM2pEX4C4Qk3oDL3cB9Pgtq2JJWTYQ")
public class CdmProductTemplateStrike {
    public static String blueId() {
        return "CKT3kyXaVq6SVyuM2pEX4C4Qk3oDL3cB9Pgtq2JJWTYQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/Strike";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/Strike";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateStrike.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyPayerReceiverEnum buyer;

    private CdmBaseStaticdataPartyPayerReceiverEnum seller;

    private Double strikeRate;

    public CdmBaseStaticdataPartyPayerReceiverEnum getBuyer() {
        return buyer;
    }

    public CdmProductTemplateStrike buyer(CdmBaseStaticdataPartyPayerReceiverEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiverEnum getSeller() {
        return seller;
    }

    public CdmProductTemplateStrike seller(CdmBaseStaticdataPartyPayerReceiverEnum seller) {
        this.seller = seller;
        return this;
    }

    public Double getStrikeRate() {
        return strikeRate;
    }

    public CdmProductTemplateStrike strikeRate(Double strikeRate) {
        this.strikeRate = strikeRate;
        return this;
    }

}
