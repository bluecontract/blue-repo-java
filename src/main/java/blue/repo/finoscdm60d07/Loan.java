package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Acmd2pVZCZzABtWqDeWpdpcPBRnH1ZAep9VjCNqQU8r1")
public class Loan {
    public static String blueId() {
        return "Acmd2pVZCZzABtWqDeWpdpcPBRnH1ZAep9VjCNqQU8r1";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Loan";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Loan";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Loan.json";
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

    private List<LegalEntity> borrower;

    private String creditAgreementDate;

    private LegalEntity exchange;

    private FieldWithMetaString facilityType;

    private List<AssetIdentifier> identifier;

    private InstrumentTypeEnum instrumentType;

    private Boolean isExchangeListed;

    private FieldWithMetaString lien;

    private List<LegalEntity> relatedExchange;

    private List<Taxonomy> taxonomy;

    private FieldWithMetaString tranche;

    public String getNamespace() {
        return namespace;
    }

    public Loan namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<LegalEntity> getBorrower() {
        return borrower;
    }

    public Loan borrower(List<LegalEntity> borrower) {
        this.borrower = borrower;
        return this;
    }

    public String getCreditAgreementDate() {
        return creditAgreementDate;
    }

    public Loan creditAgreementDate(String creditAgreementDate) {
        this.creditAgreementDate = creditAgreementDate;
        return this;
    }

    public LegalEntity getExchange() {
        return exchange;
    }

    public Loan exchange(LegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public FieldWithMetaString getFacilityType() {
        return facilityType;
    }

    public Loan facilityType(FieldWithMetaString facilityType) {
        this.facilityType = facilityType;
        return this;
    }

    public List<AssetIdentifier> getIdentifier() {
        return identifier;
    }

    public Loan identifier(List<AssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public InstrumentTypeEnum getInstrumentType() {
        return instrumentType;
    }

    public Loan instrumentType(InstrumentTypeEnum instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public Loan isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public FieldWithMetaString getLien() {
        return lien;
    }

    public Loan lien(FieldWithMetaString lien) {
        this.lien = lien;
        return this;
    }

    public List<LegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public Loan relatedExchange(List<LegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<Taxonomy> getTaxonomy() {
        return taxonomy;
    }

    public Loan taxonomy(List<Taxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    public FieldWithMetaString getTranche() {
        return tranche;
    }

    public Loan tranche(FieldWithMetaString tranche) {
        this.tranche = tranche;
        return this;
    }

}
