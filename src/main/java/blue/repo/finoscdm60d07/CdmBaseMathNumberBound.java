package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("GNwk3nidjLwe1LhWBtBPRxoTtHf6cFhxWBE77ggP8XnL")
public class CdmBaseMathNumberBound {
    public static String blueId() {
        return "GNwk3nidjLwe1LhWBtBPRxoTtHf6cFhxWBE77ggP8XnL";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/math/NumberBound";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/math/NumberBound";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasemathNumberBound.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Boolean inclusive;

    private Double number;

    public Boolean getInclusive() {
        return inclusive;
    }

    public CdmBaseMathNumberBound inclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }

    public Double getNumber() {
        return number;
    }

    public CdmBaseMathNumberBound number(Double number) {
        this.number = number;
        return this;
    }

}
