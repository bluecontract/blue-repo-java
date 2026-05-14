package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4WHcnjNzfDhcouxnovj55LxdzR8HSPWN5eQgVjvJgfkQ")
public class ExerciseNotice {
    public static String blueId() {
        return "4WHcnjNzfDhcouxnovj55LxdzR8HSPWN5eQgVjvJgfkQ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ExerciseNotice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ExerciseNotice";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/ExerciseNotice.json";
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

    private FieldWithMetaBusinessCenterEnum businessCenter;

    private ExerciseNoticeGiverEnum exerciseNoticeGiver;

    private AncillaryRoleEnum exerciseNoticeReceiver;

    public String getNamespace() {
        return namespace;
    }

    public ExerciseNotice namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public FieldWithMetaBusinessCenterEnum getBusinessCenter() {
        return businessCenter;
    }

    public ExerciseNotice businessCenter(FieldWithMetaBusinessCenterEnum businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public ExerciseNoticeGiverEnum getExerciseNoticeGiver() {
        return exerciseNoticeGiver;
    }

    public ExerciseNotice exerciseNoticeGiver(ExerciseNoticeGiverEnum exerciseNoticeGiver) {
        this.exerciseNoticeGiver = exerciseNoticeGiver;
        return this;
    }

    public AncillaryRoleEnum getExerciseNoticeReceiver() {
        return exerciseNoticeReceiver;
    }

    public ExerciseNotice exerciseNoticeReceiver(AncillaryRoleEnum exerciseNoticeReceiver) {
        this.exerciseNoticeReceiver = exerciseNoticeReceiver;
        return this;
    }

}
