package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GuePBwWCdiGPjeqEuhFTCuK9gmCypcjx2yXWbbxAZaKj")
public class CdmProductCollateralListingExchange {
    public static String blueId() {
        return "GuePBwWCdiGPjeqEuhFTCuK9gmCypcjx2yXWbbxAZaKj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/ListingExchange";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/ListingExchange";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralListingExchange.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> exchange;

    public List<ComRosettaModelFieldWithMetaString> getExchange() {
        return exchange;
    }

    public CdmProductCollateralListingExchange exchange(List<ComRosettaModelFieldWithMetaString> exchange) {
        this.exchange = exchange;
        return this;
    }

}
