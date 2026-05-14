package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5R7EuXfdy4vmSUeFxAEqofYUptX3RvtdEed27shg1ywa")
public class Swp {
    public static String blueId() {
        return "5R7EuXfdy4vmSUeFxAEqofYUptX3RvtdEed27shg1ywa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Swp";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Swp";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Swp.json";
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

    private SwpIn swpIn;

    private SwpOut swpOut;

    public String getNamespace() {
        return namespace;
    }

    public Swp namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public SwpIn getSwpIn() {
        return swpIn;
    }

    public Swp swpIn(SwpIn swpIn) {
        this.swpIn = swpIn;
        return this;
    }

    public SwpOut getSwpOut() {
        return swpOut;
    }

    public Swp swpOut(SwpOut swpOut) {
        this.swpOut = swpOut;
        return this;
    }

}
