package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("J5hsqA8x6vAprJRs7gFhvm5bsp5TZNBgEdhytAapat8y")
public class CdmBaseStaticdataPartyLegalEntity {
    public static String blueId() {
        return "J5hsqA8x6vAprJRs7gFhvm5bsp5TZNBgEdhytAapat8y";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/LegalEntity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/LegalEntity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyLegalEntity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<ComRosettaModelFieldWithMetaString> entityId;

    public List<ComRosettaModelFieldWithMetaString> getEntityId() {
        return entityId;
    }

    public CdmBaseStaticdataPartyLegalEntity entityId(List<ComRosettaModelFieldWithMetaString> entityId) {
        this.entityId = entityId;
        return this;
    }

}
