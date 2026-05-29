package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6eYoofdAibUdi9DT8tvNo7PNJF1DxZcM4UrQwinBs3mk")
public class CdmProductTemplateConstituentWeight {
    public static String blueId() {
        return "6eYoofdAibUdi9DT8tvNo7PNJF1DxZcM4UrQwinBs3mk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ConstituentWeight";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ConstituentWeight";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateConstituentWeight.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double basketPercentage;

    private Double openUnits;

    public Double getBasketPercentage() {
        return basketPercentage;
    }

    public CdmProductTemplateConstituentWeight basketPercentage(Double basketPercentage) {
        this.basketPercentage = basketPercentage;
        return this;
    }

    public Double getOpenUnits() {
        return openUnits;
    }

    public CdmProductTemplateConstituentWeight openUnits(Double openUnits) {
        this.openUnits = openUnits;
        return this;
    }

}
