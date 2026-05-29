package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8ob5XfEjggmQWCgVGZrrfihRpPpUr2yZ4MepyJHJvZ4C")
public class CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessDayAdjustments {
    public static String blueId() {
        return "8ob5XfEjggmQWCgVGZrrfihRpPpUr2yZ4MepyJHJvZ4C";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/metafields/ReferenceWithMetaBusinessDayAdjustments";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/metafields/ReferenceWithMetaBusinessDayAdjustments";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimemetafieldsReferenceWithMetaBusinessDayAdjustments.json";
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

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessDayAdjustments address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessDayAdjustments externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmBaseDatetimeMetafieldsReferenceWithMetaBusinessDayAdjustments globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
