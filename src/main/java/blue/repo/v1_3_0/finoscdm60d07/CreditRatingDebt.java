package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AXHTKJy9PjH2RuTgt3rM57Sua5ve3ekfxJLUKJsH9PS4")
public class CreditRatingDebt {
    public static String blueId() {
        return "AXHTKJy9PjH2RuTgt3rM57Sua5ve3ekfxJLUKJsH9PS4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "CreditRatingDebt";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/CreditRatingDebt";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/CreditRatingDebt.json";
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

    private FieldWithMetaString debtType;

    private MultipleDebtTypes debtTypes;

    public String getNamespace() {
        return namespace;
    }

    public CreditRatingDebt namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaString getDebtType() {
        return debtType;
    }

    public CreditRatingDebt debtType(FieldWithMetaString debtType) {
        this.debtType = debtType;
        return this;
    }

    public MultipleDebtTypes getDebtTypes() {
        return debtTypes;
    }

    public CreditRatingDebt debtTypes(MultipleDebtTypes debtTypes) {
        this.debtTypes = debtTypes;
        return this;
    }

}
