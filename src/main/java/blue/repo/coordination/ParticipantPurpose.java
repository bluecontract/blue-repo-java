package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("8bWEiYoHwoJ55sw6Z7UvFoZ1ir9SQKaNruPGctCJD3G3")
public class ParticipantPurpose {
    public static String blueId() {
        return "8bWEiYoHwoJ55sw6Z7UvFoZ1ir9SQKaNruPGctCJD3G3";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Participant Purpose";
    }

    public static String qualifiedName() {
        return "Coordination/Participant Purpose";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/ParticipantPurpose.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Actor participant;

    private List<PurposeStatement> statements;

    public Actor getParticipant() {
        return participant;
    }

    public ParticipantPurpose participant(Actor participant) {
        this.participant = participant;
        return this;
    }

    public List<PurposeStatement> getStatements() {
        return statements;
    }

    public ParticipantPurpose statements(List<PurposeStatement> statements) {
        this.statements = statements;
        return this;
    }

}
