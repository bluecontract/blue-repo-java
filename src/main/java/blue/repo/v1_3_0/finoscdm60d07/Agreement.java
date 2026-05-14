package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Eos2VLUj9ae27jhydpeNDUp5UUEwyey6k5mFTqSttmJJ")
public class Agreement {
    public static String blueId() {
        return "Eos2VLUj9ae27jhydpeNDUp5UUEwyey6k5mFTqSttmJJ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Agreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Agreement";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Agreement.json";
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

    private CollateralTransferAgreementElections collateralTransferAgreementElections;

    private CreditSupportAgreementElections creditSupportAgreementElections;

    private MasterAgreementSchedule masterAgreementSchedule;

    private SecurityAgreementElections securityAgreementElections;

    private TransactionAdditionalTerms transactionAdditionalTerms;

    public String getNamespace() {
        return namespace;
    }

    public Agreement namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CollateralTransferAgreementElections getCollateralTransferAgreementElections() {
        return collateralTransferAgreementElections;
    }

    public Agreement collateralTransferAgreementElections(CollateralTransferAgreementElections collateralTransferAgreementElections) {
        this.collateralTransferAgreementElections = collateralTransferAgreementElections;
        return this;
    }

    public CreditSupportAgreementElections getCreditSupportAgreementElections() {
        return creditSupportAgreementElections;
    }

    public Agreement creditSupportAgreementElections(CreditSupportAgreementElections creditSupportAgreementElections) {
        this.creditSupportAgreementElections = creditSupportAgreementElections;
        return this;
    }

    public MasterAgreementSchedule getMasterAgreementSchedule() {
        return masterAgreementSchedule;
    }

    public Agreement masterAgreementSchedule(MasterAgreementSchedule masterAgreementSchedule) {
        this.masterAgreementSchedule = masterAgreementSchedule;
        return this;
    }

    public SecurityAgreementElections getSecurityAgreementElections() {
        return securityAgreementElections;
    }

    public Agreement securityAgreementElections(SecurityAgreementElections securityAgreementElections) {
        this.securityAgreementElections = securityAgreementElections;
        return this;
    }

    public TransactionAdditionalTerms getTransactionAdditionalTerms() {
        return transactionAdditionalTerms;
    }

    public Agreement transactionAdditionalTerms(TransactionAdditionalTerms transactionAdditionalTerms) {
        this.transactionAdditionalTerms = transactionAdditionalTerms;
        return this;
    }

}
