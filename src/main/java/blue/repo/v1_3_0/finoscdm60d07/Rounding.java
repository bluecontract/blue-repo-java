package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("FVu5RjukdCMpkCtoN39tLH9myXLM65Xm7U13S2nUvuXV")
public class Rounding {
    public static String blueId() {
        return "FVu5RjukdCMpkCtoN39tLH9myXLM65Xm7U13S2nUvuXV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Rounding";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Rounding";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Rounding.json";
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

    private BigInteger precision;

    private RoundingDirectionEnum roundingDirection;

    public String getNamespace() {
        return namespace;
    }

    public Rounding namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getPrecision() {
        return precision;
    }

    public Rounding precision(BigInteger precision) {
        this.precision = precision;
        return this;
    }

    public RoundingDirectionEnum getRoundingDirection() {
        return roundingDirection;
    }

    public Rounding roundingDirection(RoundingDirectionEnum roundingDirection) {
        this.roundingDirection = roundingDirection;
        return this;
    }

}
