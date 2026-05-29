package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7SGwopxFbqfpY4pUVSVacVy17tPE1Tt2uxCumG3BoF27")
public class Request extends Document {
    public static String blueId() {
        return "7SGwopxFbqfpY4pUVSVacVy17tPE1Tt2uxCumG3BoF27";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Request";
    }

    public static String qualifiedName() {
        return "Common/Request";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Request.json";
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
