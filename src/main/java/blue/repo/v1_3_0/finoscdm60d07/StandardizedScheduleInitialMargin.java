package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EhUL6kproowB33bnogx7YXDnxEP3KURUBxBufTcjFsoP")
public class StandardizedScheduleInitialMargin {
    public static String blueId() {
        return "EhUL6kproowB33bnogx7YXDnxEP3KURUBxBufTcjFsoP";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "StandardizedScheduleInitialMargin";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/StandardizedScheduleInitialMargin";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/StandardizedScheduleInitialMargin.json";
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

    private Money netInitialMargin;

    private List<StandardizedScheduleTradeInfo> tradeInfo;

    public String getNamespace() {
        return namespace;
    }

    public StandardizedScheduleInitialMargin namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Money getNetInitialMargin() {
        return netInitialMargin;
    }

    public StandardizedScheduleInitialMargin netInitialMargin(Money netInitialMargin) {
        this.netInitialMargin = netInitialMargin;
        return this;
    }

    public List<StandardizedScheduleTradeInfo> getTradeInfo() {
        return tradeInfo;
    }

    public StandardizedScheduleInitialMargin tradeInfo(List<StandardizedScheduleTradeInfo> tradeInfo) {
        this.tradeInfo = tradeInfo;
        return this;
    }

}
