package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("34yZnruVzk2TWwJj25VXtQ6vJsyoHWmMQdFWUBQGYp1x")
public class CdmLegaldocumentationCommonUmbrellaAgreement {
    public static String blueId() {
        return "34yZnruVzk2TWwJj25VXtQ6vJsyoHWmMQdFWUBQGYp1x";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/UmbrellaAgreement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/UmbrellaAgreement";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonUmbrellaAgreement.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean isApplicable;

    private String language;

    private List<CdmLegaldocumentationCommonUmbrellaAgreementEntity> parties;

    public Boolean getIsApplicable() {
        return isApplicable;
    }

    public CdmLegaldocumentationCommonUmbrellaAgreement isApplicable(Boolean isApplicable) {
        this.isApplicable = isApplicable;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public CdmLegaldocumentationCommonUmbrellaAgreement language(String language) {
        this.language = language;
        return this;
    }

    public List<CdmLegaldocumentationCommonUmbrellaAgreementEntity> getParties() {
        return parties;
    }

    public CdmLegaldocumentationCommonUmbrellaAgreement parties(List<CdmLegaldocumentationCommonUmbrellaAgreementEntity> parties) {
        this.parties = parties;
        return this;
    }

}
