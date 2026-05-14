package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4jimL9GhgsD2PN3VLesokoLpSneZRAyZqAYtpTkaguGe")
public class TerminationProvision {
    public static String blueId() {
        return "4jimL9GhgsD2PN3VLesokoLpSneZRAyZqAYtpTkaguGe";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TerminationProvision";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TerminationProvision";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/TerminationProvision.json";
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

    private CancelableProvision cancelableProvision;

    private EarlyTerminationProvision earlyTerminationProvision;

    private EvergreenProvision evergreenProvision;

    private ExtendibleProvision extendibleProvision;

    public String getNamespace() {
        return namespace;
    }

    public TerminationProvision namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public CancelableProvision getCancelableProvision() {
        return cancelableProvision;
    }

    public TerminationProvision cancelableProvision(CancelableProvision cancelableProvision) {
        this.cancelableProvision = cancelableProvision;
        return this;
    }

    public EarlyTerminationProvision getEarlyTerminationProvision() {
        return earlyTerminationProvision;
    }

    public TerminationProvision earlyTerminationProvision(EarlyTerminationProvision earlyTerminationProvision) {
        this.earlyTerminationProvision = earlyTerminationProvision;
        return this;
    }

    public EvergreenProvision getEvergreenProvision() {
        return evergreenProvision;
    }

    public TerminationProvision evergreenProvision(EvergreenProvision evergreenProvision) {
        this.evergreenProvision = evergreenProvision;
        return this;
    }

    public ExtendibleProvision getExtendibleProvision() {
        return extendibleProvision;
    }

    public TerminationProvision extendibleProvision(ExtendibleProvision extendibleProvision) {
        this.extendibleProvision = extendibleProvision;
        return this;
    }

}
