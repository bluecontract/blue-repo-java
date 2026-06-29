package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5ZkYvwfLfiF71H4xx4uG96T64QSNJTzuohdaDKaDJbbY")
public class CdmEventCommonClearingInstruction {
    public static String blueId() {
        return "5ZkYvwfLfiF71H4xx4uG96T64QSNJTzuohdaDKaDJbbY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/ClearingInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/ClearingInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonClearingInstruction.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmEventCommonTradeState alphaContract;

    private CdmBaseStaticdataPartyParty clearerParty1;

    private CdmBaseStaticdataPartyParty clearerParty2;

    private CdmBaseStaticdataPartyParty clearingParty;

    private Boolean isOpenOffer;

    private CdmBaseStaticdataPartyParty party1;

    private CdmBaseStaticdataPartyParty party2;

    public CdmEventCommonTradeState getAlphaContract() {
        return alphaContract;
    }

    public CdmEventCommonClearingInstruction alphaContract(CdmEventCommonTradeState alphaContract) {
        this.alphaContract = alphaContract;
        return this;
    }

    public CdmBaseStaticdataPartyParty getClearerParty1() {
        return clearerParty1;
    }

    public CdmEventCommonClearingInstruction clearerParty1(CdmBaseStaticdataPartyParty clearerParty1) {
        this.clearerParty1 = clearerParty1;
        return this;
    }

    public CdmBaseStaticdataPartyParty getClearerParty2() {
        return clearerParty2;
    }

    public CdmEventCommonClearingInstruction clearerParty2(CdmBaseStaticdataPartyParty clearerParty2) {
        this.clearerParty2 = clearerParty2;
        return this;
    }

    public CdmBaseStaticdataPartyParty getClearingParty() {
        return clearingParty;
    }

    public CdmEventCommonClearingInstruction clearingParty(CdmBaseStaticdataPartyParty clearingParty) {
        this.clearingParty = clearingParty;
        return this;
    }

    public Boolean getIsOpenOffer() {
        return isOpenOffer;
    }

    public CdmEventCommonClearingInstruction isOpenOffer(Boolean isOpenOffer) {
        this.isOpenOffer = isOpenOffer;
        return this;
    }

    public CdmBaseStaticdataPartyParty getParty1() {
        return party1;
    }

    public CdmEventCommonClearingInstruction party1(CdmBaseStaticdataPartyParty party1) {
        this.party1 = party1;
        return this;
    }

    public CdmBaseStaticdataPartyParty getParty2() {
        return party2;
    }

    public CdmEventCommonClearingInstruction party2(CdmBaseStaticdataPartyParty party2) {
        this.party2 = party2;
        return this;
    }

}
