package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("8p1vMWCA7VEoeAswXYP9yUFGd3HxbVB48WeGbQNmrJYw")
public class CdmEventCommonInstructionFunctionEnum {
    public static String blueId() {
        return "8p1vMWCA7VEoeAswXYP9yUFGd3HxbVB48WeGbQNmrJYw";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/InstructionFunctionEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/InstructionFunctionEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonInstructionFunctionEnum.json";
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
