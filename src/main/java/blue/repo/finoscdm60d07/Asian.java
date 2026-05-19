package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("B43kqK9t7QEfxKFoXSfqtaTVa4rRhWcgrnurL7T4ebWj")
public class Asian {
    public static String blueId() {
        return "B43kqK9t7QEfxKFoXSfqtaTVa4rRhWcgrnurL7T4ebWj";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Asian";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Asian";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Asian.json";
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

    private AveragingInOutEnum averagingInOut;

    private AveragingPeriod averagingPeriodIn;

    private AveragingPeriod averagingPeriodOut;

    private Double strikeFactor;

    public String getNamespace() {
        return namespace;
    }

    public Asian namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AveragingInOutEnum getAveragingInOut() {
        return averagingInOut;
    }

    public Asian averagingInOut(AveragingInOutEnum averagingInOut) {
        this.averagingInOut = averagingInOut;
        return this;
    }

    public AveragingPeriod getAveragingPeriodIn() {
        return averagingPeriodIn;
    }

    public Asian averagingPeriodIn(AveragingPeriod averagingPeriodIn) {
        this.averagingPeriodIn = averagingPeriodIn;
        return this;
    }

    public AveragingPeriod getAveragingPeriodOut() {
        return averagingPeriodOut;
    }

    public Asian averagingPeriodOut(AveragingPeriod averagingPeriodOut) {
        this.averagingPeriodOut = averagingPeriodOut;
        return this;
    }

    public Double getStrikeFactor() {
        return strikeFactor;
    }

    public Asian strikeFactor(Double strikeFactor) {
        this.strikeFactor = strikeFactor;
        return this;
    }

}
