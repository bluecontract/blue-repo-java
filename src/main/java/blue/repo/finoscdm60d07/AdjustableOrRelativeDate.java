package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EyM4AiDvCUnNVdLazwb7Uv92fNmhXK5jtMaaMe7ZXRKz")
public class AdjustableOrRelativeDate {
    public static String blueId() {
        return "EyM4AiDvCUnNVdLazwb7Uv92fNmhXK5jtMaaMe7ZXRKz";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "AdjustableOrRelativeDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/AdjustableOrRelativeDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/AdjustableOrRelativeDate.json";
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

    private AdjustableDate adjustableDate;

    private AdjustedRelativeDateOffset relativeDate;

    public String getNamespace() {
        return namespace;
    }

    public AdjustableOrRelativeDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdjustableDate getAdjustableDate() {
        return adjustableDate;
    }

    public AdjustableOrRelativeDate adjustableDate(AdjustableDate adjustableDate) {
        this.adjustableDate = adjustableDate;
        return this;
    }

    public AdjustedRelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    public AdjustableOrRelativeDate relativeDate(AdjustedRelativeDateOffset relativeDate) {
        this.relativeDate = relativeDate;
        return this;
    }

}
