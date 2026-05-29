package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("F2nvaUqNbFKSuzYyyhRM8m7PgfFhFvkDbejeQWX9jYCs")
public class CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDates {
    public static String blueId() {
        return "F2nvaUqNbFKSuzYyyhRM8m7PgfFhFvkDbejeQWX9jYCs";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/metafields/ReferenceWithMetaAdjustableOrRelativeDates";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/metafields/ReferenceWithMetaAdjustableOrRelativeDates";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimemetafieldsReferenceWithMetaAdjustableOrRelativeDates.json";
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

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDates address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDates externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDates globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
