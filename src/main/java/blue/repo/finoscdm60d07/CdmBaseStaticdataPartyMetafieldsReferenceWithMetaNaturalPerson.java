package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AqRajqKToreHabAHCgT66Zc87qk24EdQSawSThmGb9Eu")
public class CdmBaseStaticdataPartyMetafieldsReferenceWithMetaNaturalPerson {
    public static String blueId() {
        return "AqRajqKToreHabAHCgT66Zc87qk24EdQSawSThmGb9Eu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/metafields/ReferenceWithMetaNaturalPerson";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/metafields/ReferenceWithMetaNaturalPerson";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartymetafieldsReferenceWithMetaNaturalPerson.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelLibMetaReference address;

    private String externalReference;

    private String globalReference;

    public ComRosettaModelLibMetaReference getAddress() {
        return address;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaNaturalPerson address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaNaturalPerson externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmBaseStaticdataPartyMetafieldsReferenceWithMetaNaturalPerson globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
