package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("65gPA57fQDjNz6BqJxeCaUFu7wDhxpRktX2seB6isKCS")
public class CdmBaseStaticdataAssetCommonLoan {
    public static String blueId() {
        return "65gPA57fQDjNz6BqJxeCaUFu7wDhxpRktX2seB6isKCS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/Loan";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/Loan";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonLoan.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<CdmBaseStaticdataPartyLegalEntity> borrower;

    private String creditAgreementDate;

    private CdmBaseStaticdataPartyLegalEntity exchange;

    private ComRosettaModelFieldWithMetaString facilityType;

    private List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier;

    private CdmBaseStaticdataAssetCommonInstrumentTypeEnum instrumentType;

    private Boolean isExchangeListed;

    private ComRosettaModelFieldWithMetaString lien;

    private List<CdmBaseStaticdataPartyLegalEntity> relatedExchange;

    private List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy;

    private ComRosettaModelFieldWithMetaString tranche;

    public List<CdmBaseStaticdataPartyLegalEntity> getBorrower() {
        return borrower;
    }

    public CdmBaseStaticdataAssetCommonLoan borrower(List<CdmBaseStaticdataPartyLegalEntity> borrower) {
        this.borrower = borrower;
        return this;
    }

    public String getCreditAgreementDate() {
        return creditAgreementDate;
    }

    public CdmBaseStaticdataAssetCommonLoan creditAgreementDate(String creditAgreementDate) {
        this.creditAgreementDate = creditAgreementDate;
        return this;
    }

    public CdmBaseStaticdataPartyLegalEntity getExchange() {
        return exchange;
    }

    public CdmBaseStaticdataAssetCommonLoan exchange(CdmBaseStaticdataPartyLegalEntity exchange) {
        this.exchange = exchange;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getFacilityType() {
        return facilityType;
    }

    public CdmBaseStaticdataAssetCommonLoan facilityType(ComRosettaModelFieldWithMetaString facilityType) {
        this.facilityType = facilityType;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonAssetIdentifier> getIdentifier() {
        return identifier;
    }

    public CdmBaseStaticdataAssetCommonLoan identifier(List<CdmBaseStaticdataAssetCommonAssetIdentifier> identifier) {
        this.identifier = identifier;
        return this;
    }

    public CdmBaseStaticdataAssetCommonInstrumentTypeEnum getInstrumentType() {
        return instrumentType;
    }

    public CdmBaseStaticdataAssetCommonLoan instrumentType(CdmBaseStaticdataAssetCommonInstrumentTypeEnum instrumentType) {
        this.instrumentType = instrumentType;
        return this;
    }

    public Boolean getIsExchangeListed() {
        return isExchangeListed;
    }

    public CdmBaseStaticdataAssetCommonLoan isExchangeListed(Boolean isExchangeListed) {
        this.isExchangeListed = isExchangeListed;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getLien() {
        return lien;
    }

    public CdmBaseStaticdataAssetCommonLoan lien(ComRosettaModelFieldWithMetaString lien) {
        this.lien = lien;
        return this;
    }

    public List<CdmBaseStaticdataPartyLegalEntity> getRelatedExchange() {
        return relatedExchange;
    }

    public CdmBaseStaticdataAssetCommonLoan relatedExchange(List<CdmBaseStaticdataPartyLegalEntity> relatedExchange) {
        this.relatedExchange = relatedExchange;
        return this;
    }

    public List<CdmBaseStaticdataAssetCommonTaxonomy> getTaxonomy() {
        return taxonomy;
    }

    public CdmBaseStaticdataAssetCommonLoan taxonomy(List<CdmBaseStaticdataAssetCommonTaxonomy> taxonomy) {
        this.taxonomy = taxonomy;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getTranche() {
        return tranche;
    }

    public CdmBaseStaticdataAssetCommonLoan tranche(ComRosettaModelFieldWithMetaString tranche) {
        this.tranche = tranche;
        return this;
    }

}
