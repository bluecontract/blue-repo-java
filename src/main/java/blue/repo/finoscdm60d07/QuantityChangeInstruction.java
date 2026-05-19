package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("Bi1RP9sBGiA58sEevRkPDUC311vFvwFGx6Eaym2qMwgt")
public class QuantityChangeInstruction {
    public static String blueId() {
        return "Bi1RP9sBGiA58sEevRkPDUC311vFvwFGx6Eaym2qMwgt";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "QuantityChangeInstruction";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/QuantityChangeInstruction";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/QuantityChangeInstruction.json";
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

    private List<PriceQuantity> change;

    private QuantityChangeDirectionEnum direction;

    private List<Identifier> lotIdentifier;

    public String getNamespace() {
        return namespace;
    }

    public QuantityChangeInstruction namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<PriceQuantity> getChange() {
        return change;
    }

    public QuantityChangeInstruction change(List<PriceQuantity> change) {
        this.change = change;
        return this;
    }

    public QuantityChangeDirectionEnum getDirection() {
        return direction;
    }

    public QuantityChangeInstruction direction(QuantityChangeDirectionEnum direction) {
        this.direction = direction;
        return this;
    }

    public List<Identifier> getLotIdentifier() {
        return lotIdentifier;
    }

    public QuantityChangeInstruction lotIdentifier(List<Identifier> lotIdentifier) {
        this.lotIdentifier = lotIdentifier;
        return this;
    }

}
