package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("CAahZQqje6w7bjtSQPgjcNzeW74xkPhMtdiRsHHqCHRX")
public class GeneralTerms {
    public static String blueId() {
        return "CAahZQqje6w7bjtSQPgjcNzeW74xkPhMtdiRsHHqCHRX";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "GeneralTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/GeneralTerms";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/GeneralTerms.json";
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

    private List<FieldWithMetaString> additionalTerm;

    private BasketReferenceInformation basketReferenceInformation;

    private CreditIndex indexReferenceInformation;

    private Boolean modifiedEquityDelivery;

    private ReferenceInformation referenceInformation;

    private Boolean substitution;

    public String getNamespace() {
        return namespace;
    }

    public GeneralTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getAdditionalTerm() {
        return additionalTerm;
    }

    public GeneralTerms additionalTerm(List<FieldWithMetaString> additionalTerm) {
        this.additionalTerm = additionalTerm;
        return this;
    }

    public BasketReferenceInformation getBasketReferenceInformation() {
        return basketReferenceInformation;
    }

    public GeneralTerms basketReferenceInformation(BasketReferenceInformation basketReferenceInformation) {
        this.basketReferenceInformation = basketReferenceInformation;
        return this;
    }

    public CreditIndex getIndexReferenceInformation() {
        return indexReferenceInformation;
    }

    public GeneralTerms indexReferenceInformation(CreditIndex indexReferenceInformation) {
        this.indexReferenceInformation = indexReferenceInformation;
        return this;
    }

    public Boolean getModifiedEquityDelivery() {
        return modifiedEquityDelivery;
    }

    public GeneralTerms modifiedEquityDelivery(Boolean modifiedEquityDelivery) {
        this.modifiedEquityDelivery = modifiedEquityDelivery;
        return this;
    }

    public ReferenceInformation getReferenceInformation() {
        return referenceInformation;
    }

    public GeneralTerms referenceInformation(ReferenceInformation referenceInformation) {
        this.referenceInformation = referenceInformation;
        return this;
    }

    public Boolean getSubstitution() {
        return substitution;
    }

    public GeneralTerms substitution(Boolean substitution) {
        this.substitution = substitution;
        return this;
    }

}
