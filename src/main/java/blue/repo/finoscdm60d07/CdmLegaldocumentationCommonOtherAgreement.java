package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GE6qm5PBmvHfw43wjqHzwDzRT2sJ2JyQQuoiKYtRV6RE")
public class CdmLegaldocumentationCommonOtherAgreement {
    public static String blueId() {
        return "GE6qm5PBmvHfw43wjqHzwDzRT2sJ2JyQQuoiKYtRV6RE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/OtherAgreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/OtherAgreement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonOtherAgreement.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String date;

    private ComRosettaModelFieldWithMetaString identifier;

    private ComRosettaModelFieldWithMetaString otherAgreementType;

    private ComRosettaModelFieldWithMetaString version;

    public String getDate() {
        return date;
    }

    public CdmLegaldocumentationCommonOtherAgreement date(String date) {
        this.date = date;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getIdentifier() {
        return identifier;
    }

    public CdmLegaldocumentationCommonOtherAgreement identifier(ComRosettaModelFieldWithMetaString identifier) {
        this.identifier = identifier;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getOtherAgreementType() {
        return otherAgreementType;
    }

    public CdmLegaldocumentationCommonOtherAgreement otherAgreementType(ComRosettaModelFieldWithMetaString otherAgreementType) {
        this.otherAgreementType = otherAgreementType;
        return this;
    }

    public ComRosettaModelFieldWithMetaString getVersion() {
        return version;
    }

    public CdmLegaldocumentationCommonOtherAgreement version(ComRosettaModelFieldWithMetaString version) {
        this.version = version;
        return this;
    }

}
