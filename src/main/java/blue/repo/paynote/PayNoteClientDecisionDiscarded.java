package blue.repo.paynote;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.common.Timestamp;
import blue.repo.conversation.Event;

@TypeBlueId("Da7ZSyWgvMyTfwDVhAgCkGf3H8dwHhouHsHgNzg3DZ2j")
public class PayNoteClientDecisionDiscarded extends Event {
    public static String blueId() {
        return "Da7ZSyWgvMyTfwDVhAgCkGf3H8dwHhouHsHgNzg3DZ2j";
    }

    public static String packageName() {
        return "PayNote";
    }

    public static String typeName() {
        return "PayNote Client Decision Discarded";
    }

    public static String qualifiedName() {
        return "PayNote/PayNote Client Decision Discarded";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/PayNote/PayNoteClientDecisionDiscarded.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String decision;

    private String reason;

    private Timestamp decisionAt;

    public String getDecision() {
        return decision;
    }

    public PayNoteClientDecisionDiscarded decision(String decision) {
        this.decision = decision;
        return this;
    }

    public String getReason() {
        return reason;
    }

    public PayNoteClientDecisionDiscarded reason(String reason) {
        this.reason = reason;
        return this;
    }

    public Timestamp getDecisionAt() {
        return decisionAt;
    }

    public PayNoteClientDecisionDiscarded decisionAt(Timestamp decisionAt) {
        this.decisionAt = decisionAt;
        return this;
    }

}
