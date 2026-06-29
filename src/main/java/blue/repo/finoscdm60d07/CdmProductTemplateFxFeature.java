package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HPRsaReKQuhsZQyFweRGJshuiWo9hd1r6CsmkM6iPQnN")
public class CdmProductTemplateFxFeature {
    public static String blueId() {
        return "HPRsaReKQuhsZQyFweRGJshuiWo9hd1r6CsmkM6iPQnN";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/FxFeature";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/FxFeature";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateFxFeature.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateComposite composite;

    private CdmProductTemplateComposite crossCurrency;

    private CdmProductTemplateQuanto quanto;

    private ComRosettaModelFieldWithMetaString referenceCurrency;

    public CdmProductTemplateComposite getComposite() {
        return composite;
    }

    public CdmProductTemplateFxFeature composite(CdmProductTemplateComposite composite) {
        this.composite = composite;
        return this;
    }

    public CdmProductTemplateComposite getCrossCurrency() {
        return crossCurrency;
    }

    public CdmProductTemplateFxFeature crossCurrency(CdmProductTemplateComposite crossCurrency) {
        this.crossCurrency = crossCurrency;
        return this;
    }

    public CdmProductTemplateQuanto getQuanto() {
        return quanto;
    }

    public CdmProductTemplateFxFeature quanto(CdmProductTemplateQuanto quanto) {
        this.quanto = quanto;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getReferenceCurrency() {
        return referenceCurrency;
    }

    public CdmProductTemplateFxFeature referenceCurrency(ComRosettaModelFieldWithMetaString referenceCurrency) {
        this.referenceCurrency = referenceCurrency;
        return this;
    }

}
