package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BAE1eBo45e6hGLUodA2WtfVVLFVTNwNN96sJUJA9VtRW")
public class ContractualDefinitionsEnum {
    public static String blueId() {
        return "BAE1eBo45e6hGLUodA2WtfVVLFVTNwNN96sJUJA9VtRW";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ContractualDefinitionsEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ContractualDefinitionsEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ContractualDefinitionsEnum.json";
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

    public ContractualDefinitionsEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
