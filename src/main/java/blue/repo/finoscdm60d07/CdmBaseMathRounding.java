package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("BYetgNwutc7xjHHx9g7ZhsdKgyGYMd1UR4jDoHHafJHj")
public class CdmBaseMathRounding {
    public static String blueId() {
        return "BYetgNwutc7xjHHx9g7ZhsdKgyGYMd1UR4jDoHHafJHj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/Rounding";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/Rounding";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathRounding.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private BigInteger precision;

    private CdmBaseMathRoundingDirectionEnum roundingDirection;

    public BigInteger getPrecision() {
        return precision;
    }

    public CdmBaseMathRounding precision(BigInteger precision) {
        this.precision = precision;
        return this;
    }

    public CdmBaseMathRoundingDirectionEnum getRoundingDirection() {
        return roundingDirection;
    }

    public CdmBaseMathRounding roundingDirection(CdmBaseMathRoundingDirectionEnum roundingDirection) {
        this.roundingDirection = roundingDirection;
        return this;
    }

}
