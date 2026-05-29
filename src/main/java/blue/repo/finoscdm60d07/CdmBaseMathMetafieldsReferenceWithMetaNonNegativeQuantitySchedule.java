package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3QpANvMr6891ZuV6c8Yze7qcCyqbKRhy9zqwHuMkw8FP")
public class CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule {
    public static String blueId() {
        return "3QpANvMr6891ZuV6c8Yze7qcCyqbKRhy9zqwHuMkw8FP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/metafields/ReferenceWithMetaNonNegativeQuantitySchedule";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/metafields/ReferenceWithMetaNonNegativeQuantitySchedule";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathmetafieldsReferenceWithMetaNonNegativeQuantitySchedule.json";
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

    public CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule address(ComRosettaModelLibMetaReference address) {
        this.address = address;
        return this;
    }

    public String getExternalReference() {
        return externalReference;
    }

    public CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule externalReference(String externalReference) {
        this.externalReference = externalReference;
        return this;
    }

    public String getGlobalReference() {
        return globalReference;
    }

    public CdmBaseMathMetafieldsReferenceWithMetaNonNegativeQuantitySchedule globalReference(String globalReference) {
        this.globalReference = globalReference;
        return this;
    }

}
