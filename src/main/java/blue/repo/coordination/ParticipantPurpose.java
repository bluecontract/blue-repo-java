package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("9ZR7JFpcb5Eq2PHG5yK9XY3VTbygfaCoCQL4CnTFTpqE")
public class ParticipantPurpose {
    public static String blueId() {
        return "9ZR7JFpcb5Eq2PHG5yK9XY3VTbygfaCoCQL4CnTFTpqE";
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
