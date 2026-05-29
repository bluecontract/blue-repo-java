package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5tLUE25DSPGgtQtYVTYYskg3Ppz1DQwLqXqyedHebWvT")
public class APICall extends Source {
    public static String blueId() {
        return "5tLUE25DSPGgtQtYVTYYskg3Ppz1DQwLqXqyedHebWvT";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "API Call";
    }

    public static String qualifiedName() {
        return "Coordination/API Call";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/APICall.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String apiKeyId;

    public String getApiKeyId() {
        return apiKeyId;
    }

    public APICall apiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
        return this;
    }

}
