package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("9nxo2eRqXyxzZZfEAnBS9nb3nZ5XHkEDKBwJEjrVGC4U")
public class LegalAgreementIdentification {
    public static String blueId() {
        return "9nxo2eRqXyxzZZfEAnBS9nb3nZ5XHkEDKBwJEjrVGC4U";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "LegalAgreementIdentification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/LegalAgreementIdentification";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/LegalAgreementIdentification.json";
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

    private AgreementName agreementName;

    private GoverningLawEnum governingLaw;

    private LegalAgreementPublisherEnum publisher;

    private BigInteger vintage;

    public String getNamespace() {
        return namespace;
    }

    public LegalAgreementIdentification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AgreementName getAgreementName() {
        return agreementName;
    }

    public LegalAgreementIdentification agreementName(AgreementName agreementName) {
        this.agreementName = agreementName;
        return this;
    }

    public GoverningLawEnum getGoverningLaw() {
        return governingLaw;
    }

    public LegalAgreementIdentification governingLaw(GoverningLawEnum governingLaw) {
        this.governingLaw = governingLaw;
        return this;
    }

    public LegalAgreementPublisherEnum getPublisher() {
        return publisher;
    }

    public LegalAgreementIdentification publisher(LegalAgreementPublisherEnum publisher) {
        this.publisher = publisher;
        return this;
    }

    public BigInteger getVintage() {
        return vintage;
    }

    public LegalAgreementIdentification vintage(BigInteger vintage) {
        this.vintage = vintage;
        return this;
    }

}
