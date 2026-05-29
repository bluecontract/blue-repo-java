package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AigLwx62LVnAaUCTSyQdaTPe3RLV7PGmryRxnBmv5TsD")
public class CdmBaseDatetimePeriodBound {
    public static String blueId() {
        return "AigLwx62LVnAaUCTSyQdaTPe3RLV7PGmryRxnBmv5TsD";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/PeriodBound";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/PeriodBound";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimePeriodBound.json";
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

    private CdmBaseDatetimePeriod period;

    public Boolean getInclusive() {
        return inclusive;
    }

    public CdmBaseDatetimePeriodBound inclusive(Boolean inclusive) {
        this.inclusive = inclusive;
        return this;
    }

    public CdmBaseDatetimePeriod getPeriod() {
        return period;
    }

    public CdmBaseDatetimePeriodBound period(CdmBaseDatetimePeriod period) {
        this.period = period;
        return this;
    }

}
