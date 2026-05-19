package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("HBJ9SWMuWjtZMEREcj9YAk2puqPUWEcrRbiR8i9yEKYo")
public class EquityAdditionalTerms {
    public static String blueId() {
        return "HBJ9SWMuWjtZMEREcj9YAk2puqPUWEcrRbiR8i9yEKYo";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EquityAdditionalTerms";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EquityAdditionalTerms";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/EquityAdditionalTerms.json";
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

    private List<DeterminationRolesAndTerms> determinationTerms;

    private ExtraordinaryEvents extraordinaryEvents;

    private UnderlierSubstitutionProvision substitutionProvision;

    public String getNamespace() {
        return namespace;
    }

    public EquityAdditionalTerms namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<DeterminationRolesAndTerms> getDeterminationTerms() {
        return determinationTerms;
    }

    public EquityAdditionalTerms determinationTerms(List<DeterminationRolesAndTerms> determinationTerms) {
        this.determinationTerms = determinationTerms;
        return this;
    }

    public ExtraordinaryEvents getExtraordinaryEvents() {
        return extraordinaryEvents;
    }

    public EquityAdditionalTerms extraordinaryEvents(ExtraordinaryEvents extraordinaryEvents) {
        this.extraordinaryEvents = extraordinaryEvents;
        return this;
    }

    public UnderlierSubstitutionProvision getSubstitutionProvision() {
        return substitutionProvision;
    }

    public EquityAdditionalTerms substitutionProvision(UnderlierSubstitutionProvision substitutionProvision) {
        this.substitutionProvision = substitutionProvision;
        return this;
    }

}
