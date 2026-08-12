package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("6SkJg8pab5GVfz2xgkk28fvdNU2iQBgrKksnGCuFMJZw")
public class CdmBaseStaticdataPartyPayerReceiverEnum {
    public static String blueId() {
        return "6SkJg8pab5GVfz2xgkk28fvdNU2iQBgrKksnGCuFMJZw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PayerReceiverEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PayerReceiverEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPayerReceiverEnum.json";
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
