package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("BUhco6CQs6AuL1wXvMQJ1XRok4Nwovp2ZTBx2rWbwVQZ")
public class CreditLimitUtilisationPosition {
    public static String blueId() {
        return "BUhco6CQs6AuL1wXvMQJ1XRok4Nwovp2ZTBx2rWbwVQZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditLimitUtilisationPosition";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditLimitUtilisationPosition";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/CreditLimitUtilisationPosition.json";
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

    private Double global;

    private Double longPosition;

    private Double shortPosition;

    public String getNamespace() {
        return namespace;
    }

    public CreditLimitUtilisationPosition namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Double getGlobal() {
        return global;
    }

    public CreditLimitUtilisationPosition global(Double global) {
        this.global = global;
        return this;
    }

    public Double getLongPosition() {
        return longPosition;
    }

    public CreditLimitUtilisationPosition longPosition(Double longPosition) {
        this.longPosition = longPosition;
        return this;
    }

    public Double getShortPosition() {
        return shortPosition;
    }

    public CreditLimitUtilisationPosition shortPosition(Double shortPosition) {
        this.shortPosition = shortPosition;
        return this;
    }

}
