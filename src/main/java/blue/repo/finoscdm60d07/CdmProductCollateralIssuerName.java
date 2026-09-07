package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9jC3KJhuctgW4SgmH2YS2UJtF27L59NFiWjza7R55Ho4")
public class CdmProductCollateralIssuerName {
    public static String blueId() {
        return "9jC3KJhuctgW4SgmH2YS2UJtF27L59NFiWjza7R55Ho4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/IssuerName";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/IssuerName";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralIssuerName.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyLegalEntity issuerName;

    public CdmBaseStaticdataPartyLegalEntity getIssuerName() {
        return issuerName;
    }

    public CdmProductCollateralIssuerName issuerName(CdmBaseStaticdataPartyLegalEntity issuerName) {
        this.issuerName = issuerName;
        return this;
    }

}
