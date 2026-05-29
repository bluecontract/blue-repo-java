package blue.repo.common;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("HSvngEMxS34qTVo3TNufgbR7pLcZY9gq94FNLdHeGKaZ")
public class Payment extends Document {
    public static String blueId() {
        return "HSvngEMxS34qTVo3TNufgbR7pLcZY9gq94FNLdHeGKaZ";
    }

    public static String packageName() {
        return "Common";
    }

    public static String typeName() {
        return "Payment";
    }

    public static String qualifiedName() {
        return "Common/Payment";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Common/Payment.json";
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
