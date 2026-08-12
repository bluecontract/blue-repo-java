package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3doqr3EiMTivS3UTJcEVyjxNAVfAULrMtrVVvpoMSQW6")
public class CdmProductTemplateTerminationProvision {
    public static String blueId() {
        return "3doqr3EiMTivS3UTJcEVyjxNAVfAULrMtrVVvpoMSQW6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/TerminationProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/TerminationProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateTerminationProvision.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateCancelableProvision cancelableProvision;

    private CdmProductTemplateEarlyTerminationProvision earlyTerminationProvision;

    private CdmProductTemplateEvergreenProvision evergreenProvision;

    private CdmProductTemplateExtendibleProvision extendibleProvision;

    public CdmProductTemplateCancelableProvision getCancelableProvision() {
        return cancelableProvision;
    }

    public CdmProductTemplateTerminationProvision cancelableProvision(CdmProductTemplateCancelableProvision cancelableProvision) {
        this.cancelableProvision = cancelableProvision;
        return this;
    }

    public CdmProductTemplateEarlyTerminationProvision getEarlyTerminationProvision() {
        return earlyTerminationProvision;
    }

    public CdmProductTemplateTerminationProvision earlyTerminationProvision(CdmProductTemplateEarlyTerminationProvision earlyTerminationProvision) {
        this.earlyTerminationProvision = earlyTerminationProvision;
        return this;
    }

    public CdmProductTemplateEvergreenProvision getEvergreenProvision() {
        return evergreenProvision;
    }

    public CdmProductTemplateTerminationProvision evergreenProvision(CdmProductTemplateEvergreenProvision evergreenProvision) {
        this.evergreenProvision = evergreenProvision;
        return this;
    }

    public CdmProductTemplateExtendibleProvision getExtendibleProvision() {
        return extendibleProvision;
    }

    public CdmProductTemplateTerminationProvision extendibleProvision(CdmProductTemplateExtendibleProvision extendibleProvision) {
        this.extendibleProvision = extendibleProvision;
        return this;
    }

}
