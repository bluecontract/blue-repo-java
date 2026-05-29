package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EEy3XcQkPgCWJbBTZ5xCt324t2pFRJU6q9odJm19McMd")
public class CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDate {
    public static String blueId() {
        return "EEy3XcQkPgCWJbBTZ5xCt324t2pFRJU6q9odJm19McMd";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/metafields/ReferenceWithMetaAdjustableOrRelativeDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/metafields/ReferenceWithMetaAdjustableOrRelativeDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimemetafieldsReferenceWithMetaAdjustableOrRelativeDate.json";
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

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDate address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDate externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaAdjustableOrRelativeDate globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
