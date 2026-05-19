package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("5zaNjCU9gDZuCtYkefS6oZc4LBUktdbBJMDrmze6C6Tk")
public class FloatingAmountEvents {
    public static String blueId() {
        return "5zaNjCU9gDZuCtYkefS6oZc4LBUktdbBJMDrmze6C6Tk";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FloatingAmountEvents";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FloatingAmountEvents";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FloatingAmountEvents.json";
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

    private AdditionalFixedPayments additionalFixedPayments;

    private Boolean failureToPayPrincipal;

    private FloatingAmountProvisions floatingAmountProvisions;

    private Boolean impliedWritedown;

    private InterestShortFall interestShortfall;

    private Boolean writedown;

    public String getNamespace() {
        return namespace;
    }

    public FloatingAmountEvents namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public AdditionalFixedPayments getAdditionalFixedPayments() {
        return additionalFixedPayments;
    }

    public FloatingAmountEvents additionalFixedPayments(AdditionalFixedPayments additionalFixedPayments) {
        this.additionalFixedPayments = additionalFixedPayments;
        return this;
    }

    public Boolean getFailureToPayPrincipal() {
        return failureToPayPrincipal;
    }

    public FloatingAmountEvents failureToPayPrincipal(Boolean failureToPayPrincipal) {
        this.failureToPayPrincipal = failureToPayPrincipal;
        return this;
    }

    public FloatingAmountProvisions getFloatingAmountProvisions() {
        return floatingAmountProvisions;
    }

    public FloatingAmountEvents floatingAmountProvisions(FloatingAmountProvisions floatingAmountProvisions) {
        this.floatingAmountProvisions = floatingAmountProvisions;
        return this;
    }

    public Boolean getImpliedWritedown() {
        return impliedWritedown;
    }

    public FloatingAmountEvents impliedWritedown(Boolean impliedWritedown) {
        this.impliedWritedown = impliedWritedown;
        return this;
    }

    public InterestShortFall getInterestShortfall() {
        return interestShortfall;
    }

    public FloatingAmountEvents interestShortfall(InterestShortFall interestShortfall) {
        this.interestShortfall = interestShortfall;
        return this;
    }

    public Boolean getWritedown() {
        return writedown;
    }

    public FloatingAmountEvents writedown(Boolean writedown) {
        this.writedown = writedown;
        return this;
    }

}
