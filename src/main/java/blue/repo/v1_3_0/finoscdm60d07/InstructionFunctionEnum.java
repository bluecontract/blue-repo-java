package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DJyDVUtbAm3aB42cffvd9PJiRzqQGamVaewS7jhbj6u9")
public class InstructionFunctionEnum {
    public static String blueId() {
        return "DJyDVUtbAm3aB42cffvd9PJiRzqQGamVaewS7jhbj6u9";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InstructionFunctionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InstructionFunctionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/InstructionFunctionEnum.json";
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

    public InstructionFunctionEnum namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

}
