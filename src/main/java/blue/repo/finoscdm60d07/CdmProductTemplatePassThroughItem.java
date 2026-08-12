package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FoDT7cNJEYDkT5SzaBjzFL5dzMuykqTbTUBrJeog8V9M")
public class CdmProductTemplatePassThroughItem {
    public static String blueId() {
        return "FoDT7cNJEYDkT5SzaBjzFL5dzMuykqTbTUBrJeog8V9M";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/PassThroughItem";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/PassThroughItem";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplatePassThroughItem.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Double passThroughPercentage;

    private CdmBaseStaticdataPartyPayerReceiver payerReceiver;

    public Double getPassThroughPercentage() {
        return passThroughPercentage;
    }

    public CdmProductTemplatePassThroughItem passThroughPercentage(Double passThroughPercentage) {
        this.passThroughPercentage = passThroughPercentage;
        return this;
    }

    public CdmBaseStaticdataPartyPayerReceiver getPayerReceiver() {
        return payerReceiver;
    }

    public CdmProductTemplatePassThroughItem payerReceiver(CdmBaseStaticdataPartyPayerReceiver payerReceiver) {
        this.payerReceiver = payerReceiver;
        return this;
    }

}
