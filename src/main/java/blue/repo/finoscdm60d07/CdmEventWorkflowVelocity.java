package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("B2QkNd6opHqfsBrrTAsNeuzDJGQoGukZ6M3oQ254E6ag")
public class CdmEventWorkflowVelocity {
    public static String blueId() {
        return "B2QkNd6opHqfsBrrTAsNeuzDJGQoGukZ6M3oQ254E6ag";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/Velocity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/Velocity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowVelocity.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimePeriodTimeEnum period;

    private BigInteger periodMultiplier;

    public CdmBaseDatetimePeriodTimeEnum getPeriod() {
        return period;
    }

    public CdmEventWorkflowVelocity period(CdmBaseDatetimePeriodTimeEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public CdmEventWorkflowVelocity periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
