package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Ci7ty5zffGzjgsQdhnezMazESuasmjVRABXcDJanwgLf")
public class CdmBaseStaticdataPartyAccount {
    public static String blueId() {
        return "Ci7ty5zffGzjgsQdhnezMazESuasmjVRABXcDJanwgLf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/Account";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/Account";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyAccount.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty accountBeneficiary;

    private ComRosettaModelFieldWithMetaString accountName;

    private ComRosettaModelFieldWithMetaString accountNumber;

    private CdmBaseStaticdataPartyFieldWithMetaAccountTypeEnum accountType;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference;

    private CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty servicingParty;

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getAccountBeneficiary() {
        return accountBeneficiary;
    }

    public CdmBaseStaticdataPartyAccount accountBeneficiary(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty accountBeneficiary) {
        this.accountBeneficiary = accountBeneficiary;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getAccountName() {
        return accountName;
    }

    public CdmBaseStaticdataPartyAccount accountName(ComRosettaModelFieldWithMetaString accountName) {
        this.accountName = accountName;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getAccountNumber() {
        return accountNumber;
    }

    public CdmBaseStaticdataPartyAccount accountNumber(ComRosettaModelFieldWithMetaString accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public CdmBaseStaticdataPartyFieldWithMetaAccountTypeEnum getAccountType() {
        return accountType;
    }

    public CdmBaseStaticdataPartyAccount accountType(CdmBaseStaticdataPartyFieldWithMetaAccountTypeEnum accountType) {
        this.accountType = accountType;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public CdmBaseStaticdataPartyAccount partyReference(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty getServicingParty() {
        return servicingParty;
    }

    public CdmBaseStaticdataPartyAccount servicingParty(CdmBaseStaticdataPartyMetafieldsReferenceWithMetaParty servicingParty) {
        this.servicingParty = servicingParty;
        return this;
    }

}
