package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6r7X1t4mk8pzhtyij1QDYaoMrseQxsRdHuJTw8dJaEk2")
public class ComRosettaModelMetafieldsReferenceWithMetaString {
    public static String blueId() {
        return "6r7X1t4mk8pzhtyij1QDYaoMrseQxsRdHuJTw8dJaEk2";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "com/rosetta/model/metafields/ReferenceWithMetaString";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/com/rosetta/model/metafields/ReferenceWithMetaString";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/comrosettamodelmetafieldsReferenceWithMetaString.json";
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

    public ComRosettaModelMetafieldsReferenceWithMetaString address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public ComRosettaModelMetafieldsReferenceWithMetaString externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public ComRosettaModelMetafieldsReferenceWithMetaString globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
