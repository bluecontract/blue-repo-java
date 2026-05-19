package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("EVgp9YqpNEEAKJ6zejQEdWosYA5WtcDyhgTFxeycdfBE#0")
public class Clause {
    public static String blueId() {
        return "EVgp9YqpNEEAKJ6zejQEdWosYA5WtcDyhgTFxeycdfBE#0";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Clause";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Clause";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Clause.json";
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

    private String identifier;

    private List<Clause> subcomponents;

    private String terms;

    public String getNamespace() {
        return namespace;
    }

    public Clause namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getIdentifier() {
        return identifier;
    }

    public Clause identifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public List<Clause> getSubcomponents() {
        return subcomponents;
    }

    public Clause subcomponents(List<Clause> subcomponents) {
        this.subcomponents = subcomponents;
        return this;
    }

    public String getTerms() {
        return terms;
    }

    public Clause terms(String terms) {
        this.terms = terms;
        return this;
    }

}
