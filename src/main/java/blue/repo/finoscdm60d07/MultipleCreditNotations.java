package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("5Ctp1gkb5fPgzV9qmU6h2a6iEMPTyrTMGbYpfCsgBjr2")
public class MultipleCreditNotations {
    public static String blueId() {
        return "5Ctp1gkb5fPgzV9qmU6h2a6iEMPTyrTMGbYpfCsgBjr2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "MultipleCreditNotations";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/MultipleCreditNotations";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/MultipleCreditNotations.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private QuantifierEnum condition;

    private List<FieldWithMetaCreditNotation> creditNotation;

    private CreditNotationMismatchResolutionEnum mismatchResolution;

    private CreditRatingAgencyEnum referenceAgency;

    public String getNamespace() {
        return namespace;
    }

    public MultipleCreditNotations namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public QuantifierEnum getCondition() {
        return condition;
    }

    public MultipleCreditNotations condition(QuantifierEnum condition) {
        this.condition = condition;
        return this;
    }

    public List<FieldWithMetaCreditNotation> getCreditNotation() {
        return creditNotation;
    }

    public MultipleCreditNotations creditNotation(List<FieldWithMetaCreditNotation> creditNotation) {
        this.creditNotation = creditNotation;
        return this;
    }

    public CreditNotationMismatchResolutionEnum getMismatchResolution() {
        return mismatchResolution;
    }

    public MultipleCreditNotations mismatchResolution(CreditNotationMismatchResolutionEnum mismatchResolution) {
        this.mismatchResolution = mismatchResolution;
        return this;
    }

    public CreditRatingAgencyEnum getReferenceAgency() {
        return referenceAgency;
    }

    public MultipleCreditNotations referenceAgency(CreditRatingAgencyEnum referenceAgency) {
        this.referenceAgency = referenceAgency;
        return this;
    }

}
