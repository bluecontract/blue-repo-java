package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3hu7ThhcUgckpgzxCZ5zppbe7ByzLnYVa5C2eK77konf")
public class StrikeSpread {
    public static String blueId() {
        return "3hu7ThhcUgckpgzxCZ5zppbe7ByzLnYVa5C2eK77konf";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StrikeSpread";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StrikeSpread";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/StrikeSpread.json";
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

    private OptionStrike upperStrike;

    private Double upperStrikeNumberOfOptions;

    public String getNamespace() {
        return namespace;
    }

    public StrikeSpread namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public OptionStrike getUpperStrike() {
        return upperStrike;
    }

    public StrikeSpread upperStrike(OptionStrike upperStrike) {
        this.upperStrike = upperStrike;
        return this;
    }

    public Double getUpperStrikeNumberOfOptions() {
        return upperStrikeNumberOfOptions;
    }

    public StrikeSpread upperStrikeNumberOfOptions(Double upperStrikeNumberOfOptions) {
        this.upperStrikeNumberOfOptions = upperStrikeNumberOfOptions;
        return this;
    }

}
