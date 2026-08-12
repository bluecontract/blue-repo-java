package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BApNNpkEWkpGYmRsjYdSM2AQSRDGM9rcMKnHxtvv7U79")
public class CdmProductTemplateCallingPartyEnum {
    public static String blueId() {
        return "BApNNpkEWkpGYmRsjYdSM2AQSRDGM9rcMKnHxtvv7U79";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/CallingPartyEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/CallingPartyEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateCallingPartyEnum.json";
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
