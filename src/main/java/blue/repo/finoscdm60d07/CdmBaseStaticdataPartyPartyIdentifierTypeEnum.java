package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HF2iBeqVB9K52LiqMfKwUtdriqmD7BQiewBjXBWpF763")
public class CdmBaseStaticdataPartyPartyIdentifierTypeEnum {
    public static String blueId() {
        return "HF2iBeqVB9K52LiqMfKwUtdriqmD7BQiewBjXBWpF763";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PartyIdentifierTypeEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PartyIdentifierTypeEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPartyIdentifierTypeEnum.json";
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
