package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BEj7NeQ1KmrSoRpwdQvBz69ovp9genXGJ6mpLGXYYwHz")
public class CdmBaseStaticdataPartyPersonIdentifierTypeEnum {
    public static String blueId() {
        return "BEj7NeQ1KmrSoRpwdQvBz69ovp9genXGJ6mpLGXYYwHz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PersonIdentifierTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PersonIdentifierTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPersonIdentifierTypeEnum.json";
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
