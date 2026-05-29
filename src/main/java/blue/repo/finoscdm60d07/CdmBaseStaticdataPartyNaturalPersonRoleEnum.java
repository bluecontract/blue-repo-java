package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9tPoADpnGiVnU2BMMT67cyTxq9y2NNP7pnrEYowvURZm")
public class CdmBaseStaticdataPartyNaturalPersonRoleEnum {
    public static String blueId() {
        return "9tPoADpnGiVnU2BMMT67cyTxq9y2NNP7pnrEYowvURZm";
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
