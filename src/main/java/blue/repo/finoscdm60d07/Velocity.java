package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("9m8iU68c2rKp3CZJbJVYuYVAQ52vAoUwpfDQqiBqiW4g")
public class Velocity {
    public static String blueId() {
        return "9m8iU68c2rKp3CZJbJVYuYVAQ52vAoUwpfDQqiBqiW4g";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Velocity";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Velocity";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Velocity.json";
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

    private PeriodTimeEnum period;

    private BigInteger periodMultiplier;

    public String getNamespace() {
        return namespace;
    }

    public Velocity namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public PeriodTimeEnum getPeriod() {
        return period;
    }

    public Velocity period(PeriodTimeEnum period) {
        this.period = period;
        return this;
    }

    public BigInteger getPeriodMultiplier() {
        return periodMultiplier;
    }

    public Velocity periodMultiplier(BigInteger periodMultiplier) {
        this.periodMultiplier = periodMultiplier;
        return this;
    }

}
