package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("GxxotN29XVfjKcNo4ke23A5Ncowncgu7Y3d3CMevM24E")
public class UnderlierSubstitutionProvision {
    public static String blueId() {
        return "GxxotN29XVfjKcNo4ke23A5Ncowncgu7Y3d3CMevM24E";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "UnderlierSubstitutionProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/UnderlierSubstitutionProvision";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/UnderlierSubstitutionProvision.json";
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

    private CounterpartyRoleEnum disputingParty;

    private List<Clause> substitutionBeSpokeTerms;

    private List<ExtraordinaryEvents> substitutionTriggerEvents;

    private List<CounterpartyRoleEnum> whoMaySubstitute;

    public String getNamespace() {
        return namespace;
    }

    public UnderlierSubstitutionProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CounterpartyRoleEnum getDisputingParty() {
        return disputingParty;
    }

    public UnderlierSubstitutionProvision disputingParty(CounterpartyRoleEnum disputingParty) {
        this.disputingParty = disputingParty;
        return this;
    }

    public List<Clause> getSubstitutionBeSpokeTerms() {
        return substitutionBeSpokeTerms;
    }

    public UnderlierSubstitutionProvision substitutionBeSpokeTerms(List<Clause> substitutionBeSpokeTerms) {
        this.substitutionBeSpokeTerms = substitutionBeSpokeTerms;
        return this;
    }

    public List<ExtraordinaryEvents> getSubstitutionTriggerEvents() {
        return substitutionTriggerEvents;
    }

    public UnderlierSubstitutionProvision substitutionTriggerEvents(List<ExtraordinaryEvents> substitutionTriggerEvents) {
        this.substitutionTriggerEvents = substitutionTriggerEvents;
        return this;
    }

    public List<CounterpartyRoleEnum> getWhoMaySubstitute() {
        return whoMaySubstitute;
    }

    public UnderlierSubstitutionProvision whoMaySubstitute(List<CounterpartyRoleEnum> whoMaySubstitute) {
        this.whoMaySubstitute = whoMaySubstitute;
        return this;
    }

}
