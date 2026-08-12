package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5ESTwQnVdcqtNiRWFUqxCTGYZMgBH6ebZjLM2Rsqy2PA")
public class CdmLegaldocumentationCommonUmbrellaAgreementEntity {
    public static String blueId() {
        return "5ESTwQnVdcqtNiRWFUqxCTGYZMgBH6ebZjLM2Rsqy2PA";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/legaldocumentation/common/UmbrellaAgreementEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/legaldocumentation/common/UmbrellaAgreementEntity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmlegaldocumentationcommonUmbrellaAgreementEntity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> entityId;

    private String terms;

    public List<ComRosettaModelFieldWithMetaString> getEntityId() {
        return entityId;
    }

    public CdmLegaldocumentationCommonUmbrellaAgreementEntity entityId(List<ComRosettaModelFieldWithMetaString> entityId) {
        this.entityId = entityId;
        return this;
    }

    public String getTerms() {
        return terms;
    }

    public CdmLegaldocumentationCommonUmbrellaAgreementEntity terms(String terms) {
        this.terms = terms;
        return this;
    }

}
