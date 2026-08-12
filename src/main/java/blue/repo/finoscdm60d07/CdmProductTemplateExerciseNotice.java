package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("87nUue1ru1iHhXaB5EjL62TAsMV9t3vSvVB3X7XvwPH6")
public class CdmProductTemplateExerciseNotice {
    public static String blueId() {
        return "87nUue1ru1iHhXaB5EjL62TAsMV9t3vSvVB3X7XvwPH6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/ExerciseNotice";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/ExerciseNotice";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateExerciseNotice.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseDatetimeFieldWithMetaBusinessCenterEnum businessCenter;

    private CdmProductTemplateExerciseNoticeGiverEnum exerciseNoticeGiver;

    private CdmBaseStaticdataPartyAncillaryRoleEnum exerciseNoticeReceiver;

    public CdmBaseDatetimeFieldWithMetaBusinessCenterEnum getBusinessCenter() {
        return businessCenter;
    }

    public CdmProductTemplateExerciseNotice businessCenter(CdmBaseDatetimeFieldWithMetaBusinessCenterEnum businessCenter) {
        this.businessCenter = businessCenter;
        return this;
    }

    public CdmProductTemplateExerciseNoticeGiverEnum getExerciseNoticeGiver() {
        return exerciseNoticeGiver;
    }

    public CdmProductTemplateExerciseNotice exerciseNoticeGiver(CdmProductTemplateExerciseNoticeGiverEnum exerciseNoticeGiver) {
        this.exerciseNoticeGiver = exerciseNoticeGiver;
        return this;
    }

    public CdmBaseStaticdataPartyAncillaryRoleEnum getExerciseNoticeReceiver() {
        return exerciseNoticeReceiver;
    }

    public CdmProductTemplateExerciseNotice exerciseNoticeReceiver(CdmBaseStaticdataPartyAncillaryRoleEnum exerciseNoticeReceiver) {
        this.exerciseNoticeReceiver = exerciseNoticeReceiver;
        return this;
    }

}
