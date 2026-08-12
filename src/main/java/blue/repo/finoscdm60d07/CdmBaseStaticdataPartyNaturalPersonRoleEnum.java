package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4YDv7wz1byKMYqB3FrNK86Sa3ZHPr1PqHrYRhQYzuYLu")
public class CdmBaseStaticdataPartyNaturalPersonRoleEnum {
    public static String blueId() {
        return "4YDv7wz1byKMYqB3FrNK86Sa3ZHPr1PqHrYRhQYzuYLu";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/NaturalPersonRoleEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/NaturalPersonRoleEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyNaturalPersonRoleEnum.json";
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
