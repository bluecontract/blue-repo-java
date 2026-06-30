package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HA8fmtXcNJxs3hXa88H9PHchDg6hgAFvto4VVdW1aZmf")
public class CdmBaseStaticdataPartyBuyerSeller {
    public static String blueId() {
        return "HA8fmtXcNJxs3hXa88H9PHchDg6hgAFvto4VVdW1aZmf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/BuyerSeller";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/BuyerSeller";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyBuyerSeller.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyCounterpartyRoleEnum buyer;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum seller;

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getBuyer() {
        return buyer;
    }

    public CdmBaseStaticdataPartyBuyerSeller buyer(CdmBaseStaticdataPartyCounterpartyRoleEnum buyer) {
        this.buyer = buyer;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getSeller() {
        return seller;
    }

    public CdmBaseStaticdataPartyBuyerSeller seller(CdmBaseStaticdataPartyCounterpartyRoleEnum seller) {
        this.seller = seller;
        return this;
    }

}
