package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2YmGLtgJ5as5H64M8bRYDDRaGWwqzAGqrQSSzEm1Jvjm")
public class CdmBaseStaticdataPartyAncillaryRoleEnum {
    public static String blueId() {
        return "2YmGLtgJ5as5H64M8bRYDDRaGWwqzAGqrQSSzEm1Jvjm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/AncillaryRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/AncillaryRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyAncillaryRoleEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
