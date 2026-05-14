package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("58QNtQWMVii9ZL5wry3xnDvAeocYhHwzSNJjWg7E1q7R")
public class ClearingInstruction {
    public static String blueId() {
        return "58QNtQWMVii9ZL5wry3xnDvAeocYhHwzSNJjWg7E1q7R";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ClearingInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ClearingInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ClearingInstruction.json";
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

    private TradeState alphaContract;

    private Party clearerParty1;

    private Party clearerParty2;

    private Party clearingParty;

    private Boolean isOpenOffer;

    private Party party1;

    private Party party2;

    public String getNamespace() {
        return namespace;
    }

    public ClearingInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public TradeState getAlphaContract() {
        return alphaContract;
    }

    public ClearingInstruction alphaContract(TradeState alphaContract) {
        this.alphaContract = alphaContract;
        return this;
    }

    public Party getClearerParty1() {
        return clearerParty1;
    }

    public ClearingInstruction clearerParty1(Party clearerParty1) {
        this.clearerParty1 = clearerParty1;
        return this;
    }

    public Party getClearerParty2() {
        return clearerParty2;
    }

    public ClearingInstruction clearerParty2(Party clearerParty2) {
        this.clearerParty2 = clearerParty2;
        return this;
    }

    public Party getClearingParty() {
        return clearingParty;
    }

    public ClearingInstruction clearingParty(Party clearingParty) {
        this.clearingParty = clearingParty;
        return this;
    }

    public Boolean getIsOpenOffer() {
        return isOpenOffer;
    }

    public ClearingInstruction isOpenOffer(Boolean isOpenOffer) {
        this.isOpenOffer = isOpenOffer;
        return this;
    }

    public Party getParty1() {
        return party1;
    }

    public ClearingInstruction party1(Party party1) {
        this.party1 = party1;
        return this;
    }

    public Party getParty2() {
        return party2;
    }

    public ClearingInstruction party2(Party party2) {
        this.party2 = party2;
        return this;
    }

}
