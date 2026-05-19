package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5UcZ1b4Dht52s43hVKsGkCirgy1ctgrt9pBmFmTCU7mg")
public class Account {
    public static String blueId() {
        return "5UcZ1b4Dht52s43hVKsGkCirgy1ctgrt9pBmFmTCU7mg";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Account";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Account";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Account.json";
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

    private ReferenceWithMetaParty accountBeneficiary;

    private FieldWithMetaString accountName;

    private FieldWithMetaString accountNumber;

    private FieldWithMetaAccountTypeEnum accountType;

    private ReferenceWithMetaParty partyReference;

    private ReferenceWithMetaParty servicingParty;

    public String getNamespace() {
        return namespace;
    }

    public Account namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public ReferenceWithMetaParty getAccountBeneficiary() {
        return accountBeneficiary;
    }

    public Account accountBeneficiary(ReferenceWithMetaParty accountBeneficiary) {
        this.accountBeneficiary = accountBeneficiary;
        return this;
    }

    public FieldWithMetaString getAccountName() {
        return accountName;
    }

    public Account accountName(FieldWithMetaString accountName) {
        this.accountName = accountName;
        return this;
    }

    public FieldWithMetaString getAccountNumber() {
        return accountNumber;
    }

    public Account accountNumber(FieldWithMetaString accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public FieldWithMetaAccountTypeEnum getAccountType() {
        return accountType;
    }

    public Account accountType(FieldWithMetaAccountTypeEnum accountType) {
        this.accountType = accountType;
        return this;
    }

    public ReferenceWithMetaParty getPartyReference() {
        return partyReference;
    }

    public Account partyReference(ReferenceWithMetaParty partyReference) {
        this.partyReference = partyReference;
        return this;
    }

    public ReferenceWithMetaParty getServicingParty() {
        return servicingParty;
    }

    public Account servicingParty(ReferenceWithMetaParty servicingParty) {
        this.servicingParty = servicingParty;
        return this;
    }

}
