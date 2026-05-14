package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("CPZqHFnDjiBbZzZqeKPJkXPnudgTpyFkZ4Rojh9ZkKYa")
public class ValuationPostponement {
    public static String blueId() {
        return "CPZqHFnDjiBbZzZqeKPJkXPnudgTpyFkZ4Rojh9ZkKYa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ValuationPostponement";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ValuationPostponement";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ValuationPostponement.json";
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

    private BigInteger maximumDaysOfPostponement;

    public String getNamespace() {
        return namespace;
    }

    public ValuationPostponement namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public BigInteger getMaximumDaysOfPostponement() {
        return maximumDaysOfPostponement;
    }

    public ValuationPostponement maximumDaysOfPostponement(BigInteger maximumDaysOfPostponement) {
        this.maximumDaysOfPostponement = maximumDaysOfPostponement;
        return this;
    }

}
