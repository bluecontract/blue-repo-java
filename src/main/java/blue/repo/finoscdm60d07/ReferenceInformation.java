package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6s62Kfzgpw2cGJ7hn9Nfw6MPdobJKATNNAxzk3rCuyTE")
public class ReferenceInformation {
    public static String blueId() {
        return "6s62Kfzgpw2cGJ7hn9Nfw6MPdobJKATNNAxzk3rCuyTE";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ReferenceInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ReferenceInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ReferenceInformation.json";
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

    private Boolean allGuarantees;

    private Boolean noReferenceObligation;

    private LegalEntity referenceEntity;

    private List<ReferenceObligation> referenceObligation;

    private Boolean referencePolicy;

    private Price referencePrice;

    private Boolean securedList;

    private Boolean unknownReferenceObligation;

    public String getNamespace() {
        return namespace;
    }

    public ReferenceInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Boolean getAllGuarantees() {
        return allGuarantees;
    }

    public ReferenceInformation allGuarantees(Boolean allGuarantees) {
        this.allGuarantees = allGuarantees;
        return this;
    }

    public Boolean getNoReferenceObligation() {
        return noReferenceObligation;
    }

    public ReferenceInformation noReferenceObligation(Boolean noReferenceObligation) {
        this.noReferenceObligation = noReferenceObligation;
        return this;
    }

    public LegalEntity getReferenceEntity() {
        return referenceEntity;
    }

    public ReferenceInformation referenceEntity(LegalEntity referenceEntity) {
        this.referenceEntity = referenceEntity;
        return this;
    }

    public List<ReferenceObligation> getReferenceObligation() {
        return referenceObligation;
    }

    public ReferenceInformation referenceObligation(List<ReferenceObligation> referenceObligation) {
        this.referenceObligation = referenceObligation;
        return this;
    }

    public Boolean getReferencePolicy() {
        return referencePolicy;
    }

    public ReferenceInformation referencePolicy(Boolean referencePolicy) {
        this.referencePolicy = referencePolicy;
        return this;
    }

    public Price getReferencePrice() {
        return referencePrice;
    }

    public ReferenceInformation referencePrice(Price referencePrice) {
        this.referencePrice = referencePrice;
        return this;
    }

    public Boolean getSecuredList() {
        return securedList;
    }

    public ReferenceInformation securedList(Boolean securedList) {
        this.securedList = securedList;
        return this;
    }

    public Boolean getUnknownReferenceObligation() {
        return unknownReferenceObligation;
    }

    public ReferenceInformation unknownReferenceObligation(Boolean unknownReferenceObligation) {
        this.unknownReferenceObligation = unknownReferenceObligation;
        return this;
    }

}
