package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DwoZWzi3GY8e2kg8KfWsmD734pvUcV2e4fCboXbCb23H")
public class EUEMIREligibleCollateralEnum {
    public static String blueId() {
        return "DwoZWzi3GY8e2kg8KfWsmD734pvUcV2e4fCboXbCb23H";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EU_EMIR_EligibleCollateralEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EU_EMIR_EligibleCollateralEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EUEMIREligibleCollateralEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    public String getNamespace() {
        return namespace;
    }

    public EUEMIREligibleCollateralEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
